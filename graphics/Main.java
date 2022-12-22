/**public class Main
{
    public static void main(String[] args){
        Rectangle box = new Rectangle(5, 10, 60, 80);
        box.draw();
        Ellipse egg = new Ellipse(100, 100, 40, 60);
        egg.setColor(Color.YELLOW);
        egg.fill();
        box.translate(20, 30); // Move by 20 pixels to the right, 30 pixels down
        box.draw();
        egg.grow(5, 5); // Grow by 5 pixels on all four sides
        Rectangle rect = new Rectangle(33, 33, 100, 200);
        Ellipse ecl = new Ellipse(45, 88, 44, 44);
        ecl.draw();
        Line segment = new Line(125, 125, 150, 150);
        segment.draw();
        Text greeting = new Text(250, 250, "Hello");
        greeting.draw(); 
    }
}
**/
