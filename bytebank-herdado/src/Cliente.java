
public class Cliente implements Autenticavel {

//    private int senha;
    
    private AutenticacaoUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
//        this.senha = senha;
    	this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
//        if(this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
    	return this.autenticador.autentica(senha);
    }

}
