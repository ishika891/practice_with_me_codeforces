import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            String s=sc.nextLine();
                            String t="hello";
                            int j=0;
                            for(int i=0;i<s.length();i++){
                                          if(t.charAt(j)==s.charAt(i)){
                                                        j++;
                                          }
                                          if(j==t.length()){break;}
                            }
                           
                           if(j==t.length()){
                                         System.out.println("YES");
                                         
                           }
                           else{
                                         System.out.println("NO");
                           }
              }
}