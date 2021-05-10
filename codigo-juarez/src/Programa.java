
public class Programa {

    public static void main(String args[]) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco = new Endereco();
        p.endereco.logradouro  = "Aveninda XYZ";
    }
}

/*OUTRA MANEIRA DE ESCREVER O CODIGO É CHAMAR NEW ENDERECO() NA CLASS PESSOA*/