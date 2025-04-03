public class Visualizador {

    public static void main(String[] args) {
        // Crear una carta de tréboles
        Carta carta1 = new Carta(Carta.Valor.TRES, Carta.Palo.CORAZONES, "red");
        Carta carta2 = new Carta(Carta.Valor.CINCO, Carta.Palo.TREBOLES, "black");
        Carta carta3 = new Carta(Carta.Valor.SEIS, Carta.Palo.ESPADAS, "black");
        Carta carta4 = new Carta(Carta.Valor.A, Carta.Palo.DIAMANTES, "red");

        // Crear una posición para la carta
        Posicion p = new Posicion(100, 100);
        Posicion p2 = new Posicion(200, 100);
        Posicion p3 = new Posicion(300, 100);
        Posicion p4 = new Posicion(400, 100);

        // Llamar al método para dibujar la carta
        mostrarCarta(carta1, p);
        mostrarCarta(carta2, p2);
        mostrarCarta(carta3, p3);
        mostrarCarta(carta4, p4);
    }

    public static void mostrarCarta(Carta c, Posicion p) {
        int x = p.x;
        int y = p.y;

        // Crear los contornos y relleno de la carta usando Cuadrado
        Cuadrado contorno = new Cuadrado("black", 90, new Posicion(x, y));
        Cuadrado relleno = new Cuadrado("white", 80, new Posicion(x + 5, y + 5));

        // Dibujar el palo de la carta (si es trébol o corazones)
        if (c.getPalo() == Carta.Palo.TREBOLES || c.getPalo() == Carta.Palo.CORAZONES) {
            Cuadrado c1 = new Cuadrado(c.getColor(), 20, new Posicion(x + 25, y + 45));
            Cuadrado c2 = new Cuadrado(c.getColor(), 20, new Posicion(x + 45, y + 45));
            Cuadrado c3 = new Cuadrado(c.getColor(), 20, new Posicion(x + 35, y + 25));
        } else {
            Triangulo t1 = new Triangulo(c.getColor(), 20, new Posicion(x + 35, y + 45));
            Triangulo t2 = new Triangulo(c.getColor(), 20, new Posicion(x + 55, y + 45));
            Triangulo t3 = new Triangulo(c.getColor(), 20, new Posicion(x + 45, y + 25));
        }

        // Dibujar los números en la carta con círculos
        Circulo[] numeros = new Circulo[c.getValor().ordinal() + 1];
        for (int i = 0; i < numeros.length; ++i) {
            numeros[i] = new Circulo(c.getColor(), 10, new Posicion(x, y));

            if (i < 8) {
                numeros[i].changePosition(new Posicion(x + 6, y + 5 + (10 * i)));
            } else {
                numeros[i].changePosition(new Posicion(x + 6 + ((10 * i) - 65), y + 75));
            }

            numeros[i].makeVisible();
    }
}
}
