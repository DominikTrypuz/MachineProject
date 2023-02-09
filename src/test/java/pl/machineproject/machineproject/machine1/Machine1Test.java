package pl.machineproject.machineproject.machine1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Machine1Test {

    @Test
    void analyzeMachine1ByParams_valuesOk_resultTrue() {

        //given
        Machine1 machine1 = new Machine1();
        int valueOne = 10;
        int valueTwo = 10;
        int valueThree = 10;

        //when
        boolean result = machine1.analyzeMachineByParams(valueOne, valueTwo, valueThree);

        //then
        Assertions.assertEquals(result, true);
    }

    @Test
    void analyzeMachine1ByParams_valuesNotOk_resultFalse() {

        //given
        Machine1 machine1 = new Machine1();
        int valueOne = 9;
        int valueTwo = 10;
        int valueThree = 10;

        //when
        boolean result = machine1.analyzeMachineByParams(valueOne, valueTwo, valueThree);

        //then
        Assertions.assertEquals(result, false);
    }
}
