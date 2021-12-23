package br.com.exercicios;

public class MainExercicio2 {

	public static void main(String[] args) {
		new Thread(new ImprimeNum()).start();
        new Thread(new ImprimeNum()).start();
		
//		Thread threadAtual = Thread.currentThread();
//		long id = threadAtual.getId();
//		System.out.println("Id da thread: " + id);
	}
}
