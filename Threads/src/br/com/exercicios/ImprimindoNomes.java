package br.com.exercicios;

public class ImprimindoNomes {

	public static void main(String[] args) {
		Runnable tarefa = new ImprimeNome("Fernando");
		Thread thread = new Thread(tarefa, "Thread-imprime-nome");
		thread.start();
		

	}

}
