import java.util.Scanner;
class Shape{
	 int width;
	 int height;
	 int area;
	 public Shape(int width,int height) {
		 this.width=width;
		 this.height=height;
	 }
	
	 public int Area(){
		 return area;
	 }
}
class Rectangle extends Shape{

	 public Rectangle(int width, int height) {
		super(width, height);
		this.width=width;
		this.height=height;
	 }
	
	public int Area() {
		return width*height;
		
	}
}
class Triangle extends Shape{
	
	public Triangle(int width, int height) {
		super(width, height);
		this.width=width;
		this.height=height;
	}

	public int Area() {
		return (int)(width*height)/2;
		
	}
}
class Circle extends Shape{
	
	public Circle(int width, int height) {
		super(width, height);
		this.width=width;
		this.height=height;
	}

	public int Area() {
		 return (int)((int)3.14*0.5*width);
		
	}
}

public class Test {
public static void main(String args[]) {
	int x;
	int y;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("가로의 길이를 입력해주십시오 : ");
	x = sc.nextInt();
	System.out.print("높이의 길이를 입력해주십시오 : ");
	y = sc.nextInt();
	Rectangle re = new Rectangle(x,y);
	Triangle tr = new Triangle(x,y);
	Circle cr = new Circle(x,y);
	
	Shape[] shape = new Shape[3];
	shape[0]=re;
	shape[1]=tr;
	shape[2]=cr;
	 for (int i = 0; i < shape.length; i++) {
		 System.out.println(shape[i].Area());
	 }



	
}
}
