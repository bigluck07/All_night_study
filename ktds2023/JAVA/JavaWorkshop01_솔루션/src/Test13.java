
public class Test13 {

	public static void main(String[] args) {
	
		String mesg = "     홍길동/이순신/유관순     ";
		System.out.println("문자열 길이(공백포함): "  + mesg.length());
		System.out.println("공백제거: "  + mesg.trim());
		System.out.println("공백제거된 문자열 길이: "  + mesg.trim().length());
		System.out.println("부분열: "  + mesg.trim().substring(0, 7));
		System.out.println("홍길동 출력 : "  + mesg.trim().split("/")[0]);
		System.out.println("유관순 출력 : "  + mesg.trim().split("/")[2]);
	
	}
}
