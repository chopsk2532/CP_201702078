import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    double 키,체중,표준체중;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("키를 입력하시오 : ");
    키 = input.nextDouble();
    System.out.print("체중을 입력하시오 : ");
    체중 = input.nextDouble();
    
    표준체중 = (키 - 100)*0.9;
    if (표준체중-표준체중*0.1<체중 && 체중<표준체중+표준체중*0.1 )
    	System.out.print("정상 체중입니다.");
    else if (체중>표준체중+표준체중*0.1)
    	System.out.print("과체중입니다.");
    else if (체중<표준체중-표준체중*0.1)
    	System.out.print("저체중입니다.");
 
	
	}

}
