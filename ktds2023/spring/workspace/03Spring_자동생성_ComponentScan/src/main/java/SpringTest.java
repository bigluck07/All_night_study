import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptServiceImpl;


public class SpringTest {

	public static void main(String[] args) {
		// spring 전 코드
//		DeptServiceImpl service = new DeptServiceImpl();
		
		//spring 코드 순서
		/*
		 * 1. 빈 (DeptServiceImpl) 작성
		 * 2. xml에 등록
		 * 3. IoC Container에게 xml 등록
		 * 		==> IoC Container는 빈( XXXApplicationContext )
		 */
		ApplicationContext ctx = new GenericXmlApplicationContext("dept.xml"); // 직접 new
		
		// IoC 컨테이너가 생성된 빈 참조 방법
		// 문법: 클래스명 변수 = ctx.getBean("id값", 클래스명.class);
		DeptServiceImpl service = ctx.getBean("x", DeptServiceImpl.class);
		List<String> list = service.list();
		System.out.println(list);
		
		
	}

}
