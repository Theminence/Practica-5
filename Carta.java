// Clase que representa una Carta
class Carta {
    private final Valor valor;
    private final Palo palo;
    private final String color;  // Asignamos el color aquí

    public Carta(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;

        // Asignamos el color según el palo
        if (palo == Palo.CORAZONES || palo == Palo.DIAMANTES) {
            this.color = "red";  // Rojo para corazones y diamantes
        } else {
            this.color = "black";  // Negro para tréboles y espadas
        }
    }

    public String getColor() {
        return color;
    }

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return valor + " | " + palo;
    }
}

enum Valor {
    DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, J, Q, K, A;
}

enum Palo {
    CORAZONES, DIAMANTES, TREBOLES, ESPADAS;
}
