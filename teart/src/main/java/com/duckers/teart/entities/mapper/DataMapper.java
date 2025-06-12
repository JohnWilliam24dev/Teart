package com.duckers.teart.entities.mapper;


import com.duckers.teart.entities.*;
import com.duckers.teart.models.*;

import java.util.stream.Collectors;

public class DataMapper {

        public static Atelier toEntity(AtelierModel m) {
            if (m == null) return null;
            Atelier e = new Atelier();
            e.setId(m.getId());
            e.getNome().setText(m.getNome());
            e.getCnpj().setCNPJ(m.getCnpj());
            e.setDonoAtelier(toEntity(m.getDonoAtelierModel()));
            e.setIdDonoAtelier(m.getIdDonoAtelier());
            e.setServicos(m.getServicos().stream().map(DataMapper::toEntity).collect(Collectors.toList()));
            e.setProdutos(m.getProdutos().stream().map(DataMapper::toEntity).collect(Collectors.toList()));
            return e;
        }

        public static AtelierModel toModel(Atelier e) {
            if (e == null) return null;
            AtelierModel m = new AtelierModel();
            m.setId(e.getId());
            m.setNome(e.getNome().getText());
            m.setCnpj(e.getCnpj().getCNPJ());
            m.setDonoAtelierModel(toModel(e.getDonoAtelier()));
            m.setIdDonoAtelier(e.getIdDonoAtelier());
            m.setServicos(e.getServicos().stream().map(DataMapper::toModel).collect(Collectors.toList()));
            m.setProdutos(e.getProdutos().stream().map(DataMapper::toModel).collect(Collectors.toList()));
            return m;
        }

        public static DonoAtelier toEntity(DonoAtelierModel m) {
            if (m == null) return null;
            DonoAtelier e = new DonoAtelier();
            e.setId(m.getId());
            e.getNomeSocial().setText(m.getNomeSocial());
            e.getNomeUsuario().setText(m.getNomeUsuario());
            e.getEmail().setEmail(m.getEmail());
            e.getSenha().setSenha(m.getSenha());
            e.getCpf().setCpf(m.getCpf());
            return e;
        }

        public static DonoAtelierModel toModel(DonoAtelier e) {
            if (e == null) return null;
            DonoAtelierModel m = new DonoAtelierModel();
            m.setId(e.getId());
            m.setNomeSocial(e.getNomeSocial().getText());
            m.setNomeUsuario(e.getNomeUsuario().getText());
            m.setEmail(e.getEmail().getEmail());
            m.setSenha(e.getSenha().getSenha());
            m.setCpf(e.getCpf().getCpf());
            return m;
        }

        public static Comprador toEntity(CompradorModel m) {
            if (m == null) return null;
            Comprador e = new Comprador();
            e.setId(m.getId());
            e.getNome().setText(m.getNome());
            e.getEmail().setEmail(m.getEmail());
            e.getSenha().setSenha(m.getSenha());
            e.setPedidos(m.getPedidos().stream().map(DataMapper::toEntity).collect(Collectors.toList()));
            return e;
        }

        public static CompradorModel toModel(Comprador e) {
            if (e == null) return null;
            CompradorModel m = new CompradorModel();
            m.setId(e.getId());
            m.setNome(e.getNome().getText());
            m.setEmail(e.getEmail().getEmail());
            m.setPedidos(e.getPedidos().stream().map(DataMapper::toModel).collect(Collectors.toList()));
            return m;
        }

        public static EnderecoAtelier toEntity(EnderecoAtelierModel m) {
            if (m == null) return null;
            EnderecoAtelier e = new EnderecoAtelier();
            e.setId(m.getId());
            e.getLogradouro().setText(m.getLogradouro());
            e.getCidade().setText(m.getCidade());
            e.getEstado().setText(m.getEstado());
            e.getCep().setCep(m.getCep());
            return e;
        }

        public static EnderecoAtelierModel toModel(EnderecoAtelier e) {
            if (e == null) return null;
            EnderecoAtelierModel m = new EnderecoAtelierModel();
            m.setId(e.getId());
            m.setLogradouro(e.getLogradouro().getText());
            m.setCidade(e.getCidade().getText());
            m.setEstado(e.getEstado().getText());
            m.setCep(e.getCep().getCep());
            return m;
        }

        public static EnderecoUsuario toEntity(EnderecoUsuarioModel m) {
            if (m == null) return null;
            EnderecoUsuario e = new EnderecoUsuario();
            e.setId(m.getId());
            e.getLogradouro().setText(m.getLogradouro());
            e.getCidade().setText(m.getCidade());
            e.getEstado().setText(m.getEstado());
            e.getCep().setCep(m.getCep());
            return e;
        }

