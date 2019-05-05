package itheima.ui;



import itheima.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/4/3011:39.
 * @see:
 **/
public class Client {





	public static void main(String[] args) {
		//1.获取容器
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");


		ICustomerService cs= (ICustomerService) ac.getBean("iCustomerService");

		cs.saveCunstomer();

	}
}
