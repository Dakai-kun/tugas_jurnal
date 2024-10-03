import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int P = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();

		Double result = (25.0 / 100.0) * P + (35.0 / 100.0) * A + (40.0 / 100.0) * B;
		boolean test = result >= 75;

		System.out.println(result);
		System.out.println("Lulus MK: " + test);

	}
}
