public class Book {
    private String name;
    private String author;
    private int price;
    private int amount;
    private double weight;

    public Book(String name, String author, int price, int amount, double weight) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.amount = amount;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotalPrice(){
        return this.amount*this.price;
    }
    public double getTotalWeight(){
        return this.amount*this.weight;
    }
}