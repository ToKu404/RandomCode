import java.util.Scanner;

/* f(x) = (x^3/(3)) - (x^2/(10)) - x + 5
	jumlahan riemann yang akan dibahas adalah integral f(x) dx
	*/
	

class RiemannSum{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Masukkan A : ");
		int a = read.nextInt();
		System.out.print("Masukkan B : ");
		int b = read.nextInt();
		read.close();
		System.out.println("integral dari f(x) =  (x^3/("+(b+3)+")) - (x^2/("+(a+6)+")) - x + 5");
		System.out.println("<--> (x^4/"+(4*(b+3))+") - (x^3/"+(3*(a+6))+") - (x^2/2) + 5x");
		System.out.println("solusi analitik :");
		System.out.println("<--> [(x^4/"+(4*(b+3))+") - (x^3/"+(3*(a+6))+") - (x^2/2) + 5x] [-2,3]");

		double analitik = (Math.pow(3, 4)/(float)(4f*(b+3))) - (Math.pow(3, 3)/(float)(3f*(a+6))) - (Math.pow(3, 2)/2f) + (5*3);
		analitik -= ((Math.pow(-2, 4))/(float)(4f*(b+3))) - ((Math.pow(-2, 3))/(float)(3f*(a+6))) - ((Math.pow(-2, 2))/2f) + (5*(-2));
		System.out.println("untuk solusi analitik didapatkan : ");
		System.out.printf("<--> %.4f\n", analitik);

		double n[] = {5, 10, 20};
		double partisi[] = new double[3];
		for(int i = 0; i < 3; i++)
		{
			partisi[i] = 5/n[i];
			System.out.println("ukuran partisi utk n = " + n[i] + " adalah " + partisi[i]);
		}
		System.out.println();

		double ci1[][] = new double[3][20]; // ci u/ kanan
		double ci2[][] = new double[3][20]; // ci u/ kiri
		double ci3[][] = new double[3][20]; // ci u/ tengah

		System.out.println("ci batas kanan :");
		// ci = a + dx*i (kanan)
		for(int i = 0; i < 3; i++)
		{	
			for(int j = 1; j <= n[i]; j++)
			{
				ci1[i][j-1] = -2 + partisi[i]*j;
			}
		}
		display(ci1);
		System.out.println();

		System.out.println("ci batas kiri :");
		// ci = a + dx*(i-1) (kiri)
		for(int i = 0; i < 3; i++)
		{
			for(int j = 1; j <= n[i]; j++)
			{
				ci2[i][j-1] = -2 + partisi[i]*(j-1);
			}
		}
		display(ci2);
		System.out.println();

		System.out.println("ci batas tengah :");
		// ci = a + dx*((in-i(n-1)/2) (tengah)
		for(int i = 0; i < 3; i++)
		{
			for(int j = 1; j <= n[i]; j++)
			{
				ci3[i][j-1] = -2 + partisi[i]*((j + (j-1))/2f);
			}
		}
		display(ci3);
		System.out.println();

		double fci1[][] = new double[3][20]; // fci u/ kanan
		double fci2[][] = new double[3][20]; // fci u/ kiri
		double fci3[][] = new double[3][20]; // fci u/ tengah

		System.out.println("fci untuk setiap partisi batas kanan");

		//(kanan)
		// f(x) = (x^3/(3)) - (x^2/(10)) - x + 5
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < n[i]; j++)
			{
				fci1[i][j] = (Math.pow(ci1[i][j],3)/(float)(b+3)) - (Math.pow(ci1[i][j],2)/(float)(a+6)) - ci1[i][j] + 5;
			}
		}
		display(fci1);
		System.out.println();

		System.out.println("fci untuk setiap partisi batas kiri");

		//(kiri)
		// f(x) = (x^3/(3)) - (x^2/(10)) - x + 5 
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < n[i]; j++)
			{
				fci2[i][j] = (Math.pow(ci2[i][j],3)/(float)(b+3)) - (Math.pow(ci2[i][j],2)/(float)(a+6)) - ci2[i][j] + 5;
			}
		}
		display(fci2);
		System.out.println();

		System.out.println("fci untuk setiap partisi batas tengah");

		//(tengah)
		// f(x) = (x^3/(3)) - (x^2/(10)) - x + 5 
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < n[i]; j++)
			{
				fci3[i][j] = (Math.pow(ci3[i][j],3)/(float)(b+3)) - (Math.pow(ci3[i][j],2)/(float)(a+6)) - ci3[i][j] + 5;
			}
		}
		display(fci3);
		System.out.println();

		double riemann_sum1[] = new double[3]; // hasil jumlah semua partisi batas kanan
		double riemann_sum2[] = new double[3]; // hasil jumlah semua partisi batas kiri
		double riemann_sum3[] = new double[3]; // hasil jumlah semua partisi batas tengah
		double area1[][] = new double[3][20]; // daerah luasan untuk batas kanan u/ setiap n
		double area2[][] = new double[3][20]; // daerah luasan untuk batas kiri u/ setiap n
		double area3[][] = new double[3][20]; // daerah luasan untuk batas tengah u/ setiap n

		System.out.println("ukuran luas setiap partisi batas kanan");
		// menghtiung f(ci)*dx (kanan)
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < n[i]; j++)
			{
				area1[i][j] = fci1[i][j] * partisi[i];
				riemann_sum1[i] += area1[i][j];
			}
		}
		display(area1);
		System.out.println();

		System.out.println("ukuran luas setiap partisi batas kiri");
		// menghtiung f(ci)*dx (kiri)
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < n[i]; j++)
			{
				area2[i][j] = fci2[i][j] * partisi[i];
				riemann_sum2[i] += area2[i][j];
			}
		}
		display(area2);
		System.out.println();

		System.out.println("ukuran luas setiap partisi batas tengah");
		// menghtiung f(ci)*dx (tengah)
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < n[i]; j++)
			{
				area3[i][j] = fci3[i][j] * partisi[i];
				riemann_sum3[i] += area3[i][j];
			}
		}
		display(area3);
		System.out.println();

		System.out.println("batas kanan");
		for(int i = 0; i < 3; i++)
		{
			System.out.println("luas u/ n = " + n[i] + " adalah " + riemann_sum1[i]);
		}

		System.out.println("batas kiri");
		for(int i = 0; i < 3; i++)
		{
			System.out.println("luas u/ n = " + n[i] + " adalah " + riemann_sum2[i]);
		}

		System.out.println("batas tengah");
		for(int i = 0; i < 3; i++)
		{
			System.out.println("luas u/ n = " + n[i] + " adalah " + riemann_sum3[i]);
		}



	}

	static void display(double a[][])
	{
		int n[] = {5, 10, 20};
		for(int i = 0; i < 3; i++)
		{
			System.out.println("n = " + n[i]);
			for(int j = 0; j < n[i]; j++)
			{
				System.out.print("<--> ");
				System.out.printf("%.4f\n",a[i][j]);
			}
			System.out.println();
		}
	}

}