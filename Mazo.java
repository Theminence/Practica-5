import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Clase que representa el Mazo de Cartas
class Mazo {
    private final List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
        // Inicializar el mazo con todas las cartas
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                cartas.add(new Carta(valor, palo));
            }
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> repartir(int numCartas) {
        List<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            if (!cartas.isEmpty()) {
                cartasRepartidas.add(cartas.remove(0));
            }
        }
        return cartasRepartidas;
    }

    public void devolverCartas(List<Carta> cartasDevueltas) {
        cartas.addAll(cartasDevueltas);
    }

    @Override
    public String toString() {
        StringBuilder mazo = new StringBuilder();
        for (Carta carta : cartas) {
            mazo.append(carta).append("\n");
        }
        return mazo.toString();
    }
}
