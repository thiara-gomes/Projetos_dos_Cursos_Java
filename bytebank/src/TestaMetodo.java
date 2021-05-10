
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaFulano = new Conta();
		contaFulano.saldo = 100;
		contaFulano.deposita(50);
		System.out.println(contaFulano.saldo);
		
		boolean conseguiuRetirar = contaFulano.saca(20);
		System.out.println(contaFulano.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaSicrano = new Conta();
		contaSicrano.deposita(1000);
		
		/*
		contaSicrano.transfere(300, contaFulano);
		System.out.println(contaSicrano.saldo);
		System.out.println(contaFulano.saldo);
		*/
		
		/*
		if(contaSicrano.transfere(300, contaFulano)) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Dinheiro insuficiente");
		}
		System.out.println(contaSicrano.saldo);
		System.out.println(contaFulano.saldo);
		*/
		
		boolean sucessoTransferencia = contaSicrano.transfere(300, contaFulano);
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Dinheiro insuficiente");
		}
		System.out.println(contaSicrano.saldo);
		System.out.println(contaFulano.saldo);
		
		contaFulano.titular = "Fulano Silva";
		System.out.println(contaFulano.titular);
	}

}
