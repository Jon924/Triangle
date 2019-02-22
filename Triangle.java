
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Triangle
{
    private double side;

    public Triangle(double s){
        side = s;
    }
    
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public double calcRatioAtoP(){
        return calcArea()/calcPerimeter();
    }
    public double getSide(){
        return side;
    }
}
