package DecoratorPattern;

public class testDemo {

	public static void main(String[] args) {
		//Shape的实现类
		Circle circle = new Circle();
		RedShapeDecorator circleDecorator = new RedShapeDecorator(circle);
		//装饰前的功能
		System.out.println("装饰前的功能");
		circle.draw();
		//装饰后的功能
		System.out.println("装饰后的功能");
		circleDecorator.draw();
	}
}
