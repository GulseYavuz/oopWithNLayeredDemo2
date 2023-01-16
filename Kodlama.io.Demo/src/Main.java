import kodlama.io.demo.business.EntitiesManager;
import kodlama.io.demo.core.logging.DatabaseLogger;
import kodlama.io.demo.core.logging.FileLogger;
import kodlama.io.demo.core.logging.ILogger;
import kodlama.io.demo.core.logging.MailLogger;
import kodlama.io.demo.dataAccess.HibernateProductDao;
import kodlama.io.demo.dataAccess.IEntitiesDao;
import kodlama.io.demo.dataAccess.JdbcProductDao;
import kodlama.io.demo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course("Java Gelistirme Kampi", 89);
		ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		EntitiesManager entitiesManager = new EntitiesManager(new JdbcProductDao(), loggers);
		
		entitiesManager.add(course1);
		

	}

}
