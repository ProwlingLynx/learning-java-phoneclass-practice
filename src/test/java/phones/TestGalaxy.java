package phones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phone.base.AbstractPhone;
import phone.base.IRingable;

import static org.junit.jupiter.api.Assertions.*;

class TestGalaxy {
    Galaxy galaxy;

    @BeforeEach
    void create_new_instances() {
        galaxy = new Galaxy("Galaxy", 5, "Samsung");
    }
    @Test
    void ring_should_return_string() {
//        given
        String expected = "Brrring!";
//        when
        String result = galaxy.ring();
//        then
        assertTrue(expected.equals(result));
    }
    @Test
    void galaxy_should_implement_InterfacePhone(){
//        given
        Galaxy testedClass = galaxy;
        assertInstanceOf(IRingable.class, testedClass);
    }
    @Test
    void galaxy_should_extend_AbstractPhone(){
        assertInstanceOf(AbstractPhone.class, galaxy);
    }
    @Test
    void unlock_should_return_string() {
//        given
        String expected = "Unlocking!";
//        when
        String actual = galaxy.unlock();
//        then
        assertTrue(expected.equals(actual));
    }


}