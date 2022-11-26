package phones;

import phone.base.AbstractPhone;
import phone.base.IRingable;

public class Galaxy extends AbstractPhone implements IRingable {
    public Galaxy(String type, int screenSize, String brand) {
        super(type, screenSize, brand);
    }

    @Override
    public String ring() {
        return "Brrring!";
    }

    @Override
    public String unlock() {
        return "Unlocking!";
    }
}
