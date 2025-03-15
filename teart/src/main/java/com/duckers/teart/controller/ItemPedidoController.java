package com.duckers.teart.controller;
import com.duckers.teart.application.EnderecoUsuarioApplication;
import com.duckers.teart.application.ItemPedidoApplication;
import com.duckers.teart.entities.ItemPedido;
import com.duckers.teart.facade.FacadeEnderecoUsuario;
import com.duckers.teart.facade.ItemPedidoFacade;
import com.duckers.teart.repositorie.EnderecoUsuarioRepositorie;
import com.duckers.teart.repositorie.ItemPedidoRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/itempedidos")
public class ItemPedidoController {
    private static ItemPedidoFacade itemPedidoFacade;
    private static ItemPedidoApplication itemPedidoApplication;
    private static ItemPedidoRepositorie itemPedidoRepositorie;

    public static void injetarDependencias(){
        itemPedidoRepositorie = new ItemPedidoRepositorie();
        itemPedidoApplication = new ItemPedidoApplication(itemPedidoRepositorie);
        itemPedidoFacade = new ItemPedidoFacade(itemPedidoApplication);

    }

    public ItemPedidoController(){
        injetarDependencias();
    }

    @Autowired
    public ItemPedidoController(ItemPedidoFacade itemPedidoFacade) {
        this.itemPedidoFacade = itemPedidoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createItemPedido(@RequestBody ItemPedido itemPedido) {
        itemPedidoFacade.cadastrar(itemPedido);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedido> getItemPedidoById(@PathVariable int id) {
        ItemPedido itemPedido = itemPedidoFacade.buscarItemPedidoPorId(id);
        if (itemPedido != null) {
            return ResponseEntity.ok(itemPedido);
        } else {
            return ResponseEntity.notFound().build(); // retorna um cod HTTP (ex 404)
        }
    }

    @GetMapping
    public ResponseEntity<List<ItemPedido>> getAllItemPedidos() {
        List<ItemPedido> itemPedidos = itemPedidoFacade.itemPedidosList();
        return ResponseEntity.ok(itemPedidos);
    }

    // a entidade ItemPedido nao possui atributos passiveis de update no Banco de Dados

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemProduto(@PathVariable int id) {
        itemPedidoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
