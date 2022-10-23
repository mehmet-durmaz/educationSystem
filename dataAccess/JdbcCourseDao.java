package educationLayeredSystem.dataAccess;

import educationLayeredSystem.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("course jdbc ile veritabanina eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("course jdbc ile veritabanindan silindi");
	}

	@Override
	public void update(Course course) {
		System.out.println("course jdbc ile veritabaninda guncellendi");
		
	}

}
