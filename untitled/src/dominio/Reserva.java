package dominio;

public class Reserva {
    public void hacerReserva(Cliente cliente) {
        System.out.println("Reserva realizada para " + cliente.getNombre());
    }
}
