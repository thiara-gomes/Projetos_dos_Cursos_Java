
class Conta { 
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    //void deposita(double valor)
    public void deposita(double valor) {
    	//saldo = saldo + valor; 
    	this.saldo = this.saldo + valor; 
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		//this.saldo = this.saldo - valor;
    		this.saldo -= valor; //formato enxuto de escerver fórmula acima
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	} /*else { //como estamos usando o return, o else torna-se opcional.
    		return false;
    	}*/
    		return false;
    }
}