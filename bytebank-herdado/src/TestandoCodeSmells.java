
public class TestandoCodeSmells {

    public static void main(String[] args) {
    	
        TesteCodeSmells f1 = new TesteCodeSmells();
        //f1.setTipo(0); não é necessário apontar o funcionário tipo zero, pq ele é o default (private int tipo = 0;)
        f1.setSalario(3000.0);
        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());

        TesteCodeSmells f2 = new TesteCodeSmells();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        System.out.println(f2.getTipo());
        System.out.println(f2.getBonificacao());
        
    }
}
