import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            String nums[]=new String[n];
                            sc.nextLine();
                            HashMap<String,Integer> map= new HashMap<>();
                            for(int i=0;i<n;i++){
                                   nums[i]=sc.next();
                                   if(map.containsKey(nums[i])){
                                                 map.put(nums[i],map.get(nums[i])+1);
                                   }
                                   else {
                                                 map.put(nums[i],1);
                                   }
                                                 
                            }
                            int max=0;
                            for(String x:map.keySet()){
                                          max=Math.max(max,map.get(x));
                            }
                            for(String x:map.keySet()){
                                          if(max==map.get(x)){
                                                        System.out.println(x);
                                          }
                            }
              }
}