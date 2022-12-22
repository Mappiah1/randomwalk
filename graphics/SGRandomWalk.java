import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
public class SGRandomWalk
{
    public static void main(String[] args)
    {
        int counter = 0;
        Rectangle background = new Rectangle(0, 0, 300, 300);
        background.setColor(Color.BLUE);
        background.draw();
        Ellipse egg = new Ellipse(25, 25, 200, 200);
        Ellipse walker = new Ellipse(120, 120, 10, 10);
        egg.setColor(Color.RED);
        egg.draw();
        walker.draw();
        int x1 = walker.getX();
        int y1 = walker.getY();

        while(walker.getX() < x1 + 100 && walker.getY() < y1 + 100)
        {
            int x = (int)(Math.random()*21-10);
            int y = (int)(Math.random()*21-10);
            walker.translate(x,y);
            try { Thread.sleep(100);}
            catch(Exception ex) {};
            counter++;
        }

        System.out.println("it took "+ counter + " tries");
    }
}