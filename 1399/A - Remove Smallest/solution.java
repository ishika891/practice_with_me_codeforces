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
                            Arrays.sort(nums);
                           int flag=0;
                        for(int i=0;i<n-1;i++){
                                      if(nums[i+1]-nums[i]>1){
                                                    flag=1;
                                                    break;
                                      }
                        }
                        
                          
                         if(flag==0){ System.out.println("YES");}
                         else{
                                       System.out.println("NO");}
                         }
                           
              }}