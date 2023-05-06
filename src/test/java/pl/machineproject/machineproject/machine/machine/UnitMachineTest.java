package pl.machineproject.machineproject.machine.machine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.machineproject.machineproject.machine.Machine;

class UnitMachineTest {
    Machine machine = new Machine();

    @Test
    void analyzeMachineByParams_valuesOk_resultTrue() {
        //given
        int valueOne = 10;
        int valueTwo = 10;
        int valueThree = 10;

        //when
        boolean result = machine.analyzeMachineByParams(valueOne, valueTwo, valueThree);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void analyzeMachineByParams_valuesNotOk_resultFalse() {
        //given
        int valueOne = 9;
        int valueTwo = 10;
        int valueThree = 10;

        //when
        boolean result = machine.analyzeMachineByParams(valueOne, valueTwo, valueThree);

        //then
        Assertions.assertFalse(result);
    }
}
