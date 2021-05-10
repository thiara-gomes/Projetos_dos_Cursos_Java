
public class TestaGetESet { 
	
    public static void main(String[] args) { 
        //Conta conta = new Conta(); //Desconsiderar ap�s inclus�o construtor padr�o no class Conta.
        Conta conta = new Conta(1337, 24226);
        //conta.numero = 1337
        //conta.setNumero(1337); //Desconsiderar ap�s inclus�o construtor padr�o no class Conta.
        System.out.println(conta.getNumero());
        
        Cliente fulano = new Cliente();
        //conta.titular = fulano; //como tornamos o titular atributo, n�o mais conseguimos fazer esse 'chamado'. 
        //fulano.nome = "Fulano Silva"; //tornamos os atributos da class Cliente privados tamb�m.
        fulano.setNome("Fulano Silva");
        
        conta.setTitular(fulano);
        
        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("programador"); 
        //agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        
        System.out.println(titularDaConta);
        System.out.println(fulano);
        System.out.println(conta.getTitular());
    }   
}
