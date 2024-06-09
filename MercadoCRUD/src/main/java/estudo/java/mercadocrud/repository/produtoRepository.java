package estudo.java.mercadocrud.repository;

import estudo.java.mercadocrud.entities.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<Produto, Long>
{
    Page<Produto> findAllByAtivoTrue(Pageable paginacao);
}
