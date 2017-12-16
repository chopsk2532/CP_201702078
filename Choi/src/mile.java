import java.util.Scanner;

public class mile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mile;
		double km;
		System.out.print("마일을 입력하시오 : ");
		mile = input.nextDouble();
		km = mile * 1.609;
		System.out.println(mile + "마일은 " + km +"킬로미터입니다.");
		
	}

}
