package Domain;

public class FoodDomain {
    private String title;
    private String pic;
    private String description;
    private Double fee;
    private int start;
    private int time;
    private int numberInCart;

    public FoodDomain(String title, String pic, String description, Double fee, int start, int time) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.start = start;
        this.time = time;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
