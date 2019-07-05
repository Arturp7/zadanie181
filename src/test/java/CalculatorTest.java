import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldresultBe2(){
        //given
        Calculator calc = new Calculator();

        //when
        calc.calculation(4);

        //then
        Assertions.assertThat(calc.calculation(4)).isEqualTo(2);
    }

    @Test
    void shouldresultBe10(){
        //given
        Calculator calc = new Calculator();

        //when
        calc.calculation(6);

        //then
        Assertions.assertThat(calc.calculation(6)).isEqualTo(10);
    }
    @Test
    void shouldResultBe2(){
        //given
        Calculator calc = new Calculator();

        //when
        calc.calculation(3);

        //then
        Assertions.assertThat(calc.calculation(3)).isEqualTo(2);
    }





}
