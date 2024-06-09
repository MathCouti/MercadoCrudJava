package estudo.java.mercadocrud.record;

import estudo.java.mercadocrud.enums.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record cadastraProdutoDados(
                                @NotBlank
                                String nome,
                                @NotBlank
                                String descricao,
                                @NotNull
                                float preco,
                                @NotBlank
                                String unidade,
                                @NotNull
                                int estoque,
                                @NotBlank
                                Categoria categoria,
                                @NotBlank
                                String data_validade)
{

}
