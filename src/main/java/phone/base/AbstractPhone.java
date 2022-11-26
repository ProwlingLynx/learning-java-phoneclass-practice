package phone.base;

public abstract class AbstractPhone{
    String type;
    int screenSize;
    String brand;
    public AbstractPhone(String type, int screenSize, String brand){
        this.brand = brand;
        this.screenSize = screenSize;
        this.type = type;
    }
    public void displayPhoneInformation(){
        System.out.format("\nHere is your phone's information: \nBrand: %s\nScreensize: %s inches\nType: %s\n",
                brand, screenSize, type);
    }
}
