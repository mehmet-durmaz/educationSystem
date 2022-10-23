package educationLayeredSystem.dataAccess;

import educationLayeredSystem.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("category hibernate veritabanina ile eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("category hibernate veritabaninda  silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("category hibernate ile veritabaninda guncellendi");
		
	}

}
