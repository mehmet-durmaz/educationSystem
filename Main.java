package educationLayeredSystem;

import educationLayeredSystem.business.CategoryManager;
import educationLayeredSystem.dataAccess.HibernateCategoryDao;
import educationLayeredSystem.dataAccess.JdbcCategoryDao;
import educationLayeredSystem.entities.Category;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category();
		category1.setId(6);
		category1.setCategoryName("bebek bezi");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
		categoryManager.add(category1);
		

	}

}
