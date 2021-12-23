package br.com.exercicios;

public class ImprimeNome implements Runnable{
	
	private  String nome;
	
	public  ImprimeNome(String nome) {
			this.nome = nome;
	} 
	
	@Override
	public void run() {
		System.out.println(nome);
 		
	}

}
