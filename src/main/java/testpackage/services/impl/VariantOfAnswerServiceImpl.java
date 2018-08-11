package testpackage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testpackage.dao.type.VariantOfAnswer;
import testpackage.mappers.VariantOfAnswerMapper;
import testpackage.services.interfaces.VariantOfAnswerService;

import java.util.List;

@Service
public class VariantOfAnswerServiceImpl implements VariantOfAnswerService {

    @Autowired
    private VariantOfAnswerMapper variantOfAnswerMapper;

    @Override
    public VariantOfAnswer getVariantOfAnswerById(int id) {
        return variantOfAnswerMapper.getVariantOfAnswerById(id);
    }

    @Override
    public VariantOfAnswer getVariantOfAnswerByName(String name) {
        return variantOfAnswerMapper.getVariantOfAnswerByName(name);
    }

    @Override
    public void insertVariantOfAnswer(VariantOfAnswer variantOfAnswer) {
        variantOfAnswerMapper.insertVariantOfAnswer(variantOfAnswer);
    }

    @Override
    public void updateVariantOfAnswer(VariantOfAnswer variantOfAnswer) {
        variantOfAnswerMapper.updateVariantOfAnswer(variantOfAnswer);
    }

    @Override
    public void deleteVariantOfAnswerById(int id) {
        variantOfAnswerMapper.deleteVariantOfAnswerById(id);
    }

    @Override
    public List<VariantOfAnswer> getAll() {
        return variantOfAnswerMapper.getAll();
    }

}
