package view;

import java.time.LocalDate;
import model.Usuario;
import java.time.format.DateTimeFormatter;
public class Main {

	public static void main(String[] args) {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/uuuu");

		Usuario u1 = new Usuario("Xavier", LocalDate.parse("02/08/2000", formatoData), "58754875875", "Rua das Conversas, 51", "8754875747", "8754875458", "847875478");

		System.out.println(u1);
	}
}
