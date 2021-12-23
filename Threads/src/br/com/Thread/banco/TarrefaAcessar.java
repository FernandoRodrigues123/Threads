package br.com.Thread.banco;

public class TarrefaAcessar implements Runnable {
	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;
	
	

	public TarrefaAcessar(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("pegando a chave do pool");
			pool.getConnection();
				
				synchronized (tx) {
				System.out.println("comecando tx");	
				tx.begin();
			}
		}
	}

}
