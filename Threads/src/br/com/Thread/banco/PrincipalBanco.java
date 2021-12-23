package br.com.Thread.banco;

public class PrincipalBanco {

    public static void main(String[] args) throws InterruptedException {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();
       
        new Thread(new TarrefaAcessar(pool, tx)).start();;
       new Thread(new TarrefaAcessarProcedimento(pool, tx)).start();;

    }
}
