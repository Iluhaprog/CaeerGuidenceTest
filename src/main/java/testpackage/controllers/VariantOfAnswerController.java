package testpackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import testpackage.dao.type.VariantOfAnswer;
import testpackage.services.interfaces.VariantOfAnswerService;

import java.util.List;

@RestController
@RequestMapping("/variant-of-answer")
public class VariantOfAnswerController {

    @Autowired
    VariantOfAnswerService variantOfAnswerService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public VariantOfAnswer getVariantOfAnswerById(int id){
        return variantOfAnswerService.getVariantOfAnswerById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public VariantOfAnswer getVariantOfAnswerByName(String name){
        return variantOfAnswerService.getVariantOfAnswerByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertVariantOfAnswer(VariantOfAnswer variantOfAnswer){
        variantOfAnswerService.insertVariantOfAnswer(variantOfAnswer);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateVariantOfAnswer(VariantOfAnswer variantOfAnswer){
        variantOfAnswerService.updateVariantOfAnswer(variantOfAnswer);
    }

    @RequestMapping(value = "delete-by-id" , method = RequestMethod.DELETE)
    public void deleteVariantOfAnswerById(int id){
        variantOfAnswerService.deleteVariantOfAnswerById(id);
    }

    @RequestMapping(value = "get-all" , method = RequestMethod.GET)
    public List<VariantOfAnswer> getAll(){
        return variantOfAnswerService.getAll();
    }

}
