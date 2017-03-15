package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.niit.collaboration.dao.TUserDAO;
import com.niit.collaboration.model.UserDetails;

public class UserTest {

	@Autowired
	static AnnotationConfigWebApplicationContext ct;
	
	@Autowired
	static TUserDAO ud;
	
	@BeforeClass
	public static void init(){
		ct = new AnnotationConfigWebApplicationContext();
		ct.scan("com.niit.collaboration");
		ct.refresh();
		
		ud = (TUserDAO)ct.getBean("TUserDAOImpl");
	}
	
	@Test
	public void insData(){
		UserDetails u = new UserDetails();
		u.setAddress("asd");
		u.setName("asd");
		u.setEmail("asdsdfss");
		ud.save(u);
	}
}
