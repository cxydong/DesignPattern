package DecoratorPattern;
/*
 *装饰者对象接口,实现和被装饰者一样的接口
 */
public abstract class ShapeDecorator implements Shape{

	//提供被装饰者接口的实现类,不改变起功能,只是增加功能,所以需要改实现类
	public Shape decoratedShape;
	//构造函数,传入被装饰接口的实现类
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
	}
	
}
