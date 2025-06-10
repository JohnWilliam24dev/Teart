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
            m.setDescricao(e.getDescricao().getText());
            m.setPreco(e.getPreco().getValue());
            return m;
        }

        public static Servico toEntity(ServicoModel m) {
            if (m == null) return null;
            Servico e = new Servico();
            e.setId(m.getId());
            e.getDescricao().setText(m.getDescricao());
            e.getPreco().setValue(m.getPreco());
            return e;
        }

        public static ServicoModel toModel(Servico e) {
            if (e == null) return null;
            ServicoModel m = new ServicoModel();
            m.setId(e.getId());
            m.setDescricao(e.getDescricao().getText());
            m.setPreco(e.getPreco().getValue());
            return m;
        }

        public static ItemPedidoProduto toEntity(ItemPedidoProdutoModel m) {
            if (m == null) return null;
            ItemPedidoProduto e = new ItemPedidoProduto();
            e.setId(m.getId());
            e.setProduto(toEntity(m.getProduto()));
            e.setQuantidade(m.getQuantidade());
            e.getPrecoUnitario().setValue(m.getPrecoUnitario());
            return e;
        }

        public static ItemPedidoProdutoModel toModel(ItemPedidoProduto e) {
            if (e == null) return null;
            ItemPedidoProdutoModel m = new ItemPedidoProdutoModel();
            m.setId(e.getId());
            m.setProduto(toModel(e.getProduto()));
            m.setQuantidade(e.getQuantidade());
            m.setPrecoUnitario(e.getPrecoUnitario().getValue());
            return m;
        }

        public static ItemPedidoServico toEntity(ItemPedidoServicoModel m) {
            if (m == null) return null;
            ItemPedidoServico e = new ItemPedidoServico();
            e.setId(m.getId());
            e.setServico(toEntity(m.getServico()));
            e.setQuantidade(m.getQuantidade());
            e.getPrecoUnitario().setValue(m.getPrecoUnitario());
            return e;
        }

        public static ItemPedidoServicoModel toModel(ItemPedidoServico e) {
            if (e == null) return null;
            ItemPedidoServicoModel m = new ItemPedidoServicoModel();
            m.setId(e.getId());
            m.setServico(toModel(e.getServico()));
            m.setQuantidade(e.getQuantidade());
            m.setPrecoUnitario(e.getPrecoUnitario().getValue());
            return m;
        }

        public static Pedido toEntity(PedidoModel m) {
            if (m == null) return null;
            Pedido e = new Pedido();
            e.setId(m.getId());
            e.setComprador(toEntity(m.getComprador()));
            e.setEnderecoUsuario(toEntity(m.getEnderecoUsuario()));
            e.setItensProduto(m.getItensProduto().stream().map(DataMapper::toEntity).collect(Collectors.toList()));
            e.setItensServico(m.getItensServico().stream().map(DataMapper::toEntity).collect(Collectors.toList()));
            e.getTotal().setValue(m.getTotal());
            e.setStatus(m.getStatus());
            e.setData(m.getData());
            return e;
        }

        public static PedidoModel toModel(Pedido e) {
            if (e == null) return null;
            PedidoModel m = new PedidoModel();
            m.setId(e.getId());
            m.setComprador(toModel(e.getComprador()));
            m.setEnderecoUsuario(toModel(e.getEnderecoUsuario()));
            m.setItensProduto(e.getItensProduto().stream().map(DataMapper::toModel).collect(Collectors.toList()));
            m.setItensServico(e.getItensServico().stream().map(DataMapper::toModel).collect(Collectors.toList()));
            m.setTotal(e.getTotal().getValue());
            m.setStatus(e.getStatus());
            m.setData(e.getData());
            return m;
        }
}


