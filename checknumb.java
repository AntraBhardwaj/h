package number;
import java.util.*;
public class Checknumb {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int a1;
        Scanner a = new Scanner(System.in);
         a1 = a.nextInt();
         a.close();
         if(a1<0)
         {
        	 System.out.println("negative");
         }
         else if (a1>0)
         {
        	 System.out.println("positive");
         }
         else
         {
        	 System.out.println("Zero");
         }
	}

}