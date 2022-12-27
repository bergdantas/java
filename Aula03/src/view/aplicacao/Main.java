package view.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.entidades.Pessoa;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		Scanner ouvido = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		System.out.println("Digite o nome do usuario");
		String entradaNome = ouvido.nextLine();
		p1.setNome(entradaNome);
		
		System.out.println("Digite a data de nascimento da pessoa (dd/mm/aaaa)");
		String entradaDataDeNascimento = ouvido.nextLine();
		
		try {
			p1.setDataDeNascimento(LocalDate.parse(entradaDataDeNascimento, formatoData));
		}catch(java.time.format.DateTimeParseException e){
			System.out.println("O formato da data nao esta correto, use o padrao dd/mm/aaaa");	
		}
		
		System.out.println("Digite o valor do salario");
		double entradaSalario = ouvido.nextDouble();
		p1.setSalario(entradaSalario);
		
		System.out.println("Digite o telefone");
		String entradaTelefone = ouvido.next();
		p1.adicionaTelefone(entradaTelefone);
		
		ouvido.close();
		
		System.out.println("====== PESSOA 1 ======");

		System.out.println(p1);
		p1.adicionaTelefone("84976879686");
		System.out.println(p1);
		p1.listarTelefones();

		System.out.println("====== PESSOA 2 ======");
		Pessoa p2 = new Pessoa(entradaNome, LocalDate.parse(entradaDataDeNascimento, formatoData), entradaSalario, entradaTelefone);
		System.out.println(p2);
	}
}