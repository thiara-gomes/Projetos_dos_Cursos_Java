
public class TesteReferencias { 
    public static void main(String [] args) { 
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);
        
        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        
        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo);
        
        if(primeiraConta == segundaConta) {
            System.out.println("são a mesmíssima conta");                
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);                            
    }
}

/*primeiraConta e sugundaConta variáveis não são contas, elas são flexinhas (setas), ou seja, são uma referência para uma conta.
No exemplo acima, elas se referenciam para o mesmo objeto (valor do saldo).
*/