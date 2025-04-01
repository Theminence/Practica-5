import java.util.ArrayList;
import java.util.List;

public class Juego {
    public static void main(String[] args) {
        // Crear mazo de cartas
        Mazo mazo = new Mazo();
        
        // Mostrar el mazo completo
        System.out.println("Mazo completo:");
        System.out.println(mazo);

        // Barajar el mazo
        mazo.barajar();
        System.out.println("\nMazo barajeado:");
        System.out.println(mazo);

        // Crear jugadores
        Jugador jugador1 = new Jugador("Alice");
        Jugador jugador2 = new Jugador("Bob");

        // Repartir 5 cartas a cada jugador
        System.out.println("\nRepartiendo 5 cartas a cada jugador...");
        jugador1.recibirCartas(mazo.repartir(5));
        jugador2.recibirCartas(mazo.repartir(5));

        // Mostrar cartas repartidas a los jugadores
        System.out.println("\nCartas repartidas a los jugadores:");
        System.out.println(jugador1);
        System.out.println(jugador2);

        // Mostrar cartas restantes en el mazo después de repartir
        System.out.println("\nCartas restantes en el mazo después de repartir:");
        System.out.println("Mazo actual: " + mazo.getCartas().size() + " cartas restantes");
        System.out.println(mazo);

        // Devolver algunas cartas a la pila
        System.out.println("\nDevolviendo algunas cartas...");
        List<Carta> cartasDevueltasJugador1 = new ArrayList<>();
        List<Carta> cartasDevueltasJugador2 = new ArrayList<>();

        // Devolver una carta de Alice (jugador1)
        cartasDevueltasJugador1.add(jugador1.getCartas().get(0));
        jugador1.devolverCartas(cartasDevueltasJugador1);

        // Devolver una carta de Bob (jugador2)
        cartasDevueltasJugador2.add(jugador2.getCartas().get(0));
        jugador2.devolverCartas(cartasDevueltasJugador2);

        // Devolver las cartas al mazo
        mazo.devolverCartas(cartasDevueltasJugador1);
        mazo.devolverCartas(cartasDevueltasJugador2);

        // Mostrar las cartas restantes en el mazo después de devolver algunas
        System.out.println("\nCartas restantes en el mazo después de devolver una carta de cada jugador:");
        System.out.println("Mazo actual: " + mazo.getCartas().size() + " cartas restantes");
        System.out.println(mazo);

        // Repartir el mazo completo
        List<Carta> mazoTemporal = mazo.repartir(52);

        // Visualizar las cartas en un formato gráfico
        int x = 55;
        int y = 15;

        for (int i = 0; i < 52; i++) {
            Visualizador.carta(mazoTemporal.get(i), new Posicion(x, y));
            
            x += 120;
            
            // Cambio de fila después de 10 cartas
            if ((i + 1) % 10 == 0) {
                y += 120;
                x = 55;
            }
        }
    }
}
