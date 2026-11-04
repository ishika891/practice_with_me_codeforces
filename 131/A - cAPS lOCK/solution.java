import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
if(s.length()<2){
              char ch=s.charAt(0);
              if(ch>='A'&&ch<='Z'){
              System.out.println(s.toLowerCase());}
              else{
                            System.out.println(s.toUpperCase());
              }
}
else{
              int count=0;
              for(int i=0;i<s.length();i++){
                            char ch=s.charAt(i);
                            if(ch>='A'&&ch<='Z'){count++;}
              }
            if (count == s.length() || (count == s.length() - 1 && s.charAt(0) >= 'a' && s.charAt(0) <= 'z')) {
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (ch >= 'A' && ch <= 'Z') {
                        System.out.print(Character.toLowerCase(ch));
                    } else {
                        System.out.print(Character.toUpperCase(ch));
                    }
                }
                System.out.println();
            } else {
                System.out.println(s);
            }
        }
    } 
}