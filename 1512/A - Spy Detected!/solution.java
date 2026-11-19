import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                           int n=sc.nextInt();
                           int nums[]=new int[n];
                           for(int i=0;i<n;i++){
                                          nums[i]=sc.nextInt();
                           }
                          
                           int flag=0;
                           for(int i=1;i<n-1;i++){
                                       if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                                       System.out.println(i+1);
                                       flag=1;
                                       break;
                                       }
                            }
                           if(flag==0){
                                         if(nums[0]!=nums[1]){System.out.println(1);}
                                         else{System.out.println(n);}
                            }
              }}
}