import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                           String s=sc.next();
                         HashMap<Character,Integer> map=new HashMap<>();
                         for(int i=0;i<s.length();i++){
                                       char ch=s.charAt(i);
                                       if(!map.containsKey(ch)){
                                                     map.put(ch,1);
                                       }
                         }
                         if(map.size()%2==0){
                                       System.out.println("CHAT WITH HER!");
                         }
                         else{
                                       System.out.println("IGNORE HIM!");
                         }
                           
              }
}