package Exercicio8;

public class Funcionario {

	//declaração dos atributos da classe
		private String FuncionarioA;
		private String FuncionarioB;
		private String FuncionarioC;
		private String FuncionarioD;
		private String FuncionarioE;
		
		//declarar o método construtor
		public Funcionario(String FuncionarioA, String FuncionarioB, String FuncionarioC, String FuncionarioD, String FuncionarioE) {
			this.FuncionarioA = FuncionarioA;
			this.FuncionarioB = FuncionarioB;
			this.FuncionarioC = FuncionarioC;
			this.FuncionarioD = FuncionarioD;
			this.FuncionarioD = FuncionarioE;
		}

		public Funcionario() {
			super();
		}

		//declaração dos demais métodos (get/set)
		public String getFuncionarioA() {
			return FuncionarioA;
		}

		public void setFuncionarioA(String FuncionarioA) {
			this.FuncionarioA = FuncionarioA;
		}

		public String getFuncionarioB() {
			return FuncionarioB;
		}

		public void setFuncionarioB(String FuncionarioB) {
			this.FuncionarioB = FuncionarioB;
		}

		public String getFuncionarioC() {
			return FuncionarioC;
		}

		public void setFuncionarioC(String FuncionarioC) {
			this.FuncionarioC = FuncionarioC;
		}

		public String getFuncionarioD() {
			return FuncionarioD;
		}
		public void setFuncionarioD(String FuncionarioD) {
			this.FuncionarioD = FuncionarioD;
		}
		
		public String getFuncionarioE() {
			return FuncionarioE;
		}
		public void setFuncionarioE(String FuncionarioE) {
			this.FuncionarioE = FuncionarioE;
		}
		
		public void imprimirInfo() {
			
			System.out.println("\nEscala de trabalho para proximo Domingo: "+FuncionarioA+" , "+FuncionarioB+" , "+FuncionarioC+" , "+FuncionarioD);
		}
			
		
		
		
		
		

	}