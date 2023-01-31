package org.farmacia.os_senhores_do_remedio.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message ="O nome é Obrigatório ")
	@Size(min=10, max=100, message = "O nome da categoria deve conter no minimo 10 e no maximo 100 caracteres")
	private String categoriaProduto;
	
	@NotBlank (message = "O preço é Obrigadorio")
	@Size (min=10, max=1000, message = "O preço deve conter no minimo 10 e no maximo 1000 caracteres")
	private String preco;
    
	@OneToMany(mappedBy = "categorias", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categorias")
	private List<Produto> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
