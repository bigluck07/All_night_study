package student;

public class Student {
	
	private String name;
	private int korean;
	private int english;
	private int math;
	private int scienc;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int korean, int english, int math, int scienc) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.scienc = scienc;
	}
	
	
	public double getAvg() {
		
		return (korean+english+math+scienc)/4.0;
	}
	
	public String getGrade() {
		double avrg = getAvg();
		if (avrg>=90) {
			return "A";
		} else if (avrg >=80) {
			return "B";
		} else if (avrg>=50) {
			return "C";
		} else if (avrg>=30) {
			return "D";
		} else {
			return "F";
		}
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScienc() {
		return scienc;
	}

	public void setScienc(int scienc) {
		this.scienc = scienc;
	}


	

}
