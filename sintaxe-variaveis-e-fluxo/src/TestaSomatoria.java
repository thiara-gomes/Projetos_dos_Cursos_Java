
public class TestaSomatoria {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        
        while(contador <= 10) {
            //int total = 0; //Temos que inicializar a vari�vel total fora do while
            //total = total + contador;
        	total += contador; //outra forma, mais enxuta, de escrever 'total = total + contador'
            contador++;

            System.out.println(total);
        }
    }
}

/* Se a vari�vel total estiver dentro do while, ser� criada uma nova vari�vel total por causa do escopo e, ao voltarmos ao pr�ximo la�o, quando ocorre a itera��o, ele zera de novo, pois a velha total j� deixou de existir.*/