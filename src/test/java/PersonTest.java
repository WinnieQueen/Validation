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
        assertDoesNotThrow(() -> {
            p.setPhoneNumber("444-444-4444");
        });
    }

    @Test
    void setPhoneNumber_WithInvalidData() {
        assertThrows(IllegalArgumentException.class, () -> {
            p.setPhoneNumber("5-55-555");
        });
    }

    @Test
    void setPhoneNumber_WithNullData() {
        assertThrows(IllegalArgumentException.class, () -> {
            p.setPhoneNumber(null);
        });
    }



    @Test
    void getName() {
        String expected = "Jim John Jones";
        p.setName(expected);
        String actual = p.getName();
        assertEquals(expected, actual);
    }

    @Test
    void setName_WithValidMiddleInitialData () {
        assertDoesNotThrow(() -> {
            p.setName("Jim J Jones");
        });
    }

    @Test
    void setName_WithValidMiddleNameData () {
        assertDoesNotThrow(() -> {
            p.setName("Jim John Jones");
        });
    }

    @Test
    void setName_WithValidNoMiddleNameData () {
        assertDoesNotThrow(() -> {
            p.setName("Jim Jones");
        });
    }

    @Test
    void setName_WithInvalidCasingData () {
        assertThrows(IllegalArgumentException.class, () -> {
            p.setName("JimMy JohN JONES");
        });
    }

    @Test
    void setName_WithInvalidMiddleNameData () {
        assertThrows(IllegalArgumentException.class, () -> {
            p.setName("Jimmy john Jones");
        });
    }

    @Test
    void setName_WithNullData () {
        assertThrows(IllegalArgumentException.class, () -> {
            p.setName(null);
        });
    }
}