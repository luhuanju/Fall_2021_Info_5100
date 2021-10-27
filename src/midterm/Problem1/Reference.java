package midterm.Problem1;

public class Reference extends Book{

    String category;

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return "World Maps(title) all information is real.";
    }
}
