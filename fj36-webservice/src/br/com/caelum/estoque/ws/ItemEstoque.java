package br.com.caelum.estoque.ws;

public class ItemEstoque {
	private String codigo;
	private Integer quantidade;

	// contrutor vazio only 
	public ItemEstoque() {

	}
	
	public ItemEstoque(String codigo, Integer quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	// GETTERS E SETTERS
	
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
