package exam08;

public class Cat extends Pet {

	String sex;
	public Cat() {
		super();
	}
	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	public Cat(String name, int age) {
		super(name, age);
	}
	public void sleep() {}
	
	@Override
	public String toString() {
		return "Cat [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
