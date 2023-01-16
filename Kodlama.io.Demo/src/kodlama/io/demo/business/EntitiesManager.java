package kodlama.io.demo.business;

import kodlama.io.demo.core.logging.ILogger;
import kodlama.io.demo.dataAccess.HibernateProductDao;
import kodlama.io.demo.dataAccess.IEntitiesDao;
import kodlama.io.demo.dataAccess.JdbcProductDao;
import kodlama.io.demo.entities.Course;

public class EntitiesManager {
	private IEntitiesDao entitiesDao;
	private ILogger[] loggers;
	
	
	public EntitiesManager(IEntitiesDao entitiesDao, ILogger[] loggers) {
		this.entitiesDao = entitiesDao;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception {
		//iş kuralları yazılır
		if(course.getUnitPrice() < 0) {
			throw new Exception("Kurs fiyati 0'dan kucuk olamaz.");
			
		}
		entitiesDao.add(course);
		
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
			
		}
		
	}
	

}
