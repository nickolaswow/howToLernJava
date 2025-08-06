package attestation01;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Введите имя покупателя:");
            String buyerName = sc.nextLine();

            System.out.println("Введите сумму денег покупателя:");
            double buyerCash = Double.parseDouble(sc.nextLine());

            Person person = new Person(buyerName, buyerCash);

            while (true){
                System.out.println("Введите название продукта (или END для завершения):");
                String productName = sc.nextLine();

                if (productName.isEmpty()){
                    System.out.printf("%s покидает магазин в тишине...%n", person.getFullName());
                    break;
                }else if (productName.equalsIgnoreCase("END")){
                    System.out.printf("%s Закончил(а) покупки%n", person.getFullName());
                    break;
                }else {
                    System.out.println("Введите стоимость продукта:");
                    double productPrice = Double.parseDouble(sc.nextLine());

                    Product product = new Product(productName, productPrice);
                    person.addProduct(product);

                    if(person.getBasket().contains(product)){
                        System.out.printf("%s купил(а) %s%n", person.getFullName(), productName);
                    }
                }
            }

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
        }
    }
}
