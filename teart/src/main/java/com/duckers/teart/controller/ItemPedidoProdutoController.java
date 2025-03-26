package com.duckers.teart.controller;
import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.facade.ItemPedidoProdutoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/itempedidosproduto")
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
        List<ItemPedidoProduto> itemPedidosProduto = itemPedidoProdutoFacade.itemPedidosProdutoProdutoList();
        return ResponseEntity.ok(itemPedidosProduto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemPedidoProduto(@PathVariable long id) {
        itemPedidoProdutoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
