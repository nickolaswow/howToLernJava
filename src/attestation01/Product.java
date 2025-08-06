package attestation01;

import java.util.Objects;

public class Product {
    private String productName;
    private double cost;

    public Product(String productName, double cost) throws IllegalAccessException {
        setProductName(productName);
        setCost(cost);
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName) throws IllegalAccessException {
        if (productName == null || productName.trim().isEmpty()){
            throw new IllegalAccessException("Название продукта не может быть пустым");
        }else {
            this.productName = productName;
        }
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost) throws IllegalAccessException {
        if (cost < 0){
            throw new IllegalAccessException("Стоимость продукта не может быть отрицательным числом");
        }else {
            this.cost = cost;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(cost, product.cost) == 0 && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, cost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
