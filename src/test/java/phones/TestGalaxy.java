package phones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phone.base.InterfacePhone;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestGalaxy {
    Galaxy galaxy;

    @BeforeEach
    void create_new_instances() {
        galaxy = new Galaxy();
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
        assertInstanceOf(InterfacePhone.class, testedClass);
    }

    @Test
    void unlock_should_return_string() {
//        given
        String expected = "Unlocked!";
//        when
        String actual = galaxy.unlock();
//        then
        assertTrue(expected.equals(actual));
    }

}