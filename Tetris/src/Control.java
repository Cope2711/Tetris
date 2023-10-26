import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Control implements KeyListener{
    
    Pieza actual;
    int pinix=3;
    int piniy=0;
    int pFinalx;
    int pFinaly;
    //Constructor
    public Control(){
        actual = CrearPieza();
        this.MoverPiezaInicio();
    }

    public Pieza CrearPieza(){
        Pieza p = new Pieza(2);
        return p;
    }

    public void MoverPiezaInicio(){
        for (Coordenadas c: actual.getCoordenadasPieza()){
            int px = c.getX();
            int py = c.getY();
            int cx = px + pinix;
            int cy = py + piniy;
            c.setX(cx);
            c.setY(cy);
        }

    }

    public void BajarPieza(){
        for (Coordenadas c: actual.getCoordenadasPieza()){
            int py = c.getY();
            int cy = py + 1;
            c.setY(cy);
        }
    }

    public boolean SePuedeBajar(){
        boolean condicion = false;
        for (Coordenadas c: actual.getCoordenadasPieza()){
            if(c.getY()+1 == this.pFinaly){
                return true;
            }
        }
        return condicion;
    } 

    public void keyTyped(KeyEvent e) {

    }
    
    public void keyPressed(KeyEvent e) {
    
    }
    
    public void keyReleased(KeyEvent e) {
    
    }

    

    public Pieza getActual() {
        return actual;
    }

    public void setActual(Pieza actual) {
        this.actual = actual;
    }
    

    public int getpFinalx() {
        return pFinalx;
    }

    public void setpFinalx(int pFinalx) {
        this.pFinalx = pFinalx;
    }

    public int getpFinaly() {
        return pFinaly;
    }

    public void setpFinaly(int pFinaly) {
        this.pFinaly = pFinaly;
    }

    public void EjecutarFrame(){
        if(!this.SePuedeBajar()){
            this.BajarPieza();
        }
        

    }

    

    
    


}
