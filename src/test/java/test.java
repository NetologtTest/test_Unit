import org.junit.jupiter.api.Assertions;

public class test {


    @org.junit.jupiter.api.Test
    public void test_Plus() {
        // given:
        int a = 2, b = 2, expected = 4;
        Calculator calc = Calculator.instance.get();
        // when:
        int result = calc.plus.apply(a, b);

        // then:
        Assertions.assertEquals(expected, result);
        //   Assertions.***;
    }

    @org.junit.jupiter.api.Test
    public void test_Minus() {
        // given:
        int a = 2, b = 2, expected = 0;
        Calculator calc = Calculator.instance.get();
        // when:
        int result = calc.minus.apply(a, b);

        // then:
        Assertions.assertEquals(expected, result);
        //   Assertions.***;
    }

    @org.junit.jupiter.api.Test
    public void test_Devide() {
        // given:
        int a = 8, b = 2, expected = 4;
        Calculator calc = Calculator.instance.get();
        // when:

        int c = calc.devide.apply(a, b);

        // then:
        Assertions.assertEquals(expected, c);
        //   Assertions.***;
    }

}
