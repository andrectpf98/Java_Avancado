package br.unipe.cc.banco;

public class Conta {
	
	float saldo;
	String num_Conta;
	String nome;
	
	public void debitar(float valor) {
		try{
			
			if(valor > getSaldo()){
			System.out.println("Valor a ser debitado maior que o Saldo");
			}
			else{
			setSaldo(getSaldo() - valor);
			System.out.println("Novo Saldo: "+getSaldo());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void creditar(float valor) {
		try{
		
		setSaldo(getSaldo()+ valor);
		System.out.println("Novo saldo: "+ saldo);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNum_Conta() {
		return num_Conta;
	}

	public void setNum_Conta(String num_Conta) {
		this.num_Conta = num_Conta;
	}
	
	
	
	

}
