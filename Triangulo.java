public class Triangulo extends Triangle{
    
public Triangulo(String color, int size, Posicion p) {
    super(color); 
    changeSize(size, size); 
    changePosition(p); 
    makeVisible(); 
}
}