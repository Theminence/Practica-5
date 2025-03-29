// Clase que representa una Carta
class Carta {
    private final Valor valor;
    private final Palo palo;

    public Carta(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override// Mostrar carta
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