package pl.machineproject.machineproject.machine.machine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.machineproject.machineproject.machine.Machine;

import java.util.stream.Stream;


class ParametrizedMachineTest {

    @ParameterizedTest
    @MethodSource("data")
    void analyzeMachineByParams_withDataFromMethod_ResultFromData(int valueOne, int valueTwo, int valueThree, boolean expectedResult) {

        //given
        Machine machine = new Machine();

        //when
        boolean result = machine.analyzeMachineByParams(valueOne, valueTwo, valueThree);

        //then
        Assertions.assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> data() {

        return Stream.of(
                Arguments.of(10, 10, 10, true),
                Arguments.of(25, 33, 57, true),
                Arguments.of(9, 10, 10, false),
                Arguments.of(10, 9, 10, false),
                Arguments.of(10, 10, 9, false),
                Arguments.of(9, 9, 9, false),
                Arguments.of(1001, 1001, 1001, false));
    }
}
