# Arquitetura do Sistema

## Pacotes 

1. **model**
   - Contém as classes que representam as entidades do banco de dados.
   
2. **repository**
   - Contém as interfaces que estendem `JpaRepository` para acesso aos dados.

3. **service**
   - Contém as classes de serviço que implementam a lógica de negócio.

4. **controller**
   - Contém as classes que expõem os endpoints da API.

5. **dto**
   - Contém as classes de transferência de dados (DTOs) para comunicação entre as camadas.

6. **exception**
   - Contém as classes de exceção personalizadas.

7. **config**
   - Contém classes de configuração, como segurança e configurações do Spring Boot.

---
## Classes e Métodos

#### Pacote `model`

- **Usuario**
   Atributos: `id`, `nome`, `email`, `endereco`
   Relacionamentos: `EnderecoUsuario`

- **EnderecoUsuario**
   Atributos: `id`, `rua`, `numero`, `bairro`, `cidade`, `estado`, `cep`

- **Atelier**
   Atributos: `id`, `nome`, `endereco`, `dono`
   Relacionamentos: `EnderecoAtelier`, `DonoAtelier`

- **EnderecoAtelier**
   Atributos: `id`, `rua`, `numero`, `bairro`, `cidade`, `estado`, `cep`

- **DonoAtelier**
   Atributos: `id`, `nome`, `email`, `telefone`

- **Produto**
   Atributos: `id`, `nome`, `descricao`, `preco`, `atelier`
   Relacionamentos: `Atelier`

- **Servico**
   Atributos: `id`, `nome`, `descricao`, `preco`, `atelier`
   Relacionamentos: `Atelier`

- **Pedido**
   Atributos: `id`, `usuario`, `dataPedido`, `formaPagamento`, `itens`
   Relacionamentos: `Usuario`, `FormaPagamento`, `ItemPedido`

- **ItemPedido**
   Atributos: `id`, `produto`, `servico`, `quantidade`, `preco`
   Relacionamentos: `Produto`, `Servico`, `Pedido`

- **FormaPagamento**
   Atributos: `id`, `nome`

---
#### Pacote `repository`

- **UsuarioRepository**
   Métodos: `findByEmail`, `findByNomeContaining`

- **AtelierRepository**
   Métodos: `findByNomeContaining`, `findByDono`

- **ProdutoRepository**
   Métodos: `findByNomeContaining`, `findByAtelier`

- **ServicoRepository**
   Métodos: `findByNomeContaining`, `findByAtelier`

- **PedidoRepository**
   Métodos: `findByUsuario`, `findByDataPedidoBetween`

- **FormaPagamentoRepository**
   Métodos: `findByNome`

---
#### Pacote `service`

- **UsuarioService**
   Métodos: `cadastrarUsuario`, `buscarUsuarioPorId`, `atualizarUsuario`, `deletarUsuario`

- **AtelierService**
   Métodos: `cadastrarAtelier`, `buscarAtelierPorId`, `atualizarAtelier`, `deletarAtelier`

- **ProdutoService**
   Métodos: `cadastrarProduto`, `buscarProdutoPorId`, `atualizarProduto`, `deletarProduto`

- **ServicoService**
   Métodos: `cadastrarServico`, `buscarServicoPorId`, `atualizarServico`, `deletarServico`

- **PedidoService**
   Métodos: `realizarPedido`, `buscarPedidoPorId`, `cancelarPedido`

- **FormaPagamentoService**
   Métodos: `cadastrarFormaPagamento`, `buscarFormaPagamentoPorId`, `deletarFormaPagamento`

---
#### Pacote `controller`

- **UsuarioController**
   Endpoints: `POST /usuarios`, `GET /usuarios/{id}`, `PUT /usuarios/{id}`, `DELETE /usuarios/{id}`

- **AtelierController**
   Endpoints: `POST /ateliers`, `GET /ateliers/{id}`, `PUT /ateliers/{id}`, `DELETE /ateliers/{id}`

- **ProdutoController**
   Endpoints: `POST /produtos`, `GET /produtos/{id}`, `PUT /produtos/{id}`, `DELETE /produtos/{id}`

- **ServicoController**
   Endpoints: `POST /servicos`, `GET /servicos/{id}`, `PUT /servicos/{id}`, `DELETE /servicos/{id}`

- **PedidoController**
   Endpoints: `POST /pedidos`, `GET /pedidos/{id}`, `DELETE /pedidos/{id}`

- **FormaPagamentoController**
   Endpoints: `POST /formas-pagamento`, `GET /formas-pagamento/{id}`, `DELETE /formas-pagamento/{id}`

---
#### Pacote `dto`

- **UsuarioDTO**
   Atributos: `nome`, `email`, `endereco`

- **AtelierDTO**
   Atributos: `nome`, `endereco`, `dono`

- **ProdutoDTO**
   Atributos: `nome`, `descricao`, `preco`, `atelierId`

- **ServicoDTO**
   Atributos: `nome`, `descricao`, `preco`, `atelierId`

- **PedidoDTO**
   Atributos: `usuarioId`, `formaPagamentoId`, `itens`

- **ItemPedidoDTO**
   Atributos: `produtoId`, `servicoId`, `quantidade`, `preco`

- **FormaPagamentoDTO**
   Atributos: `nome`

---
#### Pacote `exception`

- **ResourceNotFoundException**
   Exceção personalizada para recursos não encontrados.

- **ValidationException**
   Exceção personalizada para erros de validação.

---
#### Pacote `config`

- **SecurityConfig**
   Configurações de segurança para a API.

- **SwaggerConfig**
  - Configurações para documentação da API com Swagger.

---
## Princípios SOLID

1. **Single Responsibility Principle (SRP)**
   - Cada classe tem uma única responsabilidade. Por exemplo, `UsuarioService` lida apenas com a lógica de negócio relacionada a usuários.

2. **Open/Closed Principle (OCP)**
   - As classes estão abertas para extensão, mas fechadas para modificação. Novas funcionalidades podem ser adicionadas sem alterar o código existente.

3. **Liskov Substitution Principle (LSP)**
   - As subclasses podem substituir suas classes base sem alterar o comportamento do programa.

4. **Interface Segregation Principle (ISP)**
   - Interfaces são específicas para cada cliente. Por exemplo, `UsuarioRepository` tem métodos específicos para usuários.

5. **Dependency Inversion Principle (DIP)**
   - Módulos de alto nível não dependem de módulos de baixo nível. Ambos dependem de abstrações. Por exemplo, `UsuarioService` depende de `UsuarioRepository`, que é uma interface.

Essa estrutura permite uma fácil manutenção, **escalabilidade e integração com diferentes dispositivos**.


