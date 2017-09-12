package SingletonPattern;

public class testDemo {

	public static void main(String[] args) {
		//获得唯一对象
		Single single = Single.getSingle();
		//执行方法
		single.run();
	}
}
