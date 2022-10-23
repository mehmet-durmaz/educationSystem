package educationLayeredSystem.business;

import educationLayeredSystem.dataAccess.CategoryDao;
import educationLayeredSystem.dataAccess.HibernateCategoryDao;
import educationLayeredSystem.dataAccess.JdbcCategoryDao;
import educationLayeredSystem.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	
	
	
	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
		
	}


	public void add(Category category) {
		System.out.println(category.getCategoryName() + " isimli kategori olusturuldu " + "id numarasi: " + category.getId());
		categoryDao.add(category);
		
	}
	
}
