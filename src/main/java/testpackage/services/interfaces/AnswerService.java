package testpackage.services.interfaces;

import testpackage.dao.type.Answer;
import testpackage.dao.type.Category;

import java.util.List;

public interface AnswerService {

    public Answer getAnswerById(int id);
    public Answer getAnswerByName(String name);
    public void insertAnswer(Answer answer);
    public void updateAnswer(Answer answer);
    public void deleteAnswerById(int id);
    public List<Answer> getAll();

    public Category getResult(int id_user);

}
