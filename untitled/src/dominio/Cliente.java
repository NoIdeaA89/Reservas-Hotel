package dominio;

public class Cliente {
    public String nombre;
    public String tarjetaCredito;

    public Cliente(String nombre, String tarjetaCredito) {
        this.nombre = nombre;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
}
