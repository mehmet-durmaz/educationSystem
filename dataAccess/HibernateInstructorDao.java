package educationLayeredSystem.dataAccess;

import educationLayeredSystem.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("instructor hibernate ile eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("instructor hibernate ile silindi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("instructor hibernate ile guncellendi");
		
	}

}
