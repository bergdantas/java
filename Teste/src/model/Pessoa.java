package model;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String telefone;
	private LocalDate dataDeNascimento;
	private double salario;
	
	public Pessoa(String nome, String telefone, LocalDate dataDeNascimento, double salario) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
	}
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", dataDeNascimento=" + dataDeNascimento
				+ ", salario=" + salario + "]";
	}
}
