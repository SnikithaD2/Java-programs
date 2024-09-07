class Shape{
	void getArea(){
		int area = 0;
	}
class Rectangle extends Shape{
	void getArea(){
		int area = 2 * (10 + 5);
		System.out.println("Area of rectangle is " + area);
	}
}
public static void main(String[] args){
		Shape s = new Shape();
		Shape.Rectangle r = s.new Rectangle();
		r.getArea();
	}
}