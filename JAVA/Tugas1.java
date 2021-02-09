import java.io.*;
import java.util.*;

class Tugas1 {
	public static void main(String[] args) {
		// Scanner
		Scanner san = new Scanner(System.in);
		// Tinggi segitiga
		int n = san.nextInt();

		// if (n < 1 || n > 20) {
		// 	System.out.println("1 <= N <= 20");
		// 	return;
		// }

		// Panjang maks
		// n * 2 = untuk angka, pad spasi
		// (n - 1) * 2 = untuk pemisah angka (spasi)
		// = n * 2 + (n - 1) * 2 = 4n - 2
		int maxLen = 4 * n - 2;

		// Data segitiga
		byte triangles[][] = new byte[n][maxLen];

		// Loop
		for (int i = 0; i < n; i++)
			// Isi dengan spasi
			Arrays.fill(triangles[i], (byte) ' ');
		
		// Loop
		for (int i = 0; i < n; i++) {
			// Nilai yang akan ditulis
			for (int j = 1; j <= i + 1; j++) {
				int value = ((i + 2) - Math.abs(2 * j - i - 2)) / 2;
				// Puluhan (k) dan satuan (l)
				int k = value / 10 + '0';
				int l = value % 10 + '0';
				
				// Indeks
				int idx = maxLen / 2 - 1 - i * 2 + (j - 1) * 4;
				if (k > '0')
					triangles[i][idx] = (byte) k;
				triangles[i][idx + 1] = (byte) l;
			}
		}

		FileOutputStream output = null;
		try {
			output = new FileOutputStream(Tugas1.class.getName() + ".txt");
			for (int i = 0; i < n; i++) {
				output.write(triangles[i], 1, maxLen / 2 + 2 * i);
				output.write('\n');
			}
		} catch (IOException e) {
			System.out.println("Gagal");
			System.exit(1);
		}

		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace(System.out);
				System.exit(1);
			}
		}
	}
}