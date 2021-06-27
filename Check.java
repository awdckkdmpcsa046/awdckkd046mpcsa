
import java.util.Scanner;
class Check
{
  public static void main (String[]args)
  {
    char ch;
      System.out.print ("ENTER ANY CHARACTER:");
    Scanner r = new Scanner (System.in);
      ch = r.next ().charAt (0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

      System.out.print ("vowel");
    else

        System.out.print ("consonant");
  }
}

OUTPUT:
ENTER ANY CHARACTER:a
vowel
ENTER ANY CHARACTER:b
consonant