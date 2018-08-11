package testpackage.services.interfaces;

import testpackage.dao.type.Question;
import testpackage.dao.type.VariantOfAnswer;

import java.util.List;
import java.util.Map;

public interface QuestionService {

    public Question getQuestionById(int id);
    public Question getQuestionByName(String name);
    public void insertQuestion(Question question);
    public void updateQuestion(Question question);
    public void deleteQuestionById(int id);
    public List<Question> getAll();

    public List<VariantOfAnswer> getVariantOfAnswerByIdOfQuestion(int id);
    public Map<String , List<VariantOfAnswer>> getQuestionWithVariantsOfAnswersByIdOfQuestion(int id);

}
