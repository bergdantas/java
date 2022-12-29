package model;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner ouvido = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		System.out.println("Digite o nome da pessoa");
		String entradaNome = ouvido.nextLine(); 
		System.out.println("Digite o telefone da pessoa");
		int entradaTelefone = ouvido.nextInt();
		ouvido.close();
		//construtor vazio
		p1.setNome(entradaNome);
		p1.setTelefone(entradaTelefone);
		
		//construtor com parametros
		Pessoa p2 = new Pessoa(entradaNome, entradaTelefone);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
	

}
