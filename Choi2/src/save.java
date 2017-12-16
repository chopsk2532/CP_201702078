import java.util.Scanner;

public class save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 오백원;
		int 백원;
		int 오십원;
		int 십원;
		int sum;
		
		Scanner input = new Scanner(System.in);
		System.out.print("오백원의 개수를 입력하시오 : ");
		오백원 = input.nextInt();
		System.out.print("백원의 개수를 입력하시오 : ");
		백원 = input.nextInt();
		System.out.print("오십원의 개수를 입력하시오 : ");
		오십원 = input.nextInt();
		System.out.print("십원의 개수를 입력하시오 : ");
		십원 = input.nextInt();
		
		sum = (오백원*500)+(백원*100)+(오십원*50)+(십원*10);
		
		System.out.print("저금통에 들어있는 총 액수 : "+sum);
		
	}

}
