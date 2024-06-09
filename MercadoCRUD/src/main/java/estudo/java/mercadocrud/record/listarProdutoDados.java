package estudo.java.mercadocrud.record;

import estudo.java.mercadocrud.entities.Produto;
import estudo.java.mercadocrud.enums.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record listarProdutoDados(
        Long id,
        String nome,
        String descricao,
        float preco,
        String unidade,
        int estoque,
        Categoria categoria,
        String data_validade, boolean ativo)
{
    public listarProdutoDados(Produto produto)
    {
        this(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getUnidade(), produto.getEstoque(), produto.getCategoria(), produto.getData_validade(), produto.getAtivo());
    }
}
