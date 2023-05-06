package pl.machineproject.machineproject.machine;

import pl.machineproject.machineproject.enums.RangeValue;

public class Machine {

    public boolean analyzeMachineByParams(int valueOne, int valueTwo, int valueThree) {

        boolean isValueOneCorrect = isCorrect(valueOne, RangeValue.VALUE_ONE);
        boolean isValueTwoCorrect = isCorrect(valueTwo, RangeValue.VALUE_TWO);
        boolean isValueThreeCorrect = isCorrect(valueThree, RangeValue.VALUE_THREE);

        if (isValueOneCorrect && isValueTwoCorrect && isValueThreeCorrect) {
            System.out.println("Correct values");
            return true;
        } else {
            System.out.println("Incorrect values");
            return false;
        }
    }

    private boolean isCorrect(int value, RangeValue paramValues) {

        if (value < 0) {
            return false;
        }
        int maxValue = paramValues.getMaxValue();
        int minValue = paramValues.getMinValue();

        return minValue <= value && maxValue >= value;
    }
}
