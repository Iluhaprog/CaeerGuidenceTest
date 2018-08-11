package testpackage.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testpackage.dao.type.Question;
import testpackage.dao.type.VariantOfAnswer;

import java.util.List;

@Mapper
@Repository
public interface QuestionMapper {

    public Question getQuestionById(int id);
    public Question getQuestionByName(String name);
    public void insertQuestion(Question question);
    public void updateQuestion(Question question);
    public void deleteQuestionById(int id);
    public List<Question> getAll();

    public List<VariantOfAnswer> getVariantOfAnswerByIdOfQuestion(int id);

}
