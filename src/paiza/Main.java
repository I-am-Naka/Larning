package paiza;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[][] table = new int[H][W];
        for(int i = 0; i < H; i++){
            int sum = 0;
            for(int j = 0; j < W; j++){
                sum += sc.nextInt();
                if(i == 0){
                    table[i][j] = sum;
                }else{
                    table[i][j] = sum + table[i -1][j];
                }
            }
        }
        for(int i = 0; i < N; i++){
            System.out.println(table[sc.nextInt()-1][sc.nextInt()-1]);
        }
    }
}