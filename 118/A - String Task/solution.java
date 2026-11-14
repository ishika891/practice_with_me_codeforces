import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            String s=sc.nextLine();
                            s=s.toLowerCase();
                            String v="aeiouy";
                            StringBuilder sb= new StringBuilder();
                            for(int i=0;i<s.length();i++){
                                          char ch= s.charAt(i);
                                          int a=v.indexOf(ch);
                                          if(a==-1){
                                                        sb.append(".");
                                                        sb.append(ch);
                                          }
                            }
                            System.out.println(sb.toString());
              }
}