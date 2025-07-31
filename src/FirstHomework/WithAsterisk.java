package FirstHomework;

import java.util.Random;

public class WithAsterisk {
    public static void main(String[] args) {
        Random rn = new Random();

        int vasiaChoise = rn.nextInt(3);
        int petiaChose = rn.nextInt(3);

        System.out.println("Вася выбрал: " + getChiuceName(vasiaChoise));
        System.out.println("Петя выбрал: " + getChiuceName(petiaChose));

        String result = determineWinner(vasiaChoise, petiaChose);
        System.out.println(result);
    }

    public static String getChiuceName(int choice) {
        return switch (choice){
            case 0 -> "Камень";
            case 1 -> "Ножницы";
            case 2 -> "Бумага";
            default -> "Мухлюет!";
        };
    }

    public static String determineWinner(int vasiaChoise, int petiaChose) {
        if(vasiaChoise == petiaChose){
            return "Ничья!";
        } else if ((vasiaChoise == 0 && petiaChose == 1) ||
                   (vasiaChoise == 1 && petiaChose == 2) ||
                   (vasiaChoise == 2 && petiaChose == 0)){
            return "Вася выйграл!";
        } else {
            return "Петя выйграл!";
        }
    }
}
