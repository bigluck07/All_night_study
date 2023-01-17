package student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stdt01 = new Student("Kim", 100, 90, 95, 89);
		Student stdt02 = new Student("Lee", 60, 70, 99, 98);
		Student stdt03 = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(stdt01.getName()+" 평균: "+stdt01.getAvg()+" 학점: "+stdt01.getGrade()+"학점");
		System.out.println(stdt02.getName()+" 평균: "+stdt02.getAvg()+" 학점: "+stdt02.getGrade()+"학점");
		System.out.println(stdt03.getName()+" 평균: "+stdt03.getAvg()+" 학점: "+stdt03.getGrade()+"학점");
	}

}
