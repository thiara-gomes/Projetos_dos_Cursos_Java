
/*
public class TestaLacos2 {
    public static void main(String[] args) {
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna < 10; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/*
//FAZENDO UMA MATRIZ TRIANGULAR COM ASTERISOS

public class TestaLacos2 {
    public static void main(String[] args) {
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna < 10; coluna++) {
                if(coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//ESCREVENDO O MESMO CÓDIGO ACIMA SEM O BREK: TEREMOS O MESMO RESULTADO D MATRIZ TRIANGULAR

public class TestaLacos2 {
    public static void main(String[] args) {
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
