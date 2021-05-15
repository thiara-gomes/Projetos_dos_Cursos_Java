//Gerente é um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

//	private String nome;
//	private String cpf;
//	private double salario;

//	private int senha;

/*	
	public void setSenha(int senha) {
        this.senha = senha;
    }
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
*/	
	
/*
	private int senha;
	
	public double getBonificacao() {
		//return this.salario;
		//return super.salario; // super = foi buscar o atributo salario na classe mãe.
		//return (this.salario * 0.1) + super.salario;
		//return super.getBonificacao() + super.salario(); // com o protected no atibuto salario na class Funcionario
		System.out.println("Chamando o método bonificacao do GERENTE");
		//return super.getBonificacao() + super.getSalario(); // mudando para o private no atibuto salario na class Funcionario
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
         	this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
*/
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
	
		
	/*
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
	*/	
	
}
