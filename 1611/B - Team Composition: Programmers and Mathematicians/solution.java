import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc= new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                                          long n=sc.nextInt();
                                          long m=sc.nextInt();
                                          long t=(n+m)/4;
                                          long count=Math.min(t,Math.min(n,m));
                                          
                                          System.out.println(count);
                            }
                         
                                          
                            }
              
}