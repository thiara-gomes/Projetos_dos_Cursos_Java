
public class TestaContaSemCliente {
	
    public static void main(String[] args) { 
        Conta contaSicrano = new Conta();
        //System.out.println(contaSicrano.saldo);
        System.out.println(contaSicrano.getSaldo()); 

        contaSicrano.titular = new Cliente();
        System.out.println(contaSicrano.titular);
        
        contaSicrano.titular.nome = "Sicrano";
        System.out.println(contaSicrano.titular.nome); 
    }
}
