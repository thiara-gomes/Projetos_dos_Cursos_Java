
public class CriaConta {

    public static void main(String[] args) {
	    Conta primeiraConta = new Conta();
	    primeiraConta.saldo = 200;
	    System.out.println(primeiraConta.saldo);
	    
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        //segundaConta.saldo = 50;
        segundaConta.saldo = 300; //altera��o posterior:igualando o saldo de ambas as contas.
        
        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        
        /*Quando o Java constr�i objetos, todos os seus atributos s�o zerados.
        0 � o valor default de v�rios tipos num�ricos, como int, double e long. No caso do tipo boolean o valor � false.*/
        
        primeiraConta.agencia = 146; //altera��o posterior:igualando a ag�ncia de ambas as contas.
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        
        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta est� na ag�ncia " + segundaConta.agencia);
        
        if(primeiraConta == segundaConta) {
            System.out.println("� a mesma conta");                    
        } else {
            System.out.println("contas diferentes");
        }
        
        /*O Java n�o ir� comparar objetos, e sim refer�ncias*/
        
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

