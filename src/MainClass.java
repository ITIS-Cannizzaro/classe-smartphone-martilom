import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Indicare Marca");
		String a=scan.nextLine();
		System.out.println("Indicare Modello");
		String b=scan.nextLine();
		System.out.println("Indicare Prezzo");
		double c=scan.nextDouble();
		System.out.println("Indicare Pollici");
		double d=scan.nextDouble();
		System.out.println("Indicare GB Ram");
		int e=scan.nextInt();
		System.out.println("Indicare se ha il Touchscreen");
		boolean f=scan.nextBoolean();
		Smartphone prova=new Smartphone("Xiaomi","Xiaomi Redmi 12c",119,6.71,4,true);
		Smartphone provaa=new Smartphone(a,b,c,d,e,f);
		System.out.println("Smartphone 1");
		prova.FasciaPrezzo();
		System.out.println("--------------------------------------");
		System.out.println("Smartphone 2");
		provaa.FasciaPrezzo();
		System.out.println("--------------------------------------");
		System.out.println("Smartphone 1");
		prova.Tipo();
		System.out.println("--------------------------------------");
		System.out.println("Smartphone 2");
		provaa.Tipo();
		System.out.println("--------------------------------------");
		System.out.println("Smartphone 1");
		prova.Tutto();
		System.out.println("--------------------------------------");
		System.out.println("Smartphone 2");
		provaa.Tutto();
		
	}

}