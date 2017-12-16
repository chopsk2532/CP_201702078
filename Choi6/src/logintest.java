import java.util.Scanner;
class loginn {
	
	String id,pass;
	
	public String getId()  { return  id; }
	public void setId(String i) { id = i; }
	public String getPass() { return pass;}
	public void setPass(String p) { pass = p; }
	
	
	public void userid() {
		Scanner input = new Scanner(System.in);
		System.out.print("아이디를 입력하시오 : ");
		id = input.nextLine();
		System.out.print("비밀번호를 입력하시오 : ");
		pass = input.nextLine();
		
	}

	public void login() {
		System.out.println("<로그인>");
	String loginid,loginpass;
	Scanner sc = new Scanner(System.in);
	System.out.print("ID : ");
	loginid = sc.nextLine();
	System.out.print("PASSWORD : ");
	loginpass = sc.nextLine();
	
	if (id == loginid && pass == loginpass) 
		System.out.print("로그인에 성공하였습니다.");
		else if (id != loginid && pass != loginpass ) 
			System.out.print("로그인에 실패하셨습니다.");
	}
	
	}
	
	




public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<계정생성>");
		loginn log = new loginn();
		log.userid();
		log.login();
	}

}
