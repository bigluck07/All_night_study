import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {
		// IoC 컨테이너
		ApplicationContext ctx = new GenericXmlApplicationContext("com/config/Dept.xml");

		
		//서비스 얻기
		DeptServiceImpl service = ctx.getBean("service", DeptServiceImpl.class);
		List<DeptDTO> list = service.list();
		System.out.println(list);
	}

}
