package org.farmacia.os_senhores_do_remedio.repository;

import java.util.List;

import org.farmacia.os_senhores_do_remedio.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	

	public List <Categoria> findAllByCategoriaProdutoContainingIgnoreCase(@Param("categoriaProduto") String categoriaProduto);
}
