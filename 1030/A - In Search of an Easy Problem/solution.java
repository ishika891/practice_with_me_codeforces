import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            int flag=0;
                            while(n-->0){
                                          int x=sc.nextInt();
                                          if(x==1){
                                                        flag=1;
                                          }
                            }
                            if(flag==1){
                                          System.out.println("HARD");
                            }
                            else{
                                   System.out.println("EASY");
                                          
                            }       
              }
}