package br.com.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		
		for(int i = 0; i < 10; i++) {
			new Thread(new TarefaAdd(lista, i)).start();
		}
		Thread.sleep(2000);
		
		new Thread(new TarefaImprime(lista)).start();
		
			}

}
