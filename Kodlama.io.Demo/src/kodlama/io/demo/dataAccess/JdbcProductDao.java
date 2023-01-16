package kodlama.io.demo.dataAccess;

import kodlama.io.demo.entities.Course;

public class JdbcProductDao implements IEntitiesDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi.");
       		
	}

}
