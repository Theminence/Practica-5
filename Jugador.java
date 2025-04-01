import java.util.ArrayList;
import java.util.List;



// Clase que representa un Jugador
class Jugador {
    private String nombre;
    private List<Carta> cartas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        cartas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void recibirCartas(List<Carta> cartasRecibidas) {
        cartas.addAll(cartasRecibidas);
    }

    public void devolverCartas(List<Carta> cartasDevueltas) {
        cartas.removeAll(cartasDevueltas);
    }

    @Override
    public String toString() {
        StringBuilder cartasStr = new StringBuilder();
        for (Carta carta : cartas) {
            cartasStr.append(carta).append(", ");
        }
        return nombre + " tiene: [" + cartasStr.toString() + "]";
    }
}