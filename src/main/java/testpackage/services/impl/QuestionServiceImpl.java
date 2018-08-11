package testpackage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testpackage.dao.type.Question;
import testpackage.dao.type.VariantOfAnswer;
import testpackage.mappers.QuestionMapper;
import testpackage.mappers.VariantOfAnswerMapper;
import testpackage.services.interfaces.QuestionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl  implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private VariantOfAnswerMapper variantOfAnswerMapper;

    @Override
    public Question getQuestionById(int id) {
        return questionMapper.getQuestionById(id);
    }

    @Override
    public Question getQuestionByName(String name) {
        return questionMapper.getQuestionByName(name);
    }

    @Override
    public void insertQuestion(Question question) {
        questionMapper.insertQuestion(question);
    }

    @Override
    public void updateQuestion(Question question) {
        questionMapper.updateQuestion(question);
    }

    @Override
    public void deleteQuestionById(int id) {
        questionMapper.deleteQuestionById(id);
    }

    @Override
    public List<Question> getAll() {
        return questionMapper.getAll();
    }

    @Override
    public List<VariantOfAnswer> getVariantOfAnswerByIdOfQuestion(int id) {
        return questionMapper.getVariantOfAnswerByIdOfQuestion(id);
    }

    @Override
    public Map<String , List<VariantOfAnswer>> getQuestionWithVariantsOfAnswersByIdOfQuestion(int id) {
        Map<String , List<VariantOfAnswer>> map_questions_with_variant_answers = new HashMap<>();
        String key = getQuestionById(id).getName();
        map_questions_with_variant_answers.put(key , getVariantOfAnswerByIdOfQuestion(id));
        return map_questions_with_variant_answers;
    }

}

