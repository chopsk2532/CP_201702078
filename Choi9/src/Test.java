class Person{
	String name,adress,phone;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String a) {
		adress = a;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String p) {
		phone = p;
	}
}
class Customer extends Person{
	int number,mileage;
	
	public int getnumber() {
		return number;
	}
	public void setnumber(int a) {
		number = a;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int m) {
		mileage = m;
	}
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+adress);
		System.out.println("전화번호 : "+phone);
		System.out.println("고객번호 : "+number);
		System.out.println("마일리지 : "+mileage);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Customer per = new Customer();
	per.setName("최대우");
	per.setAdress("충남대학교");
	per.setPhone("01094977038");
	per.setnumber(264);
	per.setMileage(15442);
	per.print();
	
	}
}
