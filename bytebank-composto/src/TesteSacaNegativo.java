
public class TesteSacaNegativo { 
	
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        //conta.saca(200);
        System.out.println(conta.saca(200));
        //System.out.println(conta.saldo); //saldo passou a ser privado, n�o conseguimos mais acess�-lo.
        
        conta.saca(200);
        System.out.println(conta.getSaldo());//alterando o m�todo, conseguimos acessar o saldo.
        
        /*
        // proibir esse tipo de opera��o, temos que esconder o atributo, ou seja, deixa-lo privado:
        conta.saldo = conta.saldo - 101;
        System.out.println(conta.saldo);
        */
    }
}