package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		if(colorType == null){
			return null;
		}
		
		if("Blue".equalsIgnoreCase(colorType)){
			return new Blue();
		}else if("Red".equalsIgnoreCase(colorType)){
			return new Red();
		}else if("Yellow".equalsIgnoreCase(colorType)){
			return new Yellow();
		}
		//return 程序结束运行
		return null;
	}

}
