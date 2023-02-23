import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    public void contains1() {

        Calculator calc = Calculator.instance.get();
        int a = calc.multiply.apply(2, 2);
        assertThat(a, lessThanOrEqualTo(4));


    }
    @Test
    public void contains2() {

        Calculator calc = Calculator.instance.get();
        int a = calc.pow.apply(2);
        assertThat(a, lessThanOrEqualTo(4));


    }
    @Test
    public void contains3() {

        Calculator calc = Calculator.instance.get();
        int a = calc.abs.apply(2);
        assertThat(a, lessThanOrEqualTo(-2));


    }
    @org.junit.jupiter.api.Test
    public void test_Plus() {
        // given:
        int a = 2, b = 2, expected = 4;
        Calculator calc = Calculator.instance.get();
        // when:
        int result = calc.plus.apply(a, b);

        // then:
        assertEquals(expected, result);
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
      assertEquals(expected, result);
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
        assertEquals(expected, c);
        //   Assertions.***;
    }

}
