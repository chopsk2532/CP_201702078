import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 반지름,높이;
		double 부피;
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오 : ");
		반지름 = input.nextInt();
		System.out.print("원기둥의 높이를 입력하시오 : ");
		높이 = input.nextInt();
		부피 = 반지름 * 반지름 * 높이 * (Math.PI);
		System.out.print("원기둥의 부피는 "+부피+"입니다.");
		
	}

}
