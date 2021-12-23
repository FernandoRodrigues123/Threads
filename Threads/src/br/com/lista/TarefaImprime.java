package br.com.lista;

public class TarefaImprime implements Runnable {

	private Lista lista;
	
	public TarefaImprime(Lista lista) {
		this.lista = lista;
	}
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		synchronized (lista) {
			
			if(!lista.estaCheia()) {
				try {
					System.out.println("esperando notificacao");
					
					lista.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
				for (int i = 0; i < lista.tamanho(); i++) {
					System.out.println(i + " " + lista.pegaElemento(i));
				}
			
			}
		
	}

}
