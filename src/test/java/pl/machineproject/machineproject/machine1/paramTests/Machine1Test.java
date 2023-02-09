package pl.machineproject.machineproject.machine1.paramTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.machineproject.machineproject.machine1.Machine1;

import java.util.stream.Stream;


class Machine1Test {

    @ParameterizedTest
    @MethodSource("data")
    void analyzeMachine1ByParams_withDataFromMethod_ResultFromData(int valueOne, int valueTwo, int valueThree, boolean expectedResult) {

        //given
        Machine1 machine1 = new Machine1();

        //when
        boolean result = machine1.analyzeMachineByParams(valueOne, valueTwo, valueThree);

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
