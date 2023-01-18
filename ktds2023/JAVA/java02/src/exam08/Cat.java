package exam08;

public class Cat extends Pet {
	
	String sex;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	
	public void sleap() {
		
	}

	@Override
	public String toString() {
		return "Cat [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}
	

}
