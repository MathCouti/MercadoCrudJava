package estudo.java.mercadocrud.controller;

import estudo.java.mercadocrud.record.Cliente.cadastraClienteDados;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class clienteController
{
    @PostMapping
    public void cadastrar(@RequestBody cadastraClienteDados dados)
    {
    }
}
