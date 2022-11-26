package phone.base;

public abstract class AbstractPhone implements InterfacePhone{

    @Override
    public String ring() {
        return "Brrring!";
    }

    @Override
    public String unlock() {
        return "Unlocked!";
    }
}