        public static EnderecoUsuarioModel toModel(EnderecoUsuario e) {
            if (e == null) return null;
            EnderecoUsuarioModel m = new EnderecoUsuarioModel();
            m.setId(e.getId());
            m.setLogradouro(e.getLogradouro().getText());
            m.setCidade(e.getCidade().getText());
            m.setEstado(e.getEstado().getText());
            m.setCep(e.getCep().getCep());
            return m;
        }

        public static Produto toEntity(ProdutoModel m) {
            if (m == null) return null;
            Produto e = new Produto();
            e.setId(m.getId());
            e.getNome().setText(m.getNome());

            e.getPreco().setValue(m.getPreco());
            return e;
        }

        public static ProdutoModel toModel(Produto e) {
            if (e == null) return null;
            ProdutoModel m = new ProdutoModel();
            m.setId(e.getId());
            m.setNome(e.getNome().getText());

            m.setPreco(e.getPreco().getValue());
            return m;
        }

        public static Servico toEntity(ServicoModel m) {
            if (m == null) return null;
            Servico e = new Servico();
            e.setId(m.getId());
            e.getDescricao().setText(m.getDescricao());
            e.getValorMaximo().setValue(m.getValorMaximo());
            e.getValorMinimo().setValue(m.getValorMinimo());
            return e;
        }

        public static ServicoModel toModel(Servico e) {
            if (e == null) return null;
            ServicoModel m = new ServicoModel();
            m.setId(e.getId());
            m.setDescricao(e.getDescricao().getText());
            m.setValorMaximo(e.getValorMaximo().getValue());
            m.setValorMinimo(e.getValorMinimo().getValue());
            return m;
        }

        public static ItemPedidoProduto toEntity(ItemPedidoProdutoModel m) {
            if (m == null) return null;
            ItemPedidoProduto e = new ItemPedidoProduto();
            e.setId(m.getId());
            e.setProduto(toEntity(m.getProduto()));
            e.setQuantidade(m.getQuantidade());

            return e;
        }

        public static ItemPedidoProdutoModel toModel(ItemPedidoProduto e) {
            if (e == null) return null;
            ItemPedidoProdutoModel m = new ItemPedidoProdutoModel();
            m.setId(e.getId());
            m.setProduto(toModel(e.getProduto()));
            m.setQuantidade(e.getQuantidade().getNumero());

            return m;
        }

        public static ItemPedidoServico toEntity(ItemPedidoServicoModel m) {
            if (m == null) return null;
            ItemPedidoServico e = new ItemPedidoServico();
            e.setId(m.getId());
            e.setServico(toEntity(m.getServico()));
            e.setQuantidade(m.getQuantidade());

            return e;
        }

        public static ItemPedidoServicoModel toModel(ItemPedidoServico e) {
            if (e == null) return null;
            ItemPedidoServicoModel m = new ItemPedidoServicoModel();
            m.setId(e.getId());
            m.setServico(toModel(e.getServico()));
            m.setQuantidade(e.getQuantidade().getNumero());

            return m;
        }

        public static Pedido toEntity(PedidoModel m) {
            if (m == null) return null;
            Pedido e = new Pedido();
            e.setId(m.getId());
            e.setComprador(toEntity(m.getComprador()));
            e.setItemPedidoProdutoList(m.getItemPedidoProdutoList().stream().map(DataMapper::toEntity).collect(Collectors.toList()));
            e.setItemPedidoServicoList(m.getItemPedidoServicoList().stream().map(DataMapper::toEntity).collect(Collectors.toList()));
            e.getValorTotal().setValue(m.getValorTotal());
            e.setStatusPedido(m.getStatusPedido());
            e.setDataPedido(m.getDataPedido());
            e.setDataEnvio(m.getDataEnvio());
            return e;
        }

        public static PedidoModel toModel(Pedido e) {
            if (e == null) return null;
            PedidoModel m = new PedidoModel();
            m.setId(e.getId());
            m.setComprador(toModel(e.getComprador()));
            m.setItemPedidoProdutoList(e.getItemPedidoProdutoList().stream().map(DataMapper::toModel).collect(Collectors.toList()));
            m.setItemPedidoServicoList(e.getItemPedidoServicoList().stream().map(DataMapper::toModel).collect(Collectors.toList()));
            m.setValorTotal(e.getValorTotal().getValue());
            m.setStatusPedido(e.getStatusPedido());
            m.setDataEnvio(e.getDataEnvio());
            m.setDataPedido(e.getDataPedido());
            return m;
        }
}


