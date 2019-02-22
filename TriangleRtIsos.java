
/**
 * Write a description of class TriangleRtIsos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleRtIsos extends Triangle
{
    public TriangleRtIsos(double s){
        super(s);
    }
    
    public double calcArea(){
        return getSide()*getSide()/2;
    }
    
    public double calcPerimeter(){
        return getSide()*(2.0 + Math.sqrt(2.0));
    }
}
