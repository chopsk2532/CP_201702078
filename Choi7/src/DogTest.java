class Dog {
	
	public String name;
	public int age;
	public static String breed;
	
	public String setName()	{ return name;}
	public void getName(String n) { name = n;}
	public int setAge() 	{ return age;}
	public void getAge(int a) 	{ age = a;}

	public Dog(String n, int a) {
	 name = n;
	 age = a;
	 breed = null;
	}
	public Dog(String n,int a,String b) {
		name = n;
		age = a;
		breed =b;
	}

	public void print() {
		System.out.println("�̸�: "+name+" ���� : "+age+" ��: "+breed);
	}
}
public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dg1 = new Dog("��1",18);
		dg1.print();
		Dog dg2 = new Dog("��2",20,"�ΰ�");
		
		dg1.print();
		
	}

}
