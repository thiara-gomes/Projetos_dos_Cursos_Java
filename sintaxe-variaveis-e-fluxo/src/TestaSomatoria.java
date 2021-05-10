
public class TestaSomatoria {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        
        while(contador <= 10) {
            //int total = 0; //Temos que inicializar a variável total fora do while
            //total = total + contador;
        	total += contador; //outra forma, mais enxuta, de escrever 'total = total + contador'
            contador++;

            System.out.println(total);
        }
    }
}

/* Se a variável total estiver dentro do while, será criada uma nova variável total por causa do escopo e, ao voltarmos ao próximo laço, quando ocorre a iteração, ele zera de novo, pois a velha total já deixou de existir.*/