package Conta;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		conta1.agencia = "123";
		conta1.nroConta = "789-2";
		conta1.nomeDoCorrentista = "Camila";
		conta1.saldo = 100000.00;
		conta1.especial = true;
		
		double saldoCamila;
		
		saldoCamila = conta1.sacar(250);
		
		System.out.println("SALDO DA CAMILA PELA VARIAVEL:" + saldoCamila);
  
		conta2.agencia = "123";
		conta2.nroConta = "889-2";
		conta2.nomeDoCorrentista = "Paulo";
		conta2.saldo = 00.00;
		conta2.especial = false;
		
		System.out.println("SALDO DO PAULO: " + conta2.saldo);
		

	}

}
