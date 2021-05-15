
public class TesteSistema {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
        g.setSenha(2222);
        
        Administrador adm = new Administrador();
        adm.setSenha(3333);
        
		//FuncionarioAutenticavel cliente = new Cliente();
		//Funcionario cliente = new Cliente();
		Cliente cliente = new Cliente();
		cliente.setSenha(4444);
		
        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);

	}

}
