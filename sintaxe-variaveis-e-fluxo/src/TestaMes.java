/* Vimos como fazer testes com o if, mas se precisarmos fazer v�rios testes?
 * Um exemplo, temos uma vari�vel mes, precisamos testar o seu n�mero e imprimir o seu m�s correspondente.
 * Ent�o, vamos fazer 12 ifs?
 * Para esses casos, existe o comando switch, onde podemos colocar todas as op��es ou rumos que o nosso programa pode tomar.
 * Ele funciona da seguinte maneira:

switch (variavelASerTestada) {
    case op��o1:
            comando(s) caso a op��o 1 tenha sido escolhida
            break;
    case op��o2:
            comando(s) caso a op��o 2 tenha sido escolhida
            break;
    case op��o3:
            comando(s) caso a op��o 3 tenha sido escolhida
            break;
    default:
            comando(s) caso nenhuma das op��es anteriores tenha sido escolhida
}
*/

/*
public class TestaMes {

    public static void main(String[] args) {

        int mes = 10;

        switch (mes) {
            case 1:
                System.out.println("O m�s � Janeiro");
                break;
            case 2:
                System.out.println("O m�s � Fevereiro");
                break;
            case 3:
                System.out.println("O m�s � Mar�o");
                break;
            case 4:
                System.out.println("O m�s � Abril");
                break;
            case 5:
                System.out.println("O m�s � Maio");
                break;
            case 6:
                System.out.println("O m�s � Junho");
                break;
            case 7:
                System.out.println("O m�s � Julho");
                break;
            case 8:
                System.out.println("O m�s � Agosto");
                break;
            case 9:
                System.out.println("O m�s � Setembro");
                break;
            case 10:
                System.out.println("O m�s � Outubro");
                break;
            case 11:
                System.out.println("O m�s � Novembro");
                break;
            case 12:
                System.out.println("O m�s � Dezembro");
                break;
            default:
                System.out.println("M�s inv�lido");
                break;
        }
    }
}
*/

//O break ir� interromper a execu��o do caso que o cont�m, para os outros n�o serem executados, e se nenhuma condi��o for aceita, o c�digo do default � que ser� executado.
//Como no exemplo abaixo. Nesse caso, a impress�o ser� M�s inv�lido. Ent�o, o switch � uma solu��o para os ifs encadeados.

public class TestaMes {

    public static void main(String[] args) {

        int mes = 13;

        switch (mes) {
            case 1:
                System.out.println("O m�s � Janeiro");
                break;
            case 2:
                System.out.println("O m�s � Fevereiro");
                break;
            case 3:
                System.out.println("O m�s � Mar�o");
                break;
            case 4:
                System.out.println("O m�s � Abril");
                break;
            case 5:
                System.out.println("O m�s � Maio");
                break;
            case 6:
                System.out.println("O m�s � Junho");
                break;
            case 7:
                System.out.println("O m�s � Julho");
                break;
            case 8:
                System.out.println("O m�s � Agosto");
                break;
            case 9:
                System.out.println("O m�s � Setembro");
                break;
            case 10:
                System.out.println("O m�s � Outubro");
                break;
            case 11:
                System.out.println("O m�s � Novembro");
                break;
            case 12:
                System.out.println("O m�s � Dezembro");
                break;
            default:
                System.out.println("M�s inv�lido");
                break;
        }
    }
}