import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle rec1 = new Rectangle(3.2,5.8);
    Rectangle rec2 = new Rectangle(5.8,3.2);
    boolean isRotated = (rec1.getLength() == rec2.getWidth()) && (rec1.getWidth() == rec2.getLength());
    System.out.println(isRotated);
    boolean isCongruent = rec1.equals(rec2) || isRotated;
    System.out.println(isCongruent);
    boolean isSimular = isCongruent || ((rec1.getWidth() / rec2.getWidth()) == (rec1.getLength() / rec2.getLength()));
  System.out.println(isSimular);
  }
}
