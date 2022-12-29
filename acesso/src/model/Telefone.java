package model;

public class Telefone {
		private String numero;

		public Telefone() {
			
		}
		public Telefone(String numero) {
			this.numero = numero;
		}
		
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		@Override
		public String toString() {
			return "Telefone [numero=" + numero + "]";
		}

		public void solicitaCadastro (){
			System.out.println("Esse método é para cadastrar o usuário no serviço");
		}

		public void listaServicos (){ //vai retornar uma Lista de serviço
			
			//return valor_ou_variavel;
		}
}
