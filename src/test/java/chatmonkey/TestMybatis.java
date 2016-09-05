package chatmonkey;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 

import com.alibaba.fastjson.JSON;
import com.inewstone.wechat.opt.pojo.Menu;
import com.inewstone.wechat.opt.service.IMenuService;

@RunWith(SpringJUnit4ClassRunner.class)   //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})  
public class TestMybatis {
	  
	    private static Logger logger = Logger.getLogger(TestMybatis.class);  
	//  private ApplicationContext ac = null;  
	    @Resource  
	    private IMenuService menuService = null;  
	  
	/*  @Before  
	  public void before() {  
	      ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
	      menuService = (MenuServiceImpl) ac.getBean("userService");  
	  }  */
	  
	    @Test  
	    public void test1() {  
	        Menu menu = menuService.getMenuById(1);  
	       System.out.println(menu.getMenuName());  
	        // logger.info("值："+user.getUserName());  
	        logger.info(JSON.toJSONString(menu));  
	}  
}
