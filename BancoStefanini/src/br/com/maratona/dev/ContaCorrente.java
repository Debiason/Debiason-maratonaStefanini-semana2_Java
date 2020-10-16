package br.com.maratona.dev;

public class ContaCorrente extends Conta implements ContaPrivate{
	
	private Float limite;
	
	
	//-------get/set---------
	
	public Float getLimite() {
		return limite;
	}

	public void setLimite(Float limite) {
		this.limite = limite;
	}
	
	//Construtor
	
	public  ContaCorrente() {
			
	}
		
	public ContaCorrente(Float limite, Integer agencia) {
		super();
		this.limite = limite;
	}


	@Override
	public void saqueExtra(Float taxa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emprestimo(Float taxa) {
		// TODO Auto-generated method stub
		
	}
	
	

}
