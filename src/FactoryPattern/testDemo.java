package FactoryPattern;

public class testDemo {

	public static void main(String[] args) {
		//通过类型信息来获取具体的对象
		Shape circle = ShapeFactory.getShape("Circle");
		circle.draw();
		//长方形
		Shape rectangle = ShapeFactory.getShape("Rectangle");
		rectangle.draw();
		//正方形
		Shape square = ShapeFactory.getShape("Square");
		square.draw();
	}
}
