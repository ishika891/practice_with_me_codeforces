import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            while(n-->0){
                                          int a=sc.nextInt();
                                          sc.nextLine();
                                          String s=sc.next();
                                          int o=0;
                                          int c=0;
                                          for(int i=0;i<s.length();i++){
                                                        char ch=s.charAt(i);
                                                        if(ch=='('){
                                                                      o++;
                                                        }
                                                        else if(ch==')'&&o>0){
                                                                      o--;
                                                        }
                                                        else{
                                                                      c++;
                                                        }
                                          }
                                          System.out.println(o);
                            }
              }
}