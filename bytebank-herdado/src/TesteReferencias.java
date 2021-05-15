
public class TesteReferencias {

	public static void main(String[] args) {

        /*
		//Gerente g1 = new Gerente();
		Funcionario g1 = new Gerente(); // Funcionario é referênia (mais genérica) e Gerente é o objeto (mais específico)
        g1.setNome("Marcos");
        String nome = g1.getNome();

        //g1.autentica(2222); 
        //o compilador vai buscar na referência, no caso Funcionario.
        //Só que autentica não é um método definido na class Funcionario e sim na class Gerente, por isso essa linha não funciona
        */
        
		Gerente g1 = new Gerente();
		//Funcionario g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);
        
        /*Funcionario f = new Funcionario();
        f.setSalario(2000.0);*/ //Após aplicarmos o abstract na class Funcionario, esta linha deixa de ser funcional
        
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
