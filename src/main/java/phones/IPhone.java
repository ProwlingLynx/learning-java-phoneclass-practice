package phones;

import phone.base.AbstractPhone;
import phone.base.IRingable;

public class IPhone extends AbstractPhone implements IRingable {
    public IPhone(String type, int screenSize, String brand) {
        super(type, screenSize, brand);
    }

    @Override
    public String ring() {
        return "Munch munch!";
    }

    @Override
    public String unlock() {
        return "It's always open!";
    }
}
