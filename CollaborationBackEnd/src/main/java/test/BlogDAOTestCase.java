package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.config.ApplicationContextConfig;
import com.niit.collaboration.dao.BlogDAO;
import com.niit.collaboration.dao.TUserDAO;
import com.niit.collaboration.model.Blog;

public class BlogDAOTestCase {
	static AnnotationConfigApplicationContext ctx;
	static BlogDAO blogDAO;
	
	static{
		ctx = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		ctx.refresh();
		blogDAO = (BlogDAO)ctx.getBean("blogDAO");
	}

	@Test
	public void show()
	{
		Blog bd=new Blog();
		bd.setTitle("java");
		bd.setDescription("intro");
		assertTrue(blogDAO.save(bd));
		
	}
}
