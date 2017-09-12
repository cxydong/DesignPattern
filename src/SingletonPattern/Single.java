package SingletonPattern;

public class Single {

	private static Single single = new Single();
	//私有化构造函数
	private Single(){}
	//返回唯一实例
	public static Single getSingle(){
		return single;
	}
	public void run(){
		System.out.println("单例模式");
	}
}
