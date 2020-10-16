package br.com.maratona.dev;

public class Run {
	
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(Double.valueOf(250));

		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(Double.valueOf(1000));
		
		Conta conta = new ContaPoupanca();
		conta.setAgencia(22435);
		
		
		//Cast
		if(conta instanceof ContaPoupanca) {
			
			((ContaPoupanca)conta).getValorRendimento();
			System.out.println("Poupança");
			
		}else if (conta instanceof ContaCorrente) {
			
			((ContaCorrente)conta).getLimite();
			((ContaCorrente)conta).emprestimo(1.5f);
			
			System.out.println("Corrente");
			
		}
		
		System.out.println(conta.getAgencia());
	}

}
