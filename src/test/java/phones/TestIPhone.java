package phones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phone.base.AbstractPhone;
import phone.base.IRingable;

import static org.junit.jupiter.api.Assertions.*;

class TestIPhone {
        IPhone iPhone;

        @BeforeEach
        void create_new_instances() {
            iPhone = new IPhone("iPhone", 7, "Apple");
        }
        @Test
        void ring_should_return_string() {
//        given
            String expected = "Munch munch!";
//        when
            String result = iPhone.ring();
//        then
            assertTrue(expected.equals(result));
        }
        @Test
        void iphone_should_implement_InterfacePhone(){
//        given
            IPhone testedClass = iPhone;
            assertInstanceOf(IRingable.class, testedClass);
        }

        @Test
        void iphone_should_be_instance_of_AbstractPhone(){
            assertInstanceOf(AbstractPhone.class, iPhone);
        }

        @Test
        void unlock_should_return_string() {
//        given
            String expected = "It's always open!";
//        when
            String actual = iPhone.unlock();
//        then
            assertTrue(expected.equals(actual));
        }
}