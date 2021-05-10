
/*Continuamos usando atributos privados e nosso modelo parece seguir perfeitamente a proposta do encapsulamento onde a pr�pria classe gerencia o seus estados(atributos). 
 * Uma utiliza��o cl�ssica dessa Conta nos levaria ao seguinte cen�rio:*/

public class UtilizacaoClassicaConta {
	
	public static void main(String[] args) { 
		
		/*
		Conta conta = new Conta();
		conta.setTitular("F�bio");
		conta.setSaldo(100.0);
		*/
		
	/*Tudo parece perfeito, agora imagine que seja necess�rio sacar 50 dessa conta. 
    * Essa opera��o vai exigir que o saldo seja suficiente.
    * Uma simples verifica��o como a seguir asseguraria que o saldo n�o tenha ficado negativo. 
    * Nesse nosso exemplo n�o h� limite al�m do saldo*/

		/*
		Conta conta = new Conta();
		conta.setTitular("F�bio")
		conta.setSaldo(100.0);
		
		double valorSaque = 50.0;
	
		if(conta.getSaldo() + 1000.0 >= valorSaque){
		    double novoSaldo = conta.getSaldo() - valorSaque;
		    conta.setSaldo(novoSaldo)
		}
		*/
   
   /*Funcionou! Mas um problema � que essa l�gica de restringir o saque � quantidade de saldo vai ter que ser refeita toda vez que for necess�ria uma opera��o de saque na nossa conta.
    * Al�m do problema de duplica��es desse trecho, um problem�o para encapsulamento � que quem est� de fato controlando as regras do saldo da conta � quem est� usando a Conta.
    * Em outras palavras nada impede que algu�m implemente um limite extra para isso e tenha uma regra completamente diferente dos demais objetos do tipo Conta:*/
   
	   /*
	    Conta conta = new Conta();
		conta.setTitular("F�bio")
		conta.setSaldo(100.0);
		
		double valorSaque = 50.0
	
	   if(conta.getSaldo() + 1000.0 >= valorSaque) {
	       double novoSaldo = conta.getSaldo() - valorSaque;
	       conta.setSaldo(novoSaldo);
	   }
	   */
	
	/*Perceba que as l�gicas de saque e dep�sito est�o representados dentro da classe e al�m disso nosso setSaldo() deixa de fazer sentido para o usu�rio da Conta.
	 * A maneira de interagir com o saldo � sempre via uma das opera��es anteriores:*/
		
		Conta conta = new Conta();
		conta.setTitular("F�bio");
		conta.deposita(100.0);
		
		double valorSaque = 50.0;
		conta.saca(valorSaque);
		
		double valorDeposito = 70.0;
		conta.deposita(valorDeposito);
	}
}


