import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class MilkMeasurement {
	public final static String fm = "measurement";
    public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader(fm + ".in"));
        // PrintWriter pw = new PrintWriter(fm + ".out");
        PrintWriter pw = new PrintWriter(System.out);

        List<String> lines = r.lines().collect(Collectors.toList());
        int n = Integer.parseInt(lines.get(0));
        int changes = 0;

        for (int i = 0; i < n; i++) {
            
        }

		pw.close();
    }
}