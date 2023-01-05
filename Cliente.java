package Exercicio7;

public class Cliente {

	/** ENTRADA DE DADOS*/
	//declaração dos atributos da classe
		private String Remedio1;
		private String Remedio2;
		private String Remedio3;
		private String Remedio4;
		private String Remedio5;
		
		//declarar o método construtor
		public Cliente(String Remedio1, String Remedio2, String Remedio3, String Remedio4, String Remedio5) {
			this.Remedio1 = Remedio1;
			this.Remedio2 = Remedio2;
			this.Remedio3 = Remedio3;
			this.Remedio4 = Remedio4;
			this.Remedio4 = Remedio5;
		}

		public Cliente() {
			super();
		}

		//declaração dos demais métodos (get/set)
		public String getRemedio1() {
			return Remedio1;
		}

		public void setRemedio1(String Remedio1) {
			this.Remedio1 = Remedio1;
		}

		public String getRemedio2() {
			return Remedio2;
		}

		public void setRemedio2(String Remedio2) {
			this.Remedio2 = Remedio2;
		}

		public  String getRemedio3() {
			return Remedio3;
		}

		public void setRemedio3(String Remedio3) {
			this.Remedio3 = Remedio3;
		}

		public String getRemedio4() {
			return Remedio4;
		}

		public void setRemedio4(String Remedio4) {
			this.Remedio4 = Remedio4;
		}
		

		public String getRemedio5() {
			return Remedio5;
		}

		public void setRemedio5(String Remedio5) {
			this.Remedio5 = Remedio5;
		}
		
		public void imprimirInfo() {
			
		System.out.println("\nConsta em estoque: "+Remedio1+" , "+Remedio2+" , "+Remedio3+" , "+Remedio4);
		}

			
		
		
		
		

	}
