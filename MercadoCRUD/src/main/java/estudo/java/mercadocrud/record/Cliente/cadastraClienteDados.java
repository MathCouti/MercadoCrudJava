package estudo.java.mercadocrud.record.Cliente;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record cadastraClienteDados(
        @NotBlank
        String nome,
        int idade,
        char sexo,
        String email
)
{
}
