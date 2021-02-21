package br.com.mercado.controller;

import br.com.mercado.domain.Produto;
import br.com.mercado.repository.ProdutoRepository;
import br.com.mercado.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;

	@Autowired
	ProdutoService produtoService;
	
	@GetMapping(value = "/produtos")
	public Iterable<Produto> findAll (
			@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize,
			@RequestParam(defaultValue = "id") String sortBy){

		return produtoService.getAllProdutos(pageNo, pageSize, sortBy);
	}
}
