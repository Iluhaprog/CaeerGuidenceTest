package testpackage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testpackage.dao.type.Answer;
import testpackage.dao.type.Category;
import testpackage.dao.type.CategoryWithCounter;
import testpackage.dao.type.User;
import testpackage.mappers.AnswerMapper;
import testpackage.mappers.CategoryMapper;
import testpackage.mappers.UserMapper;
import testpackage.services.interfaces.AnswerService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Answer getAnswerById(int id) {
        return answerMapper.getAnswerById(id);
    }

    @Override
    public Answer getAnswerByName(String name) {
        return answerMapper.getAnswerByName(name);
    }

    @Override
    public void insertAnswer(Answer answer) {
        answerMapper.insertAnswer(answer);
    }

    @Override
    public void updateAnswer(Answer answer) {
        answerMapper.updateAnswer(answer);
    }

    @Override
    public void deleteAnswerById(int id) {
        answerMapper.deleteAnswerById(id);
    }

    @Override
    public List<Answer> getAll() {
        return answerMapper.getAll();
    }

    @Override
    public Category getResult(int id_user) {

        List<CategoryWithCounter> categoryWithCounters = new ArrayList<>();
        for ( int i = 0; i < 7; i++ ) {
            categoryWithCounters.add(new CategoryWithCounter( i, 0));
        }

        List<Answer> list_answers = answerMapper.getAnswerByIdOfUser(id_user);

        for (int i = 0; i < 7; i++){
            int count = 0;
            for ( int j = 0 ; j < list_answers.size(); j++ ) {

                if ( list_answers.get(j).getPoints() == categoryWithCounters.get(i).getId() ) {
                    count++;
                    categoryWithCounters.add(new CategoryWithCounter(i , count));
                }

            }
        }

        int max_val = 0;
        int category = 0;
        for ( int i = 0 ; i < categoryWithCounters.size(); i++ ){

            if ( max_val < categoryWithCounters.get(i).getCounter() ) {
                max_val = categoryWithCounters.get(i).getCounter();
                category = categoryWithCounters.get(i).getId();
            }

        }

        return categoryMapper.getCategoryById(category);
    }
}
