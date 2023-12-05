import java.io.*;
import java.util.*;


public class CircularBarn {
	public final static String fm = "cbarn";
    public static void main(String[] args) throws IOException {
		// BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter pw = new PrintWriter(System.out);

		BufferedReader r = new BufferedReader(new FileReader(fm + ".in"));
		PrintWriter pw = new PrintWriter(fm + ".out");

		StringTokenizer st = new StringTokenizer(r.readLine());
        
        // int c1, m1, c2, m2, c3, m3;
        // c1 = Integer.parseInt(st.nextToken());
        // m1 = Integer.parseInt(st.nextToken());
		// st = new StringTokenizer(r.readLine());
        // c2 = Integer.parseInt(st.nextToken());
        // m2 = Integer.parseInt(st.nextToken());
		// st = new StringTokenizer(r.readLine());
        // c3 = Integer.parseInt(st.nextToken());
        // m3 = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(st.nextToken());


		pw.close();
    }
}