//nao pode instanciar essa classe, pq é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	//protected double salario; // protected = público só para as classes-filhos
	private double salario;
			
//	public double getBonificacao() {
//		return this.salario * 0.05;
//	}
	
	//metodo sem corpo, nao ha implementação. É necessário implementar nas classes-filhos
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
}
