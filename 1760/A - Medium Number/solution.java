import java.util.*;
public class Main{
              public static void main(String [] args){
                            Scanner sc = new Scanner(System.in);
                           int a=sc.nextInt();
                           while(a-->0){
                                       int x=sc.nextInt();
                                       int y=sc.nextInt();
                                       int z=sc.nextInt();
                                       int min=Math.min(x,Math.min(y,z));
                                       int max=Math.max(x,Math.max(y,z));
                                       System.out.println(x+y+z-min-max);
                                         
                           }
 
              }
}