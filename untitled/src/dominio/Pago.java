package dominio;

public class Pago {
    public void hacerPago(Cliente cliente) {
        System.out.println("Procesando pago con tarjeta " + cliente.getTarjetaCredito());
    }
}
