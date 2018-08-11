package testpackage.dao.type;

public class CategoryWithCounter {

    private int id;
    private int counter;

    public CategoryWithCounter(int id, int counter) {
        this.id = id;
        this.counter = counter;
    }

    public  CategoryWithCounter(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
