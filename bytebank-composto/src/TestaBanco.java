
public class TestaBanco { 
	
    public static void main(String[] args) { 
        Cliente fulano = new Cliente(); 
        fulano.nome = "Fulano Silva";
        fulano.cpf = "222.222.222-22";
        fulano.profissao = "programador";
        
        Conta contaFulano = new Conta();
        contaFulano.deposita(100);
        
        //associa o cliente fulano a conta contaFulano
        contaFulano.titular = fulano;
        System.out.println(contaFulano.titular.nome);
        System.out.println(contaFulano.titular);
        System.out.println(fulano);
    }
}
