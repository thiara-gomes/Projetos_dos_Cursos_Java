
public class SistemaInterno {
	
    private int senha = 2222;
    
    public void autentica(Autenticavel f) {
    	boolean autenticou = f.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("N�o pode entrar no sistema!");
        }
    }

//    public void autentica(Gerente g) {
//    	boolean autenticou = g.autentica(this.senha);
//        if(autenticou) {
//            System.out.println("Pode entrar no sistema!");
//        } else {
//            System.out.println("N�o pode entrar no sistema!");
//        }
//    }
    
//    public void autentica(Administrador adm) {
//        boolean autenticou = adm.autentica(this.senha);
//        if(autenticou) {
//            System.out.println("Pode entrar no sistema!");
//        } else {
//            System.out.println("N�o pode entrar no sistema!");
//        }
//    }

}
