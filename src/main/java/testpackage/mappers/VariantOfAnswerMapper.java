package testpackage.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testpackage.dao.type.VariantOfAnswer;

import java.util.List;

@Mapper
@Repository
public interface VariantOfAnswerMapper {

    public VariantOfAnswer getVariantOfAnswerById(int id);
    public VariantOfAnswer getVariantOfAnswerByName(String name);
    public void insertVariantOfAnswer(VariantOfAnswer variantOfAnswer);
    public void updateVariantOfAnswer(VariantOfAnswer variantOfAnswer);
    public void deleteVariantOfAnswerById(int id);
    public List<VariantOfAnswer> getAll();

}
