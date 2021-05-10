
/*
public class TestaCondicional2 {
	
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        //int quantidadePessoas = 3;
        int quantidadePessoas = 1;

        //if (idade >= 18 || quantidadePessoas >= 2) {
        if (idade >= 18 && quantidadePessoas >= 2) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
*/

/*
public class TestaCondicional2 {
	
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 20;
        boolean acompanhado = true;

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
*/

public class TestaCondicional2 {
	
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 20;
                int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
