package model;

import java.time.LocalDate;

public class Usuario extends Pessoa{
	private LocalDate dataDeNascimento;
	private String cpf;
	private String endereco;
	private String sus;
	private String niss;

	public Usuario(String nome, LocalDate dataDeNascimento, String cpf, String endereco, String sus, String niss) {
		super.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sus = sus;
		this.niss = niss;
	}	
	
	public Usuario() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSus() {
		return sus;
	}
	public void setSus(String sus) {
		this.sus = sus;
	}
	public String getNiss() {
		return niss;
	}
	public void setNiss(String niss) {
		this.niss = niss;
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", cpf=" + cpf + ", endereco="
				+ endereco + ", sus=" + sus + ", niss=" + niss + "]";
	}
	
}

