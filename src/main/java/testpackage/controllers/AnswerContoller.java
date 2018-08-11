package testpackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import testpackage.dao.type.Answer;
import testpackage.dao.type.Category;
import testpackage.services.interfaces.AnswerService;

import java.util.List;

@RestController
@RequestMapping("/answer")
public class AnswerContoller {

    @Autowired
    AnswerService answerService;

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    public String test(){
        return "привет мир!";
    }

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public Answer getAnswerById(int id){
        return answerService.getAnswerById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Answer getAnswerByName(String name){
        return answerService.getAnswerByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void inserAnswer(Answer answer){
        answerService.insertAnswer(answer);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateAnswer(Answer answer){
        answerService.updateAnswer(answer);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteAnswerById(int id){
        answerService.deleteAnswerById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Answer> getAll(){
        return answerService.getAll();
    }

    @RequestMapping(value = "/get-result" , method = RequestMethod.GET)
    public Category getResult(int id_user){
        return answerService.getResult(id_user);
    }

}
