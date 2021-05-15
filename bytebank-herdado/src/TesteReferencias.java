
public class TesteReferencias {

	public static void main(String[] args) {

        /*
		//Gerente g1 = new Gerente();
		Funcionario g1 = new Gerente(); // Funcionario � refer�nia (mais gen�rica) e Gerente � o objeto (mais espec�fico)
        g1.setNome("Marcos");
        String nome = g1.getNome();

        //g1.autentica(2222); 
        //o compilador vai buscar na refer�ncia, no caso Funcionario.
        //S� que autentica n�o � um m�todo definido na class Funcionario e sim na class Gerente, por isso essa linha n�o funciona
        */
        
		Gerente g1 = new Gerente();
		//Funcionario g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);
        
        /*Funcionario f = new Funcionario();
        f.setSalario(2000.0);*/ //Ap�s aplicarmos o abstract na class Funcionario, esta linha deixa de ser funcional
        
        EditorVideo ev = new EditorVideo();
        //Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);
        
        Designer d = new Designer();
      //Funcionario ev = new Designer();
        d.setSalario(2000.0);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        /*controle.registra(f);*/
        controle.registra(ev);
        controle.registra(d);
        
		System.out.println(controle.getSoma());

	}

}
