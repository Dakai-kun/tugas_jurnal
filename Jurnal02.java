import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);

		int D = input.nextInt();

		int square = D * D;
		
		Double LB = 4.0 * 3.14 * square;
		
		int cubic = D * D * D;
		
		Double VB = (4.0/3.0) * 3.14 * cubic;
		
		
		System.out.print(df.format(VB));
		System.out.print(" ");
		System.out.format("%.2f", LB);

	}
}
