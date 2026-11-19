import java.util.*;
public class Main{
              public static void main(String[] args){
                            //750A
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            int le=240-sc.nextInt();
                            int count=0;
                           int i=1;
                           int t=5*i;
                           while(count<n&&t<=le){
                                         count++;
                                         i++;
                                         t+=5*i;
                           }
                            
                            System.out.println(count);
                           
                          
              }
}