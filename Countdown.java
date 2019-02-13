import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a positive integer, and I shall count it down for you by the leading digit. I am a computer, this shit is like vitamins for me!");

		float x = input.nextInt();

		System.out.println("you entered" + x);

		input.close();

		float a = 1;

		System.out.println(x);
		while (10 * a < x) {
			a = 10 * a;
		}
		while (x > 1) {
			if (a >= 1) {
				for (; x - a >= 0; System.out.println(x)) {
					x = x - a;
				}
				a = a / 10;
			}
		}
	}
}