
public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        /* ESQUECERAM DE UTILIZAR AS CHAVES NA CONDICIONAL IF
        if(salario < 2600.0) 
            System.out.println("A sua aliquota � de 15%");
            System.out.println("Voc� pode deduzir at� R$ 350");

        if(salario < 3750.0) 
            System.out.println("A sua aliquota � de 22,5%");
            System.out.println("Voc� pode deduzir at� R$ 636");
        */
        
        //COM AS CHAVES DA CONDCIONAL, O IF EXECUTAR� AS DUAS INSTRU��ES
        if(salario < 2600.0) {
            System.out.println("A sua aliquota � de 15%");
            System.out.println("Voc� pode deduzir R$ 350");
        }

        if(salario < 3750.0) {
            System.out.println("A sua aliquota � de 22,5%");
            System.out.println("Voc� pode deduzir R$ 636");
        }
    }    
}
