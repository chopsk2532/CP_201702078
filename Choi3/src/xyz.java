import java.util.Scanner;
public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		
		Scanner input = new Scanner(System.in);		
		System.out.print("첫번쨰숫자를 입력하시오 : ");
		x = input.nextInt();
		System.out.print("두번쨰 숫자를 입력하시오 : ");
		y = input.nextInt();
		System.out.print("세번째 숫자를 입력하시오 : ");
		z = input.nextInt();
		
		if (x>y && x>z) {
			if (y>z)
			System.out.print(x+">"+y+">"+z);
			else if (z>y)
			System.out.print(x+">"+z+">+y");
			}
		else if (y>x && y>z) {
			if (x>z) 
			System.out.print(y+">"+x+">"+z);
			else if (z>x)
			System.out.print(y+">"+z+">"+x);
			}
		else if (z>x && z>y) {
			if (x>y)
			System.out.print(z+">"+x+">"+y);
			else if (y>x)
			System.out.print(z+">"+y+">"+x);
		}

			
	
	
	
	
	
	}

}
