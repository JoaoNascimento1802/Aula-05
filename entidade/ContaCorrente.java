package entidade;
import entidade.ContaPoupanca;

public class ContaCorrente {

        private double limite;

        public ContaCorrente(String nome, int numero, double saldo, double limite) {
            super (nome, numero, saldo);
            this.limite = limite;


        }


        public double getLimite() {
            return limite;
        }


        public void setLimite(double limite) {
            this.limite = limite;
        }


        @Override
        public String toString() {
            return "\nSeus dados são: " + mostrar() + " Seu limite é = " + limite;
        }

}
