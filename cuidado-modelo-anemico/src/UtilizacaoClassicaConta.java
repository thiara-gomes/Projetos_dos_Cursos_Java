
/*Continuamos usando atributos privados e nosso modelo parece seguir perfeitamente a proposta do encapsulamento onde a própria classe gerencia o seus estados(atributos). 
 * Uma utilização clássica dessa Conta nos levaria ao seguinte cenário:*/

public class UtilizacaoClassicaConta {
	
	public static void main(String[] args) { 
		
		/*
		Conta conta = new Conta();
		conta.setTitular("Fábio");
		conta.setSaldo(100.0);
		*/
		
	/*Tudo parece perfeito, agora imagine que seja necessário sacar 50 dessa conta. 
    * Essa operação vai exigir que o saldo seja suficiente.
    * Uma simples verificação como a seguir asseguraria que o saldo não tenha ficado negativo. 
    * Nesse nosso exemplo não há limite além do saldo*/

		/*
		Conta conta = new Conta();
		conta.setTitular("Fábio")
		conta.setSaldo(100.0);
		
		double valorSaque = 50.0;
	
		if(conta.getSaldo() + 1000.0 >= valorSaque){
		    double novoSaldo = conta.getSaldo() - valorSaque;
		    conta.setSaldo(novoSaldo)
		}
		*/
   
   /*Funcionou! Mas um problema é que essa lógica de restringir o saque à quantidade de saldo vai ter que ser refeita toda vez que for necessária uma operação de saque na nossa conta.
    * Além do problema de duplicações desse trecho, um problemão para encapsulamento é que quem está de fato controlando as regras do saldo da conta é quem está usando a Conta.
    * Em outras palavras nada impede que alguém implemente um limite extra para isso e tenha uma regra completamente diferente dos demais objetos do tipo Conta:*/
   
	   /*
	    Conta conta = new Conta();
		conta.setTitular("Fábio")
		conta.setSaldo(100.0);
		
		double valorSaque = 50.0
	
	   if(conta.getSaldo() + 1000.0 >= valorSaque) {
	       double novoSaldo = conta.getSaldo() - valorSaque;
	       conta.setSaldo(novoSaldo);
	   }
	   */
	
	/*Perceba que as lógicas de saque e depósito estão representados dentro da classe e além disso nosso setSaldo() deixa de fazer sentido para o usuário da Conta.
	 * A maneira de interagir com o saldo é sempre via uma das operações anteriores:*/
		
		Conta conta = new Conta();
		conta.setTitular("Fábio");
		conta.deposita(100.0);
		
		double valorSaque = 50.0;
		conta.saca(valorSaque);
		
		double valorDeposito = 70.0;
		conta.deposita(valorDeposito);
	}
}


