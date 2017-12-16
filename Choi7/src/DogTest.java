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
		System.out.println("이름: "+name+" 나이 : "+age+" 종: "+breed);
	}
}
public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dg1 = new Dog("개1",18);
		dg1.print();
		Dog dg2 = new Dog("개2",20,"인간");
		
		dg1.print();
		
	}

}
