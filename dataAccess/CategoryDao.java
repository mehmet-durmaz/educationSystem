package educationLayeredSystem.dataAccess;

import educationLayeredSystem.entities.Category;

public interface CategoryDao {
	void add(Category category);
	void delete(Category category);
	void update(Category category);
	
}