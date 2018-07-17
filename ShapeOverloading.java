
class Square {
	double side;
}

class Triangle {
	double baseLength;
	double height;
}

class Circle {
	double radius;
}

class Shape {
	public double calculateArea(Square sq) {
		return sq.side * sq.side;
	}

	public double calculateArea(Circle c) {
		return c.radius * c.radius * 3.14;
	}

	public double calculateArea(Triangle t) {
		return t.baseLength * t.height * 0.5;
	}
}

public class ShapeOverloading {
	public static void main(String[] args) {
		Square s = new Square();
		s.side = 18;
		double ar = new Shape().calculateArea(s);
		System.out.println("Area is " + ar);
	}
}
