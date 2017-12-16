import java.util.Scanner;

class reverse {
	String str;
	String rev;
	
	public String getStr()  { return  str; }
	public void setStr(String s) { str = s; }
	public String getRev() { return rev;}
	public void setRev(String r) { rev = r;} 
	
	public static String reverse(String str) {
		String rev="";
		int l = str.length();
		for (int i = l-1;i>=0;i--)
			rev = rev + str.charAt(i);
		return rev;
	}
	
}

public class Reversetest {

	public static void main(String args[]) {
	String str;
	
	Scanner input = new Scanner(System.in);
	System.out.print("문자열을 입력하시오 : ");
	str = input.nextLine();	
	reverse rev = new reverse();
	System.out.print(rev.reverse(str));

	}
}
