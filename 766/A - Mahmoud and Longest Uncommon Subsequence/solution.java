import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc= new Scanner(System.in);
                                          String s=sc.next();
                                          String t=sc.next();
                                          int ans=0;
                                          if(s.length()!=t.length()){
                                                        ans=Math.max(s.length(),t.length());
                                          }
                                          else{
                                                        if(s.equals(t)){
                                                                      ans=-1;
                                                        }
                                                        else{
                                                                      ans=s.length();
                                                        }
                                          }
                                         
                                          
                                          System.out.println(ans);
                                          
                                          
              }}