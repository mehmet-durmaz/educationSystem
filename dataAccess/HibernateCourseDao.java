package educationLayeredSystem.dataAccess;

import educationLayeredSystem.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("course hibernate ile eklendi ");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("course hibernate ile silindi ");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("course hibernate ile guncellendi  ");
		
	}

}
