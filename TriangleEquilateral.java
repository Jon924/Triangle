
/**
 * Write a description of class TriangleEquilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleEquilateral extends Triangle
{
    public TriangleEquilateral(double s){
        super(s);
    }
    
    public double calcArea(){
        return getSide()*getSide()*Math.sqrt(3)/4;
    }
    public double calcPerimeter(){
        return getSide()*3;
    }
}
