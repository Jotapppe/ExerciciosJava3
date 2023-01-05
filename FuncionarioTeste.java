package Exercicio8;

public class FuncionarioTeste {

public static void main(String[] args) {
		
		
		//instanciando um objeto da classe Automóvel
		Funcionario auto = new Funcionario("Gustavo","Juliana","João Pedro","Maria Luiza", "Adriana");
		auto.imprimirInfo();
		
		System.out.println("\n***Subistituição de escala de trabalho:");
		auto.setFuncionarioD("Ronaldo");
		auto.imprimirInfo();
		
		System.out.println("\n***Subistituição de escala de trabalho:");
		auto.setFuncionarioB("Richard");
		auto.imprimirInfo();
	}

}
