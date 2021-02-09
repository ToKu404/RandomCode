import java.io.*;
import java.util.*;

class Tugas3 {
	public static void main(String[] args) {
		int moneyTable[] = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		// double itu tidak presis pada penjumlahan & pengurangan!
		long money = (long) (sc.nextDouble() * 100.0);
		int moneyAmounts[] = {
			0,	// 100.00
			0,	// 50.00
			0,	// 20.00
			0,	// 10.00
			0,	// 5.00
			0,	// 2.00
			0,	// 1.00
			0,	// 0.50
			0,	// 0.25
			0,	// 0.10
			0,	// 0.05
			0,	// 0.01
		};

		for (int i = 0; i < moneyTable.length; i++)
			for (; money >= moneyTable[i]; moneyAmounts[i]++, money -= moneyTable[i]);
		
		try {
			PrintStream out = new PrintStream(Tugas3.class.getName() + ".txt", "UTF-8");
			for (int i = 0; i < moneyTable.length; i++)
				out.printf("%d uang %.2f\n", moneyAmounts[i], moneyTable[i] / 100.0);
			out.close();
		} catch (IOException e) {
			System.out.println("Gagal");
			e.printStackTrace(System.out);
			System.exit(1);
		}
	}
}