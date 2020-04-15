import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person p;

    @BeforeEach
    void setUp() {
        p = new Person();
    }

    @Test
    void getPhoneNumber() {
        String expected = "555-555-5555";
        p.setPhoneNumber(expected);
        String actual = p.getPhoneNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPhoneNumber_WithValidData() {
        String expected = "444-444-4444";
        p.setPhoneNumber(expected);

        String actual = p.getPhoneNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPhoneNumber_WithInvalidData() {
        String expected = "555-555-5555";
        p.setPhoneNumber(expected);

        String falseNumber = "5-55-555";
        p.setPhoneNumber(falseNumber);

        String actual = p.getPhoneNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPhoneNumber_WithNullData() {
        String expected = "555-555-5555";
        p.setPhoneNumber(expected);

        String falseNumber = null;
        p.setPhoneNumber(falseNumber);

        String actual = p.getPhoneNumber();

        assertEquals(expected, actual);
    }
}