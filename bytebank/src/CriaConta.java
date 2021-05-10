
public class CriaConta {

    public static void main(String[] args) {
	    Conta primeiraConta = new Conta();
	    primeiraConta.saldo = 200;
	    System.out.println(primeiraConta.saldo);
	    
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        //segundaConta.saldo = 50;
        segundaConta.saldo = 300; //alteração posterior:igualando o saldo de ambas as contas.
        
        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        
        /*Quando o Java constrói objetos, todos os seus atributos são zerados.
        0 é o valor default de vários tipos numéricos, como int, double e long. No caso do tipo boolean o valor é false.*/
        
        primeiraConta.agencia = 146; //alteração posterior:igualando a agência de ambas as contas.
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        
        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta está na agência " + segundaConta.agencia);
        
        if(primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");                    
        } else {
            System.out.println("contas diferentes");
        }
        
        /*O Java não irá comparar objetos, e sim referências*/
        
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

