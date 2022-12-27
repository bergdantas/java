package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		Pessoa p1 = new Pessoa("Berguliana", "84998578458", LocalDate.parse("15/03/1990", formatoData), 1700.0); 
		
		Pessoa p2  = new Pessoa ();
		p2.setNome("Joeduarda");
		p2.setSalario(500.0);
		
		Pessoa p3  = new Pessoa ();
		p3.setNome("Fernavier");
		p3.setSalario(1000.0);
		p3.setTelefone("84598754258");
				
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
