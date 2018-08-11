package testpackage.services.interfaces;

import testpackage.dao.type.VariantOfAnswer;

import java.util.List;

public interface VariantOfAnswerService {

    public VariantOfAnswer getVariantOfAnswerById(int id);
    public VariantOfAnswer getVariantOfAnswerByName(String name);
    public void insertVariantOfAnswer(VariantOfAnswer variantOfAnswer);
    public void updateVariantOfAnswer(VariantOfAnswer variantOfAnswer);
    public void deleteVariantOfAnswerById(int id);
    public List<VariantOfAnswer> getAll();

}
