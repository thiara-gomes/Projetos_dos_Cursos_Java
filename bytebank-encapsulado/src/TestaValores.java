
public class TestaValores { 
	
    public static void main(String[] args) { 
        Conta conta = new Conta(1337, 24226);
        
        //conta está inconsistente em relação à nossa regra de negócio.
        ////Desconsiderar as duas linhas abaixo após inclusão construtor padrão no class Conta.
        /*conta.setAgencia(-50);
        conta.setNumero(-330);*/
        
        System.out.println(conta.getAgencia());
        
        conta.setAgencia(121212);
        
        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2112, 14660);
        
        //System.out.println(Conta.total); //antes criar o getTotal.
        System.out.println(Conta.getTotal());
    }
} 
