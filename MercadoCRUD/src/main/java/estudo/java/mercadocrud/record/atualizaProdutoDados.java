package estudo.java.mercadocrud.record;

import estudo.java.mercadocrud.enums.Categoria;
import jakarta.validation.constraints.NotNull;

public record atualizaProdutoDados(
        @NotNull
        Long id,
        String nome,
        String descricao,
        float preco,
        String unidade,
        int estoque,
        Categoria categoria,
        String data_validade
)
{
}
