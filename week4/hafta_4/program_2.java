// switch case
package hafta_4;

public class program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String gun="Pazartesi";//c++ da switch icerisine string atilamazdi.

switch (gun) {

case "Pazartesi":
	System.out.println("Haftanin ilk gunu");
	break; // break yazilmazsa pazartesi girilse bile asagidaki kodlarda ekrana yazdirilir

case "Cuma":
	System.out.println("Haftanin son gunu");
	break;
	
	default:
	System.out.println("Haftanin siradan bir gunu");

	/* switch (gun) {
    case "Pazartesi" -> System.out.println("Hafta başı");
    case "Cuma" -> System.out.println("Hafta sonu geliyor");
    default -> System.out.println("Sıradan bir gün");
    bu sekilde ok icerisinde yazilirsa eger break kullanimina gerek kalmaz.
    */ 
}
}
	}


