package logica;

import dominio.Cliente;
import dominio.Hotel;
import dominio.Pago;
import dominio.Reserva;

public class Main{
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Perez", "1234-5678-9012-3456");
        Hotel hotel = new Hotel();
        Pago pago = new Pago();
        Reserva reserva = new Reserva();
        reserva.hacerReserva(cliente);
        pago.hacerPago(cliente);
    }
}