package testpackage.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testpackage.dao.type.Category;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {

    public Category getCategoryById(int id);
    public Category getCategoryByName(String name);
    public void insertCategory(Category category);
    public void updateCategory(Category category);
    public void deleteCategoryById(int id);
    public List<Category> getAll();

}
