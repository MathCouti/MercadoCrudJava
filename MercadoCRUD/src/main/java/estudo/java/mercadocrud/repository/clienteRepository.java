package estudo.java.mercadocrud.repository;

import estudo.java.mercadocrud.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clienteRepository extends JpaRepository<Cliente, Long>
{
}
