package testpackage.services.interfaces;

import testpackage.dao.type.Category;

import java.util.List;

public interface CategoryService {

    public Category getCategoryById(int id);
    public Category getCategoryByName(String name);
    public void insertCategory(Category category);
    public void updateCategory(Category category);
    public void deleteCategoryById(int id);
    public List<Category> getAll();

}
