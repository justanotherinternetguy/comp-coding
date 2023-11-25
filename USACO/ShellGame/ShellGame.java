import java.io.*;
import java.util.*;

public class ShellGame {
	public final static String fm = "shell";
    public static void main(String[] args) throws IOException {
		// BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter pw = new PrintWriter(System.out);

		BufferedReader r = new BufferedReader(new FileReader(fm + ".in"));
		PrintWriter pw = new PrintWriter(fm + ".out");

		StringTokenizer st = new StringTokenizer(r.readLine());

        int N = Integer.parseInt(st.nextToken()); // 
        int[] shellAtPos = new int[3]; // stores label of shell located at pos i
        for (int i = 0 ; i < 3; i++) {
            shellAtPos[i] = i; // place shells down (0, 1, 2)
        }
        int[] counter = new int[3]; // stores the number of times the shell with label i was picked

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(r.readLine());
            int a, b, g;
            a = Integer.parseInt(st.nextToken()) - 1;
            b = Integer.parseInt(st.nextToken()) - 1;
            g = Integer.parseInt(st.nextToken()) - 1;

            // swap
            int temp = shellAtPos[b];
            shellAtPos[b] = shellAtPos[a];
            shellAtPos[a] = temp;

            counter[shellAtPos[g]]++;
        }
        pw.print(Math.max(counter[0], Math.max(counter[1], counter[2])));
		pw.close();
    }
}