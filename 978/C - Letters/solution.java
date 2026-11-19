import java.util.*;
 
public class Main {
    public static void main(String[] args) { // 978C
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        long ro[] = new long[n];
        long en[] = new long[m];
        
        for (int i = 0; i < n; i++) {
            ro[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            en[i] = sc.nextLong();
        }
        
        StringBuilder sb = new StringBuilder();
        int count = 1;     
        int j = 0;          
        long prevRooms = 0; 
        
        for (int i = 0; i < m; i++) {
           
            while (j < n && en[i] - prevRooms > ro[j]) {
                prevRooms += ro[j];
                j++;
                count++;
            }
            
            long room = en[i] - prevRooms;
            sb.append(count).append(" ").append(room).append("
");
        }
        
        System.out.print(sb);
    }
}