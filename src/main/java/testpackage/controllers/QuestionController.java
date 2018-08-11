package testpackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testpackage.dao.type.Question;
import testpackage.dao.type.VariantOfAnswer;
import testpackage.services.interfaces.QuestionService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    @ResponseBody
    public Question getQuestionById(int id){
        return questionService.getQuestionById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Question getQuestionByName(String name){
        return questionService.getQuestionByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertQuestion(Question question){
        questionService.insertQuestion(question);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateQuestion(Question question){
        questionService.updateQuestion(question);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteQuestionById(int id){
        questionService.deleteQuestionById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Question> getAll(){
        return questionService.getAll();
    }

    @RequestMapping(value = "/get-question-with-variants-of-answers" , method = RequestMethod.GET)
    public Map<String , List<VariantOfAnswer>> getQuestionWithVariantsOfAnswersByIdOfQuestion(int id){
        return questionService.getQuestionWithVariantsOfAnswersByIdOfQuestion(id);
    }

}
