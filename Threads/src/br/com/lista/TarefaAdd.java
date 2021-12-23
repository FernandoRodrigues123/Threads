package br.com.lista;


public class TarefaAdd implements Runnable {
	private Lista lista;
	private int numeroDoThread;

	public TarefaAdd(Lista lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			lista.adicionaElementos("Thread " + numeroDoThread + " " + i);
		}
		
	 
	}

}
