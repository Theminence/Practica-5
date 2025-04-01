public class Visualizador {
    public static void carta(Carta c, Posicion p) {
        int x = p.x;
        int y = p.y;

        // Crear los contornos y relleno de la carta
        Square contorno = new Square("black");
        Square relleno = new Square("white");

        contorno.changeSize(90);
        relleno.changeSize(80);

        contorno.changePosition(new Posicion(x, y));
        relleno.changePosition(new Posicion(x + 5, y + 5));

        contorno.makeVisible();
        relleno.makeVisible();

        // Dibujar el palo de la carta
        if (c.getPalo() == Palo.TREBOLES) {
            Square trebol1 = new Square(c.getColor());
            Square trebol2 = new Square(c.getColor());
            Square trebol3 = new Square(c.getColor());

            trebol1.changeSize(20);
            trebol2.changeSize(20);
            trebol3.changeSize(20);

            trebol1.changePosition(new Posicion(x + 25, y + 45));
            trebol2.changePosition(new Posicion(x + 45, y + 45));
            trebol3.changePosition(new Posicion(x + 35, y + 25));

            trebol1.makeVisible();
            trebol2.makeVisible();
            trebol3.makeVisible();
        } else if (c.getPalo() == Palo.DIAMANTES) {
            Triangle diamante1 = new Triangle(c.getColor());
            Triangle diamante2 = new Triangle(c.getColor());

            diamante1.changeSize(0.3);
            diamante2.changeSize(0.3);

            diamante1.changePosition(new Posicion(x + 45, y + 30));
            diamante2.changePosition(new Posicion(x + 45, y + 45));

            diamante2.rotar();

            diamante1.makeVisible();
            diamante2.makeVisible();
        } else if (c.getPalo() == Palo.CORAZONES) {
            Circle corazon1 = new Circle(c.getColor());
            Circle corazon2 = new Circle(c.getColor());
            Triangle corazon3 = new Triangle(c.getColor());

            corazon1.changeSize(17);
            corazon2.changeSize(17);
            corazon3.changeSize(0.3);

            corazon1.changePosition(new Posicion(x + 30, y + 30));
            corazon2.changePosition(new Posicion(x + 42, y + 30));
            corazon3.changePosition(new Posicion(x + 45, y + 45));

            corazon3.rotar();

            corazon1.makeVisible();
            corazon2.makeVisible();
            corazon3.makeVisible();
        } else if (c.getPalo() == Palo.ESPADAS) {
            Triangle pica = new Triangle(c.getColor());

            pica.changeSize(0.5);

            pica.changePosition(new Posicion(x + 45, y + 30));

            pica.makeVisible();
        }

        // Dibujar los números en la carta
        Circle[] numeros = new Circle[c.getValor().ordinal() + 1]; // El valor ordinal nos da el número correcto

        for (int i = 0; i < numeros.length; ++i) {
            numeros[i] = new Circle(c.getColor());
            numeros[i].changeSize(10);

            if (i < 8) {
                numeros[i].changePosition(new Posicion(x + 6, y + 5 + (10 * i)));
            } else {
                numeros[i].changePosition(new Posicion(x + 6 + ((10 * i) - 65), y + 75));
            }

            numeros[i].makeVisible();
        }
    }
}
