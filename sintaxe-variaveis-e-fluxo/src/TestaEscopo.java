
public class TestaEscopo {
	
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        /*boolean acompanhado = quantidadePessoas >= 2; -> Ponto de partida do raciocínio desta atividade*/

        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            //boolean acompanhado = true;
        	acompanhado = true;
        } else {
        	//boolean acompanhado = false;
        	acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
