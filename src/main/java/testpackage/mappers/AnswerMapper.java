package testpackage.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testpackage.dao.type.Answer;

import java.util.List;

@Mapper
@Repository
public interface AnswerMapper {

    public Answer getAnswerById(int id);
    public Answer getAnswerByName(String name);
    public void insertAnswer(Answer answer);
    public void updateAnswer(Answer answer);
    public void deleteAnswerById(int id);
    public List<Answer> getAll();

    public List<Answer> getAnswerByIdOfUser( int id_user );

}
