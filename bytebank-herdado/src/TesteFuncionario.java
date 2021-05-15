
public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Funcionario nico = new Funcionario(); //aora tem que chamar um filho concreto da class Funcionario
		//Funcionario nico = new Gerente();
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("33333333333");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
