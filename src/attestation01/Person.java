package attestation01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Person {
    private String fullName;
    private double cash;
    private final List<Product> basket;

    public Person(String fullName, double cash) throws IllegalAccessException {
        setFullName(fullName);
        setCash(cash);
        this.basket = new ArrayList<>();
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName) throws IllegalAccessException {
        if (fullName == null || fullName.trim().isEmpty()){
            throw new IllegalAccessException("Имя не может быть пустым");
        } else if (fullName.length() < 3){
            throw new IllegalAccessException("Имя не может быть короче 3 символов");
        } else {
            this.fullName = fullName;
        }
    }

    public double getCash(){
        return cash;
    }

    public void setCash(double cash) throws IllegalAccessException {
        if (cash < 0){
            throw new IllegalAccessException("Деньги не могут быть отрицательными");
        } else {
            this.cash = cash;
        }
    }

    public List<Product> getBasket(){
        return basket;
    }

    public void addProduct(Product product){
        if (product.getCost() <= cash){
            basket.add(product);
            cash -= product.getCost();
        }else {
            System.out.printf("%s не может позволить себе %s%n", fullName, product.getProductName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(cash, person.cash) == 0 && Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, cash);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", cash=" + cash +
                ", basket=" + basket +
                '}';
    }
}
