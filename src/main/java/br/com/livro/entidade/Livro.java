package br.com.livro.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // Anotate utilizada para informar que uma classe também é uma entidade(tabela do banco)
@Getter // Anotate utilizada para gerar os getters da classe
@Setter // Anotate utilizada para gerar os setters da classe
@ToString // Anotate utilizada para gerar o toStrig com os atributos da classe
@NoArgsConstructor // Anotate utilizada para gerar um construtor vazio(sem argumentos) 
@AllArgsConstructor // Anotate utilizada para gerar um construtor com todos os argumentos

public class Livro { // Refere-se ao início da classe Livro
	
	@Id // Anotate que serve para informar que esse atributo(isbn) é código identificador na tabela do banco
    private Long isbn; // Criando o atributo isbn como Long
    private String titulo; // Criando o atributo titulo como String
    private Integer edicao; // Criando o atributo edicao como Integer
    private String autor; // Criando o atributo autor como String
    @Enumerated(EnumType.STRING) // Anotate que serve para reconhecer o tipo enum no banco
    private Categoria categoria; // Criando o atributo categoria como Categoria
    @Enumerated(EnumType.STRING) // Anotate que serve para reconhecer o tipo de enum no banco
    private Modelo modelo; // Criando o atributo modelo como Categoria Modelo

}
