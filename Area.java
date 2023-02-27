import java.util.Scanner;


class Rectangle  
{
  int m_width;
  int m_height;
 
  public Rectangle(int width, int height)
  {
    m_width = width;
    m_height = height;
  }
 
  public void setWidth(int width) 
  {
    m_width = width;
  }
 
  public void setHeight(int height)
  {
    m_height = height;
  }
 
  public int getWidth() 
  {
    return m_width;
  }
 
  public int getHeight() 
  {
    return m_height;
  }
 
  public int getArea()  
  {
    return m_width * m_height;
  }
}
/*
this class extends the Rectangle class to find the area of square
*/

class Square extends Rectangle 
{
  public Square(int side) 
  {
    super(side, side);
  }
}

public class Area   
{
  public static int calculateArea(Rectangle dimensions)   
  {
    return dimensions.getArea();
  }



  public static void main(String[] args)   
   {
        Rectangle rectangle_area = new Rectangle(6, 7);
        System.out.println("Area of Rectangle = " + calculateArea(rectangle_area));

        Square square_area = new Square(5);
        System.out.println("Area of Square = " + calculateArea(square_area));
    }
}