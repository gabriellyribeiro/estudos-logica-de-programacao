package lista4_1.pkg8;

public class AbrirConta {
    int saldo;

    void verficaSaldo() {
        if (this.saldo <= 0) {
            saldo = 0;
            System.out
                    .println("O seu saldo não pode começar negativo, ou nulo, pois é cobrado taxa em conta corrente.");
        } else {
            System.out.println("O seu saldo é de " + this.saldo + " Reais.");
        }

    }

}
