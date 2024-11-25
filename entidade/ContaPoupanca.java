package entidade;

public class ContaPoupanca extends Conta {
    private double poupanca;

    public ContaPoupanca(String nome, int numero, double saldo, double poupanca) {
        super(nome, numero, saldo);
        this.poupanca = poupanca;
    }



    public double getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(double poupanca) {
        this.poupanca = poupanca;
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + mostrar() + "Poupança: " + poupanca;
    }

}


