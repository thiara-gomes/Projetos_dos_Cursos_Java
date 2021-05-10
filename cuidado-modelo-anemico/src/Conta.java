/*Durante o aprendizado dos Getters e Setters é normal pensar sempre na necessidade deles para alterar algum estado dos nossos objetos.
Mas o uso dessa prática nem sempre é a mais indicada e expressa a realidade.
Observe a classe Conta representada abaixo que usa apenas getter e setters como métodos:*/

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

/*Quando construímos classes que se limitam a ter atributos privados com os setters e getters normalmente dizemos que são classes que só carregam valor, por isso são comumente chamados de classes fantoches ou Value Objects.
Uma classe fantoche é a que não possui responsabilidade alguma, a não ser carregar um punhado de atributos!
Definitivamente isso não é a Orientação a Objetos!
Esse modelo embora usado em alguns momentos não deve ser prática comum ao desenvolver o domínio do nosso projeto com risco de se cair no Modelo Anêmico que é exatamente o que a Conta hoje é.
Uma classe onde os dados e comportamentos/lógicas não estão juntos.
Voltando ao nosso exemplo da Conta, percebe-se que no mundo real as operações poderiam ser representadas com métodos como saca( ) e deposita( ) em vez de só termos setSaldo( ):*/

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


