import java.util.Scanner;

public class meter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double 평;
		double meter;
		
		System.out.print("평을 입력하십시오 : ");
		평  = input.nextDouble();
		meter = 3.3058*평;
		System.out.print("평방미터 :"+meter);
		
		
	}

}
