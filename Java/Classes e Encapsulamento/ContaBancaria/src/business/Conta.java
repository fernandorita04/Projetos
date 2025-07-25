package business;

public class Conta {
    private double chequeEspecial;
    private double saldo;
    private boolean usandoChequeEspecial;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        if (saldoInicial > 0.0 && saldoInicial <= 500.0) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = saldoInicial * 0.5;
        }
        this.usandoChequeEspecial = false;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public void depositar(double valor) {
        saldo += valor;
        if (saldo >= 0) usandoChequeEspecial = false;
    }

    public boolean sacar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            if (saldo < 0) usandoChequeEspecial = true;
            return true;
        }
        return false;
    }
}