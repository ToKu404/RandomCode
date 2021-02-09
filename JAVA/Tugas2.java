import java.io.*;
import java.util.*;

class Tugas2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n < 2)
			return;

		int arr[][] = new int[n][n];

		/* DEBUG
		int seed = sc.nextInt() * 214013 + 2531011;
		for (int i = 0; i < n * n; i++, seed = 214013 * seed + 2531011)
			arr[i / n][i % n] = seed & 0xFF;
		*/
		for (int i = 0; i < n * n; i++)
			arr[i / n][i % n] = sc.nextInt();

		long sum = 0;
		for (int y = 0; y < n; y++) {
			for (int x = 0; x <= y; x++)
				sum += arr[y][x];
		}

		try {
			PrintStream out = new PrintStream(Tugas2.class.getName() + ".txt", "UTF-8");
			out.println(sum);
			out.close();
		} catch (IOException e) {
			System.out.println("Gagal");
			e.printStackTrace(System.out);
			System.exit(1);
		}
	}
}