package AbstractFactoryPattern;

public class testDemo {

	public static void main(String[] args) {
		//根据传入的信息获取形状工厂
		ShapeFactory shapefactory = (ShapeFactory)FactoryProducer.getFactory("Shape");
		Shape shape = shapefactory.getShape("circle");
		shape.draw();
		//根据传入的信息获取颜色工厂
		ColorFactory colorfactory = (ColorFactory)FactoryProducer.getFactory("Color");
		Color color = colorfactory.getColor("red");
		color.fill();
	}
}
