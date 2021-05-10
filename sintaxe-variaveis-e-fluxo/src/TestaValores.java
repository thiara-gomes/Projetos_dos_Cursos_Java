
public class TestaValores {
	
	public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        
        segundo = primeiro; //lê-se segundo recebe o primeiro
        primeiro = 10; // nesse caso, quanto vale o segundo? Continua valendo 5.

        System.out.println(segundo);
	}

}
