public class Circulo extends Circle {
    public Circulo (String color, int size, Posicion p) {
        super(color); 
        changeSize(size); 
        changePosition(p); 
        makeVisible(); 
    }

    
}
