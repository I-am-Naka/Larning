package paiza;

import java.util.*;

public class Main {
    public static final int ARRIVAL = 0;
    public static final int DEPARTURE = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upCloseBeforeSec = sc.nextInt();
        int upOpenAfterSec = sc.nextInt();
        int downCloseBeforeSec = sc.nextInt();
        int downOpenAfterSec = sc.nextInt();
        int keepDownSec = sc.nextInt();
        int n = sc.nextInt();
        String[][] time = new String[n][2];

        for (int i = 0; i < n; i++) {
            String directionFlg = sc.next();
            String str = sc.next().replace(":", "");
            time[i][ARRIVAL] = str.format("%6s", str).replace(" ", "0");
            str = sc.next().replace(":", "");
            time[i][DEPARTURE] = str.format("%6s", str).replace(" ", "0");
            if (directionFlg == "0") {

            }
        }
    }
}