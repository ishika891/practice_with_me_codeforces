import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int nums[][]=new int[5][5];
                            int x=0;
                            int y=0;
                            for(int i=0;i<5;i++){
                                          for(int j=0;j<5;j++){
                                                        nums[i][j]=sc.nextInt();
                                                        if(nums[i][j]==1){
                                                                      x=i;
                                                                      y=j;
                                                        }
                                          }
                            }
                            System.out.print(Math.abs(x-2)+Math.abs(y-2));
              }
}