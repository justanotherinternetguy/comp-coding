import java.io.*;
import java.util.*;


class Template {
	public final static String fm = "shell";
    public static void main(String[] args) throws IOException {
		// BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter pw = new PrintWriter(System.out);

		BufferedReader r = new BufferedReader(new FileReader(fm + ".in"));
		PrintWriter pw = new PrintWriter(fm + ".out");

		StringTokenizer st = new StringTokenizer(r.readLine());

		int a = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(r.readLine());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(r.readLine());
		int c = Integer.parseInt(st.nextToken());

		pw.print("The sum of these three numbers is ");
		pw.println(a + b + c);
		pw.close();
    }
}