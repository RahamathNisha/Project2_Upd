package test;

import static org.junit.Assert.*;

import java.util.Date;

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
		
		ud = (TUserDAO)ct.getBean("userDetailsDAO");
	}
	
	/*@Test
	public void insData(){
		UserDetails u = new UserDetails();
		u.setId("267");
		u.setDatecreated(new Date());
		u.setAddress("asd");
		u.setName("asd");
		u.setEmail("asdsdfss");
		u.setEnabled("true");
		u.setGender("male");
		u.setIsOnline('y');
		assertTrue(ud.save(u));
	}
	
	@Test
	public void updData(){
		UserDetails u = new UserDetails();
		u.setId("111");
		u.setDatecreated(new Date());
		u.setAddress("asd");
		u.setName("asd");
		u.setEmail("asdsdfss");
		u.setEnabled("true");
		u.setGender("male");
		u.setIsOnline('y');
		assertTrue(ud.update(u));
	}*/
	
	@Test
	public void delData(){		
		assertTrue(ud.delete1("111"));
	}
}
