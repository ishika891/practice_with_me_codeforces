import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc= new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                                          long n=sc.nextInt();
                                          long s=sc.nextInt();
                                          
                                          long count=s/((n/2)+1);
                                          
                                          System.out.println(count);
                            }
                         
                                          
                            }
              
}