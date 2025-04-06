package com.duckers.teart.controllers;
import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.facades.ItemPedidoProdutoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item-pedido-produto") //OBS: plural -> singular + item-pedido-produto
public class ItemPedidoProdutoController {
    private final ItemPedidoProdutoFacade itemPedidoProdutoFacade;

    @Autowired
    public ItemPedidoProdutoController(ItemPedidoProdutoFacade itemPedidoProdutoFacade) {
        this.itemPedidoProdutoFacade = itemPedidoProdutoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createItemPedidoProduto(@RequestBody ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoFacade.cadastrar(itemPedidoProduto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedidoProduto> getItemPedidoProdutoById(@PathVariable long id) {
        ItemPedidoProduto itemPedidoProduto = itemPedidoProdutoFacade.buscarItemPedidoProdutoPorId(id);
        if (itemPedidoProduto != null) {
            return ResponseEntity.ok(itemPedidoProduto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ItemPedidoProduto>> getAllItemPedidosProduto() {
        List<ItemPedidoProduto> itemPedidosProduto = itemPedidoProdutoFacade.itemPedidosProdutoList();
        return ResponseEntity.ok(itemPedidosProduto);
    }
    @PutMapping("")
    public ResponseEntity<Void> updateItemPedidoProduto( @RequestBody ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoFacade.atualizar(itemPedidoProduto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemPedidoProduto(@PathVariable long id) {
        itemPedidoProdutoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
