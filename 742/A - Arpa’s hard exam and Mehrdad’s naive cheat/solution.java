import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc= new Scanner(System.in);
                           
                                          int n=sc.nextInt();
                                          if(n==0){
                                                        System.out.println(1);
                                                        return ;
                                          }
                                          int ans=0;
                                          if(n%4==1){
                                                        ans=8;
                                          }
                                          else if(n%4==2){
                                                        ans=4;
                                          }
                                          else if(n%4==3){
                                                        ans=2;
                                          }
                                          else {
                                                        ans=6;
                                          }
                                          System.out.println(ans);
                                          
                                          
              }}