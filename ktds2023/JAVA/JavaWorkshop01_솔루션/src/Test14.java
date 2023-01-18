
public class Test14 {

	public static void main(String[] args) {
	
		String mesg = "100/200";
		String [] data = mesg.split("/");
		int n = Integer.parseInt(data[0]);
		int n2 = Integer.parseInt(data[1]);
		System.out.println("정수값 합계: "  + (n+n2) );
		System.out.println("정수값 평균: "  + (n+n2)/data.length );
		
	
	}
}
