public class TriangleTester
{
  public static void main(String[] args)
  {
    double side = 100.0;
    
    TriangleEquilateral trEq = new TriangleEquilateral(side);
    System.out.println("Equilateral:");
    System.out.println("\t area = " + trEq.calcArea() + ", expected = " + 4330.12);
    System.out.println("\t perimeter = " + trEq.calcPerimeter() + ", expected = " + 300);
    System.out.println("\t ratio of area to perimeter = " 
                        + trEq.calcRatioAtoP() + ", expected = " + 14.34);
        
    TriangleRtIsos trRt = new TriangleRtIsos(side);
    System.out.println("Right isosceles:");
    System.out.println("\t area = " + trRt.calcArea() + ", expected = " + 5000.0);
    System.out.println("\t perimeter = " + trRt.calcPerimeter() + ", expected = " + 341.42);
    System.out.println("\t ratio of area to perimeter = " 
                        + trRt.calcRatioAtoP() + ", expected = " + 14.64);
}
}
