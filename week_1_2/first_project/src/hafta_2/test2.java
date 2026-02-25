package hafta_2;

import java.util.Scanner; //scanner sinifini kullanmak icin

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final double g; // final burada const ile ayni mantikta. sonradan degistirilemez.
		System.out.print("Yercekim giriniz");
		g=in.nextDouble(); // g ye degeri atanir degismemek uzere
		System.out.printf("Yercekimi degeri: %f\n",g);
				
	}

}
