import java.util.Random;
import java.util.Scanner;

public class TypingTest {

	public static void main(String[] args) {
		
		String[] words = { "JAVA", "java", "CJ", "cj" , "LOVE"}; 
		
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("============================");
			System.out.println("[타자 연습]");
			System.out.println("1.시작");
			System.out.println("2.종료");
			System.out.println("============================");
			System.out.print("메뉴 입력 => ");
			String inputMenu = s.next();
			if (inputMenu.equals("1")) {
				double result = 0.0;
				double good = 0.0;
				long startTime = System.currentTimeMillis();
				
				System.out.println("전체 단어 리스트");
				System.out.println("============================================");
				for (String str : words) {
					System.out.print(str+"\t");
				} 
				System.out.println("\n============================================");
				Random rand = new Random();
				for (int i = 5; i > 0; i--) {
					System.out.println("\n남은 단어수 : " + i);
					int r = rand.nextInt(i);
					String rStr = words[r];
					System.out.println("\n제공단어:"+rStr);
					System.out.print("타이핑 입력 => ");
					String inputTyping = s.next();
					if (rStr.equals(inputTyping)) {
						System.out.println("띵동!");
						good++;
					} else {
						System.out.println("땡!");
					}
					for (int j = r; j < i - 1; j++) {
						words[j] = words[j + 1];
					}
				}
				result = good/5*100;
				long endTime = System.currentTimeMillis();
				System.out.println("----------------------------");
				System.out.println("성공율 : "+result+"%");
				System.out.println("시간 : "+(double)((endTime-startTime)/1000)+"초");
				System.out.println("----------------------------");
			}else if(inputMenu.equals("2")) {
				break;
			}else{
				System.out.println("잘못 입력하셨습니다. 확인후 다시 입력하세요");
			}
		}

		System.out.println("프로그램 종료");
	}//end main
}//end class
