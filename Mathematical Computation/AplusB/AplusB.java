import java.util.*;

public class AplusB
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int equations = sc.nextInt();
		int x = 0;
		while (x < equations) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    System.out.println(a + b);
		    x++;
		}
	}
}
