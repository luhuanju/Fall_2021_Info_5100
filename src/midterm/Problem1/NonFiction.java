package midterm.Problem1;

public class NonFiction extends Book implements iBorrowable{

    int borrowDay;
    int returnDay;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle()+"all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {this.borrowDay=day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDay=day;

    }

    @Override
    public boolean isAvailable(int day) {
        return day>=this.borrowDay&& day<=this.returnDay;

    }
}
