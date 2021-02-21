/**
 * 
 */
package br.com.mercado.repository;

import br.com.mercado.domain.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
}
