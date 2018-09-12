public interface Valuable {
	public double getMoney();
}

interface Protectable {
	public void beProtected();
}
//定义个新的接口，从接口继承，即A有两个方法。
interface A extends Protectable {
	void m();	
}

abstract class Animal {
	private String name;
	
	abstract void enjoy ();
}
//多继承
class GoldenMonkey extends Animal implements Valuable, Protectable {
	public double getMoney() {
		return 10000;
	}
	
	public void beProtected() {
		System.out.println("live in the room");
	}
	
	public void enjoy() {
	
	}
	
	public void test() {
		Valuable v = new GoldenMonkey();
		v.getMoney();
		Protectable p = (Protectable)v;//实现其他接口
		p.beProtected();
	}
}
//A接口继承于Protected，所以实现接口A，必须满足两个接口方法。
class Hen implements A {
	public void m() {}
	public void beProtected() {}
}