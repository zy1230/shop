package object;

public class Fruit {
   private String name;

   private String photo;

   private Double price;

    public Fruit(String name, String photo, Double price) {
        this.name = name;
        this.photo = photo;
        this.price = price;
    }

    public Fruit() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
