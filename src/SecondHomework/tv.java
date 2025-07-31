package SecondHomework;

enum Resolution {
    HD,
    FULL_HD,
    FOUR_K,
    EIGHT_K,
    CUSTOM
}

enum ScreenTechnology {
    LED,
    OLED,
    QLED,
    LCD,
    MiniLED,
    CUSTOM
}

enum VESA {
    RES_75X75,
    RES_100X100,
    RES_200X100,
    RES_200X200
}

public class tv {
    private String brand;
    private int screenSize;
    private Resolution screenResolution;
    private int refreshRate;
    private ScreenTechnology screenTech;
    private boolean isSmart;
    private VESA vesa;

    public tv(String brand, int screenSize, int refreshRate, Resolution screenResolution, ScreenTechnology screenTech, boolean isSmart, VESA vesa){
        this.brand = brand;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
        this.screenResolution = screenResolution;
        this.screenTech = screenTech;
        this.isSmart = isSmart;
        this.vesa = vesa;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public Resolution getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(Resolution screenResolution) {
        this.screenResolution = screenResolution;
    }

    public ScreenTechnology getScreenTech() {
        return screenTech;
    }

    public void setScreenTech(ScreenTechnology screenTech) {
        this.screenTech = screenTech;
    }

    public boolean getSmart() {
        return isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public VESA getVesa() {
        return vesa;
    }

    public void setVesa(VESA vesa) {
        this.vesa = vesa;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Размер экрана: " + screenSize + " дюймов");
        System.out.println("Частота обновления: " + refreshRate + " Гц");
        System.out.println("Разрешение экрана: " + screenResolution);
        System.out.println("Технология экрана: " + screenTech);
        System.out.println("Умный телевизор: " + (isSmart ? "Да" : "Нет"));
        System.out.println("VESA: " + vesa);
    }
}
