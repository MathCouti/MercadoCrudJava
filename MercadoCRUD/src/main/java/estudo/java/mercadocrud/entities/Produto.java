package estudo.java.mercadocrud.entities;

import estudo.java.mercadocrud.enums.Categoria;
import estudo.java.mercadocrud.record.atualizaProdutoDados;
import estudo.java.mercadocrud.record.cadastraProdutoDados;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name = "Produto")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Produto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private float preco;
    private String unidade;
    private int estoque;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String data_validade;
    private Boolean ativo;

    public Produto(cadastraProdutoDados dados)
    {
        this.ativo = true;
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.unidade = dados.unidade();
        this.estoque = dados.estoque();
        this.categoria = dados.categoria();
        this.data_validade = dados.data_validade();
    }

    public void atualizaDados(atualizaProdutoDados dados)
    {
        if (dados.nome() != null)
        {
            this.nome = dados.nome();
        }
        if (dados.descricao() != null)
        {
            this.descricao = dados.descricao();
        }
        if (dados.preco() != 0.0)
        {
            this.preco = dados.preco();
        }
        if (dados.unidade() != null)
        {
            this.unidade = dados.unidade();
        }
        if (dados.estoque() != 0)
        {
            this.estoque = dados.estoque();
        }
        if (dados.categoria() != null)
        {
            this.categoria = dados.categoria();
        }
        if (dados.data_validade() != null)
        {
            this.data_validade = dados.data_validade();
        }
    }

    public void excluir()
    {
        this.ativo = false;
    }
}
