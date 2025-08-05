package ThirdHomework.Arrow;

import java.util.Random;

public class ArrowGenerator {
    public static String arrowStringGenerator(int length) throws IllegalAccessException {
        Random rn = new Random();
        StringBuilder sb = new StringBuilder(length);

        String[] arrows = {">>-->", "<--<<"};

        int i = 0;
        while (i < length){
            if (rn.nextInt(5) == 0 && i + 5 <= length){
                String arrow = arrows[rn.nextInt(2)];
                sb.append(arrow);
                i += 5;
            }else {
                char caracter = switch (rn.nextInt(3)){
                    case 0 -> '>';
                    case 1 -> '<';
                    case 2 -> '-';
                    default -> throw new IllegalAccessException("Недопустимое значение");
                };
                sb.append(caracter);
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        int length = 106;
        String generateString = arrowStringGenerator(length);

        System.out.println("Сгенерированная строка: " + generateString);
    }
}
