import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc =new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                            int n=sc.nextInt();
                            int x=sc.nextInt();
                            if(n%x==0){
                                          System.out.println(0);
                            }
                            else{
                            System.out.println(x-(n%x));}
              }}
} 