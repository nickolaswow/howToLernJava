package SecondHomework;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        tv tv1 = new tv(
                "Samsung",
                random.nextInt(20, 100),
                random.nextInt(30, 500),
                Resolution.HD,
                ScreenTechnology.LED,
                random.nextBoolean(),
                VESA.RES_100X100
        );

        System.out.println("Введите бренд телевизора:");
        String brand = sc.nextLine();

        System.out.println("Введите размер экрана (в дюймах):");
        int screenSize = sc.nextInt();

        System.out.println("Введите частоту обновления (в Гц):");
        int refreshRate = sc.nextInt();

        System.out.println("Введите разрешение экрана (выберете из списка: HD, FULL_HD, FOUR_K, EIGHT_K, CUSTOM):");
        Resolution screenResolution = Resolution.valueOf(sc.next().toUpperCase());

        System.out.println("Введите технологию экрана (выберете из списка: LED, OLED, QLED, LCD, MiniLED, CUSTOM):");
        ScreenTechnology screenTech = ScreenTechnology.valueOf(sc.next().toUpperCase());

        System.out.println("Это умный телевизор? (true/false):");
        boolean isSmart = sc.nextBoolean();

        System.out.println("Введите значение VESA (выберете из списка: RES_75x75, RES_100x100, RES_200x200):");
        VESA vesa = VESA.valueOf(sc.next().toUpperCase());

        tv tv2 = new tv(brand, screenSize, refreshRate, screenResolution, screenTech, isSmart, vesa);

        System.out.println("\nИнформация о первом телевизоре:");
        tv1.displayInfo();

        System.out.println("\nИнформация о втором телевизоре:");
        tv2.displayInfo();

    }
}
