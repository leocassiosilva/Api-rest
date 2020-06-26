package br.com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.produtos.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById(long id);
}
