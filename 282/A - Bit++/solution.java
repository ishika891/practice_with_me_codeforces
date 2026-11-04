import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            int x=0;
                            sc.nextLine();
                            while(n-->0){
                                          String s=sc.next();
                                          if(s.contains("X++")||s.contains("++X")){
                                                        x+=1;
                                          }
                                          else if(s.equals("X")){x+=0;}
                                          else{
                                                        x-=1;
                                          }
                            }
                            System.out.println(x);
              }
}