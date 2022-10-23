package educationLayeredSystem.dataAccess;

import educationLayeredSystem.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("category jdbc ile veritabanina eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("category jdbc ile veritabanindan silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("category jdbc ile veritabaninda guncellendi");
		
	}
	
}
