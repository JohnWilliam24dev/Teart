package com.duckers.teart.controllers;
import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.facades.ItemPedidoProdutoFacade;
import com.duckers.teart.models.ItemPedidoProdutoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item-pedido-produto") 
public class ItemPedidoProdutoController {
    private final ItemPedidoProdutoFacade itemPedidoProdutoFacade;

    @Autowired
    public ItemPedidoProdutoController(ItemPedidoProdutoFacade itemPedidoProdutoFacade) {
        this.itemPedidoProdutoFacade = itemPedidoProdutoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createItemPedidoProduto(@RequestBody ItemPedidoProdutoModel itemPedidoProduto) {
        itemPedidoProdutoFacade.cadastrar(itemPedidoProduto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedidoProdutoModel> getItemPedidoProdutoById(@PathVariable long id) {
        ItemPedidoProdutoModel itemPedidoProduto = itemPedidoProdutoFacade.buscarItemPedidoProdutoPorId(id);
        if (itemPedidoProduto != null) {
            return ResponseEntity.ok(itemPedidoProduto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ItemPedidoProdutoModel>> getAllItemPedidosProduto() {
        List<ItemPedidoProdutoModel> itemPedidosProduto = itemPedidoProdutoFacade.itemPedidosProdutoList();
        return ResponseEntity.ok(itemPedidosProduto);
    }
    @PutMapping("")
    public ResponseEntity<Void> updateItemPedidoProduto( @RequestBody ItemPedidoProdutoModel itemPedidoProduto) {
        itemPedidoProdutoFacade.atualizar(itemPedidoProduto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemPedidoProduto(@PathVariable long id) {
        itemPedidoProdutoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
