import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final  double PI = 3.14;
		int r;
		
		System.out.println("Yarıçapı Girin: ");
		r = scan.nextInt();
		
		double alan = PI*r*r;
		double cevre = 2*PI*r;
		
		System.out.println("Dairenin Alanı: " + alan);
		System.out.println("Dairenin Çevresi: " + cevre);
		
	}

}
