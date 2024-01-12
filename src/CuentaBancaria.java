public class CuentaBancaria {
    private int fondos;

    public CuentaBancaria(int fondosIniciales) {
        this.fondos = fondosIniciales;

    }

    public void extraer(int cantidadExtraer) {

        if(fondos - cantidadExtraer < 0 ) {
            throw new FondosInsuficientesException("Fondos insuficientes");
        }
        this.fondos = this.fondos - cantidadExtraer;

    }
}
