package FactoryPattern;

public class ShapeFactory {

	public static Shape getShape(String shape){
		if(shape == null){
			return null;
		}
		
		if("Circle".equalsIgnoreCase(shape)){
			return new Circle();
		}else if("Rectangle".equalsIgnoreCase(shape)){
			return new Rectangle();
		}else if("Square".equalsIgnoreCase(shape)){
			return new Square();
		}
		//return 程序结束运行
		return null;
	}
}
