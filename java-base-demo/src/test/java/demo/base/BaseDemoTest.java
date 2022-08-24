package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    void whenSum_FirstNumberIs5_SecondNumberIs10_ThenReturn15() {
        BaseDemo baseDemo = new BaseDemo();
        int expectedResult = 15;
        int firstNumber = 5;
        int secondNumber = 10;

        assertEquals(expectedResult, baseDemo.sum(firstNumber,secondNumber));
    }

    @Test
    void whenSum_FirstNumberIs60_SecondNumberIs9_ThenReturn69() {
        BaseDemo baseDemo = new BaseDemo();
        int expectedResult = 69;
        int firstNumber = 60;
        int secondNumber = 9;

        assertEquals(expectedResult, baseDemo.sum(firstNumber,secondNumber));
    }
}
