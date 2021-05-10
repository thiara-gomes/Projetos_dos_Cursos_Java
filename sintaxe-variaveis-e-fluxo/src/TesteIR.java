
public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        /* ESQUECERAM DE UTILIZAR AS CHAVES NA CONDICIONAL IF
        if(salario < 2600.0) 
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");

        if(salario < 3750.0) 
            System.out.println("A sua aliquota é de 22,5%");
            System.out.println("Você pode deduzir até R$ 636");
        */
        
        //COM AS CHAVES DA CONDCIONAL, O IF EXECUTARÁ AS DUAS INSTRUÇÕES
        if(salario < 2600.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir R$ 350");
        }

        if(salario < 3750.0) {
            System.out.println("A sua aliquota é de 22,5%");
            System.out.println("Você pode deduzir R$ 636");
        }
    }    
}
