import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int f = sc.nextInt();
		int s = sc.nextInt();
		String op = sc.next();
		int res = 0;
		
		if(op.equals("+")) {
			res += f + s;
		}
		else if(op.equals("-")) {
			res = f - s;
		}
		else if(op.equals("*")) {
			res = f * s;
		}
		else if(op.equals("/")) {
			res = f / s;
		}
		
		System.out.println(res);

	}

}