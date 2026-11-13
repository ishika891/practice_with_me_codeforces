import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc =new Scanner(System.in);
                            int n=sc.nextInt();
                            int nums[]=new int[n];
                            double sum=0;
                            for(int i=0;i<n;i++){
                                          nums[i]=sc.nextInt();
                                          sum+=nums[i];
                            }
                            System.out.println(sum/(n));
              }
}