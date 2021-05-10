
class Conta { 
	
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; //toda vez que surgir new Conta(), o banco abrir� um novo cliente ->  Cliente titular = new Cliente();
    private static int total; //static � um atributo da classe, neste caso da classe Conta.
    
    /*
    // construtor padr�o � uma rotina de inicializa��o. Quando ele aparece no c�digo, � o primeiro a rodar.
    public Conta() { 
        System.out.println("estou criando uma conta");
    }
    */
    
    // um construtor pode receber par�metros.
    public Conta( int agencia, int numero) { 
    	Conta.total++; //ou apenas total++;
    	System.out.println("o total de contas � " + Conta.total); //ou apenas total
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("estou criando uma conta " + this.numero); //desconsiderar ap�s criar getTotal.
    }
    
    //void deposita(double valor)
    public void deposita(double valor) {
    	//saldo = saldo + valor; 
    	this.saldo = this.saldo + valor; 
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		//this.saldo = this.saldo - valor;
    		this.saldo -= valor; //formato enxuto de escerver f�rmula acima
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
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    /*
    public void setNumero(int novoNumero) {
    	this.numero = novoNumero;
    }
    */
    
    public void setNumero(int numero) {
    	if (numero <= 0) {
            System.out.println("n�o pode valor <= 0");
            return;
        }
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if (agencia <= 0) { 
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) { 
        this.titular = titular; 

    }

    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal() { 
        return Conta.total; //ou apenas total;
    }
}
