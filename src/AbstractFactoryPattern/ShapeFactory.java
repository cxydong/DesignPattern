package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType == null){
			return null;
		}
		
		if("Circle".equalsIgnoreCase(shapeType)){
			return new Circle();
		}else if("Rectangle".equalsIgnoreCase(shapeType)){
			return new Rectangle();
		}else if("Square".equalsIgnoreCase(shapeType)){
			return new Square();
		}
		//return 程序结束运行
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		return null;
	}

}
