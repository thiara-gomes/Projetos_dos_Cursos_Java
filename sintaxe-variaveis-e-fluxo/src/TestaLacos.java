
//TABUADAS - DO 1 ATÉ O 10

/*
public class TestaLacos {

	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.println(multiplicador * contador);
            }
        }
	}
}
*/

//ARRUMANDO A TABUADA PARA MELHOR VISUALIZAÇÃO 

public class TestaLacos {

    public static void main(String[] args) {
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for(int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" "); //para alinhar todos números todos horizontalmente.
            }
            System.out.println(); //pular linha para colocar cada tabuada em uma linha
        }
    }
}