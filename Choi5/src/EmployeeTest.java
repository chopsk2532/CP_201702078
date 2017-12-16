class Employee {
	String name;
	String phone;
	int yearincome;
	

	public String getName()  { return  name; }
	public void setName(String n) { name = n; }
	public String getPhone() { return phone;}
	public void setPhone(String p) { phone = p; }
	public int getYearincome() { return yearincome;}
	public void setYearincome(int y) {yearincome = y; }

}


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee first = new Employee();
		first.setName("최대우");
		first.setPhone("0109497038");
		first.setYearincome(200000);
		
		System.out.println("이름 :  "+first.getName());
		System.out.println("전화 번호 : "+first.getPhone());
		System.out.println("연봉 : "+first.getYearincome()+"달러");
	}

}
