package model.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private LocalDate dataDeNascimento;
	private double salario;
	private List<Telefone> listaDeTelefones = new ArrayList<Telefone>();
	public Pessoa(){
		
	}
	//SE EU NÃO QUISER OBRIGAR A TER UM TELEFONE
	//public Pessoa(String nome, LocalDate dataDeNascimento, double salario) {
	//	this.nome = nome;
	//	this.dataDeNascimento = dataDeNascimento;
	//	this.salario = salario;
	//}
	
	//SE EU QUISER OBRIGAR A TER, PELO MENOS, UM TELEFONE NO MOMENTO DO CADASTRO
	public Pessoa(String nome, LocalDate dataDeNascimento, double salario, String numeroDoTelefone) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
		adicionaTelefone(numeroDoTelefone);
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<Telefone> getListaDeTelefones() {
		return listaDeTelefones;
	}

	public void setListaDeTelefones(List<Telefone> listaDeTelefones) {
		this.listaDeTelefones = listaDeTelefones;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", salario=" + salario
				+ ", listaDeTelefones=" + listaDeTelefones + "]";
	}

	public void adicionaTelefone(String numeroDoTelefone) {
		listaDeTelefones.add(new Telefone(numeroDoTelefone));

	}
		
	public void listarTelefones() {
		for (Telefone s : listaDeTelefones) {		
			System.out.println(s);
		}
	}
		

	
}








