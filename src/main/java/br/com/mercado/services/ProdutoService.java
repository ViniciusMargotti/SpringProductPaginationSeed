package br.com.mercado.services;

import br.com.mercado.domain.Produto;
import br.com.mercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService
{
    @Autowired
    ProdutoRepository repository;

    @CrossOrigin
    public Page<Produto> getAllProdutos(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Produto> pagedResult = repository.findAll(paging);
         
        return pagedResult;
    }
}