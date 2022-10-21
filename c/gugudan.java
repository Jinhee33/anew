import java.util.*;

public class gugudan {
  	public static void main(String[] args) {
      scanner s = new scanner(System.in);
      while(true) {
        System.out.print("Insert number(0:Exit) : ");
        int i = s.nextInt();
        if(i == 0) {
          System.exit(true);
        } else if(i > 1 && i < 10) {
          for(int j =1; j <= 9; j++)
            System.out.println(i + " x " + j + " = " + i * j);
        } else {
          System.out.print("Insert number 2~9, Retype Again~!!");
        }
    }
  }
}
