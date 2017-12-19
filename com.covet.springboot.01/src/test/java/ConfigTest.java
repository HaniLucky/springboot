import javax.jws.soap.SOAPBinding.Use;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covet.springboot.conf.Config;
import com.covet.springboot.service.UseFunctionService;

public class ConfigTest {

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext 接接收一个配置类做为参数
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UseFunctionService functionService = context.getBean(UseFunctionService.class);
		String sayHello = functionService.sayHello(" word");
		System.out.println(sayHello);
	}
}
