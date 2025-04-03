class Carta {
    private final Valor valor;
    private final Palo palo;
    private final String color;

    // Enum para los valores de la carta
    enum Valor {
        DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, J, Q, K, A;
    }

    // Enum para los palos de la carta
    enum Palo {
        CORAZONES, DIAMANTES, TREBOLES, ESPADAS;
    }

    // Constructor con valor, palo y color
    public Carta(Valor valor, Palo palo, String color) {
        this.valor = valor;
        this.palo = palo;
        this.color = color;  // Asignación del color
    }

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public String getColor() {  // Método para obtener el color
        return color;
    }

    @Override
    public String toString() {
        return valor + " | " + palo + " | " + color;  // Mostrar color también en el toString
    }
}


