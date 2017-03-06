package test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.config.ApplicationContextConfig;
import com.niit.collaboration.dao.TUserDAO;
import com.niit.collaboration.model.UserDetails;


public class TUserDAOTestCase{

	static AnnotationConfigApplicationContext ctx;
	static TUserDAO tUserDAO;
	
	static{
		ctx = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		ctx.refresh();
		tUserDAO = (TUserDAO)ctx.getBean("userDetailsDAO");
	}
	
	@Test
	public void proc(){
		UserDetails ud = new UserDetails();
		ud.setEmail("m1@m.c");
		ud.setName("asd");
		ud.setAddress("add1");
		ud.setDatecreated(new Date());
		ud.setEnabled("true");
		ud.setErrorCode(null);
		ud.setErrorMessage(null);
		ud.setGender("m");
		ud.setIsOnline('N');
		ud.setMobileNo("123123");
		ud.setPassword("123123");
		ud.setReason(" ");
		ud.setStatus('0');
		assertTrue(tUserDAO.save(ud));
	}
}
