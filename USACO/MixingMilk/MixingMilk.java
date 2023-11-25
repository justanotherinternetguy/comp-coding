import java.io.*;
import java.util.*;


public class MixingMilk {
	public final static String fm = "mixmilk";
    public static void main(String[] args) throws IOException {
		// BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter pw = new PrintWriter(System.out);

		BufferedReader r = new BufferedReader(new FileReader(fm + ".in"));
		PrintWriter pw = new PrintWriter(fm + ".out");

		StringTokenizer st = new StringTokenizer(r.readLine());
        
        int c1, m1, c2, m2, c3, m3;
        c1 = Integer.parseInt(st.nextToken());
        m1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(r.readLine());
        c2 = Integer.parseInt(st.nextToken());
        m2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(r.readLine());
        c3 = Integer.parseInt(st.nextToken());
        m3 = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 33; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    int t = m1 + m2;
                    if (t <= c2) {
                        m2 = t;
                        m1 = 0;
                    } else if (t > c2) {
                        int e = t - c2;
                        m1 = e;
                        m2 = c2;
                    }
                } else if (j == 1) {
                    int t = m2 + m3;
                    if (t <= c3) {
                        m3 = t;
                        m2 = 0;
                    } else if (t > c3) {
                        int e = t - c3;
                        m2 = e;
                        m3 = c3;
                    }
                } else if (j == 2) {
                    int t = m3 + m1;
                    if (t <= c1) {
                        m1 = t;
                        m3 = 0;
                    } else if (t > c1) {
                        int e = t - c1;
                        m3 = e;
                        m1 = c1;
                    }
                }
            }
        }


        int t = m1 + m2;
        if (t <= c2) {
            m2 = t;
            m1 = 0;
        } else if (t > c2) {
            int e = t - c2;
            m1 = e;
            m2 = c2;
        }
        pw.print(m1);
        pw.print('\n');
        pw.print(m2);
        pw.print('\n');
        pw.print(m3);

		pw.close();
    }
}