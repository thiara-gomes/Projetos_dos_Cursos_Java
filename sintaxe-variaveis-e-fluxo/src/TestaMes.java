/* Vimos como fazer testes com o if, mas se precisarmos fazer vários testes?
 * Um exemplo, temos uma variável mes, precisamos testar o seu número e imprimir o seu mês correspondente.
 * Então, vamos fazer 12 ifs?
 * Para esses casos, existe o comando switch, onde podemos colocar todas as opções ou rumos que o nosso programa pode tomar.
 * Ele funciona da seguinte maneira:

switch (variavelASerTestada) {
    case opção1:
            comando(s) caso a opção 1 tenha sido escolhida
            break;
    case opção2:
            comando(s) caso a opção 2 tenha sido escolhida
            break;
    case opção3:
            comando(s) caso a opção 3 tenha sido escolhida
            break;
    default:
            comando(s) caso nenhuma das opções anteriores tenha sido escolhida
}
*/

/*
public class TestaMes {

    public static void main(String[] args) {

        int mes = 10;

        switch (mes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
*/

//O break irá interromper a execução do caso que o contém, para os outros não serem executados, e se nenhuma condição for aceita, o código do default é que será executado.
//Como no exemplo abaixo. Nesse caso, a impressão será Mês inválido. Então, o switch é uma solução para os ifs encadeados.

public class TestaMes {

    public static void main(String[] args) {

        int mes = 13;

        switch (mes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}