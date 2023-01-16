package kodlama.io.demo.dataAccess;

import kodlama.io.demo.entities.Course;

public class HibernateProductDao implements IEntitiesDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi.");
		
	}

}
