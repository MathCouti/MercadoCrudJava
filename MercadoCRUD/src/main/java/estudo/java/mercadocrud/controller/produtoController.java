package estudo.java.mercadocrud.controller;

import estudo.java.mercadocrud.entities.Produto;
import estudo.java.mercadocrud.record.atualizaProdutoDados;
import estudo.java.mercadocrud.record.cadastraProdutoDados;
import estudo.java.mercadocrud.record.listarProdutoDados;
import estudo.java.mercadocrud.repository.produtoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produto")
public class produtoController
{
    @Autowired
    private produtoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody cadastraProdutoDados dados)
    {
        repository.save(new Produto(dados));
    }

    @GetMapping
    public Page<listarProdutoDados> listar(Pageable paginacao)
    {
        return repository.findAllByAtivoTrue(paginacao).map(listarProdutoDados::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody atualizaProdutoDados dados)
    {
        var produto = repository.getReferenceById(dados.id());
        produto.atualizaDados(dados);
    }

    @DeleteMapping("{id}")
    @Transactional
    public void deletar(@PathVariable Long id)
    {
        var produto = repository.getReferenceById(id);
        produto.excluir();
    }
}
