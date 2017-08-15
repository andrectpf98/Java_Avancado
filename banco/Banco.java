package br.unipe.cc.banco;

import java.util.List;

public class Banco {
	
	
	private List<Conta> contas;
	
	
	
	public void debitar(String numConta, float valor){
		
		for(Conta c : contas){
			
			if(c.getNum_Conta().equals(numConta)){
				c.debitar(valor);
			}else{
				
			}
		}
		
	}
	
	public void creditar(String numConta,float valor){
		
for(Conta c : contas){
			
			if(c.getNum_Conta().equals(numConta)){
				c.creditar(valor);
			}else{
				
			}
		}
		
	}

}
