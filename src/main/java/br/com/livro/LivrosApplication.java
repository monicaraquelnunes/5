package br.com.livro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication // Anotate do Spring para indicar que essa é a classe que inicia a aplicação
@EnableJpaRepositories(basePackages = "br.com.artigo.livro.repository") // Anotate do Jpa para indicar em qual pacote se encontram as classes que acessa o banco de dados
public class LivrosApplication { // Refere-se ao início da classe LivrosApplication

	public static void main(String[] args) { // Método main com o argumento args retornando void
		SpringApplication.run(LivrosApplication.class, args); // Executando o método run do Spring para a aplicação rodar
	}

}
