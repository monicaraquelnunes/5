package br.com.livro.controller;

import br.com.artigo.livro.repository.LivroRepository;
import br.com.livro.entidade.Livro;
import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Anotate para o Spring encontrar a classe e fazer o gerenciamento para que ela receba requisições e envie a resposta ao usuário
public class LivroController { // Refere-se ao início da classe LivroController
	
	@Autowired // Anotate para gerar objeto da classe LivroRepository
	private LivroRepository livroRepository; // Criando o atributo livroRepository como LivroRepository

    @ResponseBody // Anotate que serve para responder um corpo em JSON
    @RequestMapping("/livros") // Anotate usada para mapear solicitações da web para métodos do Controller
    public List<Livro> listar(){ // Método listar que retorna um lista de livro
        // Livro livro1 = new Livro(124L, "Use a Cabeça", 2, "Freeman", Categoria.INFORMATICA, Modelo.FISICO);
        // Livro livro2 = new Livro(125L, "Metaverso", 6, "Carlos", Categoria.MEDICINA, Modelo.FISICO);
        // Livro livro3 = new Livro(126L, "Aprendendo a programar", 9, "Milton", Categoria.MATEMATICA, Modelo.EBOOK);
        // return Arrays.asList(livro1, livro2, livro3);
    	
    	List<Livro> livros = livroRepository.findAll(); // Variável livros recebe(=) do método findAll() todos os livros(List) do banco de dados
    	return livros; // Retorna a variável livros que é uma lista de livros
    }
    
    @ResponseBody // Anotate que serve para responder um corpo em JSON
    @Transactional // Anotate usada para definir os requisitos da transação
    @RequestMapping(path = "/livros", method = RequestMethod.POST) // Anotate usada para mapear solicitações da web para métodos do Controller(POST é um método para criar)
    public void salvar(@RequestBody Livro livro) { // Método salvar com o argumento livro que retorna void(nada)
    	
    	livroRepository.save(livro); // Salvando no banco através do método save da interface livroRepository
    }
    
    @ResponseBody // Anotate que serve para responder um corpo em JSON
    @Transactional // Anotate usada para definir os requisitos da transação
    @RequestMapping(path = "/livros", method = RequestMethod.PUT) // Anotate usada para mapear solicitações da web para métodos do Controller(PUT é um método para atualizar,alterar)
    public void atualizar(@RequestBody Livro livro) { // Método atualizar com o argumento livro que retorna void(nada)
    	livroRepository.save(livro); // Salvando no banco através do método save da interface livroRepository
    }
    
    @ResponseBody // Anotate que serve para responder um corpo em JSON
    @Transactional // Anotate usada para definir os requisitos da transação
    @RequestMapping(path = "/livros/{isbn}", method = RequestMethod.DELETE) // Anotate usada para mapear solicitações da web para métodos do Controller(DELETE é um método para deletar, apagar)
    public void deletar(@PathVariable Long isbn) { // Método deletar com o argumento isbn que retorna void(nada)
    	
    	livroRepository.deleteById(isbn); // Deletando no banco através do método delete da interface livroRepository
    }
}
