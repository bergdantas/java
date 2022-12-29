package model;

import java.util.ArrayList;
import java.util.List;

public class Servico {
	private String nome;
	private String descricao;
	private String secretaria;
	private int quantidadeDeVagas;
	private int id;
	private List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	
	public Servico(String nome, String descricao, String secretaria, int quantidadeDeVagas, int id) {
		this.nome = nome;
		this.descricao = descricao;
		this.secretaria = secretaria;
		this.quantidadeDeVagas = quantidadeDeVagas;
		this.id = id;
	}
	
	public Servico() {
		
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	public int getQuantidadeDeVagas() {
		return quantidadeDeVagas;
	}
	public void setQuantidadeDeVagas(int quantidadeDeVagas) {
		this.quantidadeDeVagas = quantidadeDeVagas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}
	public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}
	@Override
	public String toString() {
		return "Servico [nome=" + nome + ", descricao=" + descricao + ", secretaria=" + secretaria
				+ ", quantidadeDeVagas=" + quantidadeDeVagas + ", id=" + id + ", listaDeUsuarios=" + listaDeUsuarios
				+ "]";
	}
	
	
}

