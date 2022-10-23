package educationLayeredSystem.dataAccess;

import educationLayeredSystem.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("instructor jdbc ile veritabanina eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("instructor jdbc ile veritabanindan silindi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("instructor jdbc ile veritabaninda guncellendi");
	}

}
