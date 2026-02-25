package hafta_1;
import java.util.Scanner;

public class my_first_code { //dosya adıyla aynı olmali

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello java"); //ekrana yazdirma //imlec satir atlar ve sonraki satirda bekler.
		
		Scanner in = new Scanner(System.in);
		System.out.print("lutden bir sayi giriniz"); //imlec z'den sonra bekler
		int sayi = in.nextInt(); // program burada veri girisini bekler.
		System.out.printf("girdiginiz sayi: %d\n",sayi); //C tarzi yazdirma, %d gibi formatli yazdirma icin 
		in.close();
		// printf mantigi: %isareti koyuldugunsa bilisayar oraya bir degisken gelecegini anlar.
		//alternatif ve ugrastrici yol: System.out.println("Benim adim " + isim + ", ben " + yas + " yasindayim ve " + hedefPara + " dolar kazanacagim.");
		System.out.printf("Birinci sayi: %d\n", 10); // burada \n sayiyi yazdirdiktan sonra yeni satira atlar.s
		System.out.printf("Ikinci sayi: %d", 20);
		
	}

}
