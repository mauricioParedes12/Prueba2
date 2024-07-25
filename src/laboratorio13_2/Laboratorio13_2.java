package laboratorio13_2;
import galapagos.*;
public class Laboratorio13_2 {

    
    public static void main(String[] args) {
        Turtle t1 = new Turtle();
        int distancia = 100, angulo = 37;
        int n = 1;
        t1.speed(1000);
        t1.penSize(10);
        t1.turn(90);
        t1.hide();
        while(n <=10)
        {
            t1.move(distancia);
            t1.jumpTo(0, 0);
            t1.turn(-angulo);
            n++;
        }
        
        
    }
    
}
