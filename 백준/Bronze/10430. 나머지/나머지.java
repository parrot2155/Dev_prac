import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d\n%d\n%d\n%d", (a + b) % c, ((a % c) + (b % c)) % c, (a * b) % c, ((a % c) * (b % c)) % c);
     }
}