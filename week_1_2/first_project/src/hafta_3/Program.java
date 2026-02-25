package hafta_3;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int sayilar[10]; atanmamis bir dizi olusturulamaz. olustumak icin hesapte olusturulmasi lazim
		int[] sayilarHeap = new int[5];
		//veya
		int sayilarStack[] = {1,2};
		System.out.println(sayilarStack); //dizinin adresini dondurur.
		
		Sayi s = new Sayi(500);
		System.out.println(s.deger);
		
		//----------------------------
		
		double a=10.5;
		Object obj=a;
		obj= "Sakarya";
		System.out.println(obj);
		// javada her sey objectten miras alinir.
		// onceki satirda icine double koymus olsak bile, bir sonraki satirda o sayıyı cope atip yerine "Sakarya" (bir String nesnesi) koyabilir. Java bunu kabul eder cunku her iki veri turu de aslinda birer Object torunudur.
		
		
	}

}
