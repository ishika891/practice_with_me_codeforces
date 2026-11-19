import java.util.*;
public class Main{
              public static void main(String[] args){
                            //509C
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                           int nums[][]=new int[n][n];
                           int max=1;
                           for(int i=0;i<n;i++){
                                         nums[0][i]=1;
                                         nums[i][0]=1;
                           }
                           int r=1;
                           while(r<=n-1){
                                         for(int j=1;j<n;j++){
                                                       nums[r][j]=nums[r-1][j]+nums[r][j-1];
                                                       max=Math.max(max,nums[r][j]);
                                         }
                                         r++;
                           }
                           System.out.println(max);
                           
                          
              }
}