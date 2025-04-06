package com.duckers.teart.controllers;
import com.duckers.teart.entities.Produto;
import com.duckers.teart.facades.ProdutoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produto") //OBS: plural -> singular
public class ProdutoController {
    private final ProdutoFacade produtoFacade;

    @Autowired
    public ProdutoController(ProdutoFacade produtoFacade) {
        this.produtoFacade = produtoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createProduto(@RequestBody Produto produto) {
        produtoFacade.cadastrar(produto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable int id) {
        Produto produto = produtoFacade.buscarProdutoPorId(id);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build(); // retorna um cod HTTP (ex 404)
        }
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAllProdutos() {
        List<Produto> produtos = produtoFacade.produtosList();
        return ResponseEntity.ok(produtos);
    }

    @PutMapping("")
    public ResponseEntity<Void> updateProduto(@RequestBody Produto produto) {
        produtoFacade.atualizar(produto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable int id) {
        produtoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
