import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int k=sc.nextInt();
int n=sc.nextInt();
int w=sc.nextInt();
int sum=0;
int i=1;
while(w-->0){
           sum+=(i*k);
           i++;
}
if(sum-n>=0){System.out.print(sum-n);}
else{System.out.println(0);}
                            
              }
}