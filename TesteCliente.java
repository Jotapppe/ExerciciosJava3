package Exercicio7;

public class TesteCliente {

public static void main(String[] args) {
		
		
		//instanciando um objeto da classe Automóvel
		Cliente auto = new Cliente("Dipirona","Dorflex","Novalgina","Doril","Naridrin");
		auto.imprimirInfo();
		
		System.out.println("\n***Alteração de Medicamentos em estoque");
		auto.setRemedio1("Engov");
		auto.imprimirInfo();
		
		System.out.println("\n***Alteração de medicamento em estoque");
		auto.setRemedio3("Bezetacil");
		auto.imprimirInfo();
}

}