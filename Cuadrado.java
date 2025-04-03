public class Cuadrado extends Square {
    public Cuadrado(String color, int size, Posicion p) {
        super(color); 
        changeSize(size); 
        changePosition(p); 
        makeVisible(); 
    }
}
