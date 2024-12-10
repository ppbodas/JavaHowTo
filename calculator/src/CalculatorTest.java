import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public static Stream<Arguments> provideTestData() {
        return Stream.of(Arguments.of(new InputValues(1, 2, 3)), Arguments.of(new InputValues(2, 3, 5)), Arguments.of(new InputValues(3, 4, 7)));
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testAdd(InputValues inputValues) {
        Calculator calculator = new Calculator();
        int result = calculator.add(inputValues.a(), inputValues.b());
        assertEquals(inputValues.c(), result);
    }
}