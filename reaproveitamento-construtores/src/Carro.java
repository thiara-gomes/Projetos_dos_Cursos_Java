
public class Carro {
	
    private int ano;
    private String modelo;
    private double preco;

    /*
    public Carro(int ano, String modelo, double preco) {
        this.ano = ano;
        this.modelo = modelo;
        this.preco = preco;
    }
    */
    public Carro(int ano, String modelo, double preco) {
        if(ano >= 1891) {
            this.ano = ano;
        } else {
            System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }        
    }
    
    /*
    public Carro(String modelo, double preco){
        this.ano = 2017;
        this.modelo = modelo;
        this.preco = preco;
    }
    */
    
    public Carro(String modelo, double preco){
        this.ano = 2017;
        if( modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }
    }
    
    Carro carro = new Carro(2013, "Gol", 35000.0);
    Carro outroCarro = new Carro("Civic", 95000.0);   
    
}
