import java.util.ArrayList;
import javafx.scene.paint.Color;


public class Pieza {
    
    String[] PiezaNombres = {"Hero", "LNormal", "LInvertido", "ZetaNormal", "ZetaInvertida", "Podio", "Cuadrado"};
    String id;
    Coordenadas Centro;
    Color PiezaColor;

    ArrayList<Coordenadas> CoordenadasPieza = new ArrayList<Coordenadas>();
    
    public Pieza(int n){
        switch(n){

            case 0 : {this.Hero();} break;
            case 1 : {this.LNormal();} break;
            case 2 : {this.LInvertido();} break;
            case 3 : {this.ZetaNormal();} break;
            case 4 : {this.ZetaInvertida();} break;
            case 5 : {this.Podio();} break;
            case 6 : {this.Cuadrado();} break;

        }
    }

    public ArrayList<Coordenadas> Hero(){
        // 00, 10, 20, 30
        ArrayList<Coordenadas> CoordsHero = new ArrayList<Coordenadas>();
        Coordenadas p1 = new Coordenadas(0, 0);
        Coordenadas p2 = new Coordenadas(1, 0);
        Coordenadas p3 = new Coordenadas(2, 0);
        Coordenadas p4 = new Coordenadas(3, 0);

        CoordsHero.add(p1);
        CoordsHero.add(p2);
        CoordsHero.add(p3);
        CoordsHero.add(p4);

        CoordenadasPieza = CoordsHero;
        id = PiezaNombres[0];
        this.PiezaColor = Color.RED;
        this.Centro = this.getCoordenadasPieza().get(3);
        

        return this.getCoordenadasPieza();
    }
    
    public ArrayList<Coordenadas> LNormal(){
        // 00, 01, 02, 12
        ArrayList<Coordenadas> CoordsHero = new ArrayList<Coordenadas>();
        Coordenadas p1 = new Coordenadas(1, 0);
        Coordenadas p2 = new Coordenadas(1, 1);
        Coordenadas p3 = new Coordenadas(1, 2);
        Coordenadas p4 = new Coordenadas(2, 2);

        CoordsHero.add(p1);
        CoordsHero.add(p2);
        CoordsHero.add(p3);
        CoordsHero.add(p4);

        CoordenadasPieza = CoordsHero;
        id = PiezaNombres[1];
        this.PiezaColor = Color.ORANGE;
        this.Centro = this.getCoordenadasPieza().get(3);
        
        return this.getCoordenadasPieza();
    }

    public ArrayList<Coordenadas> LInvertido(){
        // 00, 01, 02, 12
        ArrayList<Coordenadas> CoordsHero = new ArrayList<Coordenadas>();
        Coordenadas p1 = new Coordenadas(1, 0);
        Coordenadas p2 = new Coordenadas(1, 1);
        Coordenadas p3 = new Coordenadas(1, 2);
        Coordenadas p4 = new Coordenadas(0, 2);

        CoordsHero.add(p1);
        CoordsHero.add(p2);
        CoordsHero.add(p3);
        CoordsHero.add(p4);

        CoordenadasPieza = CoordsHero;
        id = PiezaNombres[2];
        this.PiezaColor = Color.ORANGE;
        this.Centro = this.getCoordenadasPieza().get(3);
        

        return this.getCoordenadasPieza();
    }

    public ArrayList<Coordenadas> ZetaNormal(){
        // 00, 10, 11, 21
        ArrayList<Coordenadas> CoordsHero = new ArrayList<Coordenadas>();
        Coordenadas p1 = new Coordenadas(0, 0);
        Coordenadas p2 = new Coordenadas(1, 0);
        Coordenadas p3 = new Coordenadas(1, 1);
        Coordenadas p4 = new Coordenadas(2, 1);

        CoordsHero.add(p1);
        CoordsHero.add(p2);
        CoordsHero.add(p3);
        CoordsHero.add(p4);

        CoordenadasPieza = CoordsHero;
        id = PiezaNombres[3];
        this.PiezaColor = Color.ORANGE;
        this.Centro = this.getCoordenadasPieza().get(3);
        

        return this.getCoordenadasPieza();
    }

    public ArrayList<Coordenadas> ZetaInvertida(){
        // 00, 10, 11, 21
        ArrayList<Coordenadas> CoordsHero = new ArrayList<Coordenadas>();
        Coordenadas p1 = new Coordenadas(2, 0);
        Coordenadas p2 = new Coordenadas(1, 0);
        Coordenadas p3 = new Coordenadas(1, 1);
        Coordenadas p4 = new Coordenadas(0, 1);

        CoordsHero.add(p1);
        CoordsHero.add(p2);
        CoordsHero.add(p3);
        CoordsHero.add(p4);

        CoordenadasPieza = CoordsHero;
        id = PiezaNombres[4];
        this.PiezaColor = Color.ORANGE;
        this.Centro = this.getCoordenadasPieza().get(3);
        

        return this.getCoordenadasPieza();
    }

    public ArrayList<Coordenadas> Podio(){
        // 10, 01, 11, 21
        ArrayList<Coordenadas> CoordsHero = new ArrayList<Coordenadas>();
        Coordenadas p1 = new Coordenadas(1, 0);
        Coordenadas p2 = new Coordenadas(0, 1);
        Coordenadas p3 = new Coordenadas(1, 1);
        Coordenadas p4 = new Coordenadas(2, 1);

        CoordsHero.add(p1);
        CoordsHero.add(p2);
        CoordsHero.add(p3);
        CoordsHero.add(p4);

        CoordenadasPieza = CoordsHero;
        id = PiezaNombres[5];
        this.PiezaColor = Color.ORANGE;
        this.Centro = this.getCoordenadasPieza().get(3);
        

        return this.getCoordenadasPieza();
    }

    public ArrayList<Coordenadas> Cuadrado(){
        // 00, 01, 10, 11
        ArrayList<Coordenadas> CoordsHero = new ArrayList<Coordenadas>();
        Coordenadas p1 = new Coordenadas(0, 0);
        Coordenadas p2 = new Coordenadas(0, 1);
        Coordenadas p3 = new Coordenadas(1, 0);
        Coordenadas p4 = new Coordenadas(1, 1);

        CoordsHero.add(p1);
        CoordsHero.add(p2);
        CoordsHero.add(p3);
        CoordsHero.add(p4);

        CoordenadasPieza = CoordsHero;
        id = PiezaNombres[6];
        this.PiezaColor = Color.ORANGE;
        this.Centro = this.getCoordenadasPieza().get(3);
        

        return this.getCoordenadasPieza();
    }

    


    public String[] getPiezaNombres() {
        return PiezaNombres;
    }

    public void setPiezaNombres(String[] piezaNombres) {
        PiezaNombres = piezaNombres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coordenadas getCentro() {
        return Centro;
    }

    public void setCentro(Coordenadas centro) {
        Centro = centro;
    }

    public Color getPiezaColor() {
        return PiezaColor;
    }

    public void setPiezaColor(Color piezaColor) {
        PiezaColor = piezaColor;
    }

    

    public ArrayList<Coordenadas> getCoordenadasPieza() {
        return CoordenadasPieza;
    }

    public void setCoordenadasPieza(ArrayList<Coordenadas> coordenadasPieza) {
        CoordenadasPieza = coordenadasPieza;
    }

    public Pieza(){
        
    }
    

    

}
