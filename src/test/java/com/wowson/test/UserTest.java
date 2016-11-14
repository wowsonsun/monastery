package com.wowson.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wowson.model.User;
import com.wowson.service.UserService;
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:conf/spring-mybatis.xml","classpath:conf/spring.xml"})
public class UserTest {
	//@Autowired
	private UserService userService;

	@Before
	public void before() {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println(Class.forName("com.mysql.jdbc.Driver"));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1231465");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring-mybatis.xml","classpath:spring.xml"});
		userService = (UserService) context.getBean("userServiceImpl");
	}

	@Test
	public void addUser() {
		User user = new User();
		String id ="1";
		user.setNickname("双十一");
		user.setState(11111);
		System.out.println(userService.insertUser(user));
	/*	User listUser = userService.findAllUserById(id);
		System.out.println("id==1::"+listUser.getNickname());*/
		/*List<User> listUser = userService.findAllUserById(id)
		for(int i=0; i<listUser.size();i++){
			System.out.println(listUser.get(i));
		}*/
	}
}
