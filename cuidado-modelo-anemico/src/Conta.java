/*Durante o aprendizado dos Getters e Setters � normal pensar sempre na necessidade deles para alterar algum estado dos nossos objetos.
Mas o uso dessa pr�tica nem sempre � a mais indicada e expressa a realidade.
Observe a classe Conta representada abaixo que usa apenas getter e setters como m�todos:*/

/*
class Conta{
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
}
*/

/*Quando constru�mos classes que se limitam a ter atributos privados com os setters e getters normalmente dizemos que s�o classes que s� carregam valor, por isso s�o comumente chamados de classes fantoches ou Value Objects.
Uma classe fantoche � a que n�o possui responsabilidade alguma, a n�o ser carregar um punhado de atributos!
Definitivamente isso n�o � a Orienta��o a Objetos!
Esse modelo embora usado em alguns momentos n�o deve ser pr�tica comum ao desenvolver o dom�nio do nosso projeto com risco de se cair no Modelo An�mico que � exatamente o que a Conta hoje �.
Uma classe onde os dados e comportamentos/l�gicas n�o est�o juntos.
Voltando ao nosso exemplo da Conta, percebe-se que no mundo real as opera��es poderiam ser representadas com m�todos como saca( ) e deposita( ) em vez de s� termos setSaldo( ):*/

class Conta{
	
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void saca(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        }
    }

    public void deposita(double valor){
        if(valor>0){
            saldo += valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }

}


