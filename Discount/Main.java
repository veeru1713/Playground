import java.util.*;
class Main
{
 public static void main(String arg[])
 {
   Scanner rd = new Scanner(System.in);
   int rate=rd.nextInt();
   int month=rd.nextInt();
   switch(month)
   {
     case 1 :   int desc=rate-(rate*20)/100;
       			System.out.println("Chris father needs to pay Rs."+desc+".00.");
       			break;
    default :   System.out.println("Chris father needs to pay Rs."+rate+".00.");
       			break;
   }
 }
}