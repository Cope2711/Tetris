import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App extends JFrame implements Runnable{

    String ScreenTitle = "Tetris";
    int ScreenWidth = 1000;
    int ScreenHeight = 800;
    
    Color BackgroundColor = Color.WHITE;

    int TableWidth = 20;
    int TableHeight = 10;

    Color PixelColor = Color.black;
    int PixelPositionX = 100;
    int PixelPositionY = 100;
    int PixelSize = 30;

    Control control;

    BufferedImage bi = new BufferedImage(this.ScreenWidth, this.ScreenHeight, BufferedImage.TYPE_4BYTE_ABGR);
    Graphics gbi = bi.getGraphics();




    public void pintarPieza(Graphics g){
        Pieza p = this.control.getActual();
        for(Coordenadas c : p.getCoordenadasPieza()){
            g.setColor(Color.BLACK);
            g.fillRect(PixelPositionX + (c.getX() * PixelSize), PixelPositionY + (c.getY() * PixelSize), PixelSize, PixelSize);

        }
    }


    //Esta funcion es la que crea el tablero y en esta misma se asigna el color de los bordes de este
    public void pintarTablero(Graphics g){
        for(int i = 0; i < TableHeight; i++){
            for (int j = 0; j < TableWidth; j++){
                g.setColor(PixelColor);
                g.drawRect(PixelPositionX + (i * PixelSize), PixelPositionY + (j * PixelSize), PixelSize, PixelSize);
            }
        }
    }


    //Esta funcion cambia el color del fondo en funcion de el ScreenWidth y el ScreenHeight
    public void pintarFondo(Graphics g){
        g.setColor(this.BackgroundColor);
        g.fillRect(10, 10, this.ScreenWidth, this.ScreenWidth);
    }


    //Esta funcion es la que pinta (valla que sorpresa)
    public void paint(Graphics g){
        this.pintarFondo(g);
        this.pintarTablero(g);
        this.pintarPieza(g);
    }


    //Funcion para manejar parametros de la pantalla
    public App(){
        this.setVisible( true);
        this.setTitle(this.ScreenTitle);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(this.ScreenWidth, this.ScreenHeight);
        control = new Control();
        control.setpFinalx(TableHeight);
        control.setpFinaly(TableWidth);

        this.addKeyListener(control);
        Thread hilo = new Thread(this);
        hilo.start();
    }


    //Funcion principal
    public static void main(String[] args) throws Exception {
       App Juego = new App();   
    }
    
    
    @Override
    public void run(){
        while (true){
            try{
                Thread.sleep(500);
            } catch (InterruptedException ex){
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            control.EjecutarFrame();
            repaint();
            
        }
    }
}