package misc;

public class FunnyString {public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int c = 0; c < n; c++) {
			String str = sc.next();

			String rev = new StringBuilder(str).reverse().toString();

			int i = 1;
			boolean isFunny = true;
			while (i < str.length() - 1) {

				if (Math.abs(str.charAt(i) - str.charAt(i - 1)) != Math.abs(rev.charAt(i) - rev.charAt(i - 1))) {
					isFunny = false;
					break;
				}
				i++;
			}
			if (isFunny)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
	}
}
