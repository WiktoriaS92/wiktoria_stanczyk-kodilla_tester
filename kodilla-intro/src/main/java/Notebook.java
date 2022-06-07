public class Notebook{

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600 && this.year >2015) {
            System.out.println ("This notebook is very cheap and old.");
        }
        else if (this.price > 1000 && this.year < 2015 && this.weight> 20) {
            System.out.println ("This notebook is expensive, but new and light.");
        }
        else {
            System.out.println ("The price is good.");}

    }
    public void checkWeight() {
        if (this.weight < 20) {
            System.out.println ("This notebook is very light.");
        }
        else if (this.weight > 100) {
            System.out.println ("This notebook is heavy.");
        }
        else {
            System.out.println ("The weight is good.");}


    }
}
