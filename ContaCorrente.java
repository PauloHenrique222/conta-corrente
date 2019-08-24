package Conta;

public class ContaCorrente {
	    String nomeDoCorrentista;
	    String agencia;
	    String nroConta;
	    double saldo;
	    boolean especial;
	    
	    double sacar(double valor) {
	    	this.saldo = this.saldo - valor;
	    	return this.saldo;
	    }
	    double depositar(double valor) {
	    	this.saldo = this.saldo + valor;
	    	return this.saldo;
	    }
	    void exibeSaldo() {
	    	System.out.println("SALDO: " + this.saldo);
	    }

}
