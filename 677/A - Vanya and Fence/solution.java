import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int t=sc.nextInt();
int sum=0;
int nums[]= new int[n];
for(int i=0;i<n;i++){
              nums[i]=sc.nextInt();
              if(nums[i]<=t){
                            sum+=1;
              }
              else{
                            sum+=2;
              }
}
System.out.println(sum);
                            
              }
}