
/*
class MultiplosDeTresAteCem {
    public static void main (String[] args) {
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    { 
                System.out.println(i);
            }
        }
    }
}
// OBS: o operador % se chama de m�dulo
*/

//OU, ENTRE OUTRAS TANTAS OP��ES, A MAIS SIMPLES:

class MultiplosDeTresAteCem {
    public static void main (String[] args) {
        for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
    }
}
