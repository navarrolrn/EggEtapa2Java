
package Entidades;


public class CuentaBancaria {
    private int numCuenta;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCuenta, long dniCliente, double saldoActual) {
        this.numCuenta = numCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
}
