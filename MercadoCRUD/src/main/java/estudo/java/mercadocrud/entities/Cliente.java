package estudo.java.mercadocrud.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Clientes")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    private int idade;
    private char sexo;
    private String email;



}
