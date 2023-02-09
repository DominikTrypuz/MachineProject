package pl.machineproject.machineproject.machine1;

public class Machine1 {

    private boolean isCorrect(int value, ParamValues paramValues) {

        if (value < 0) {
            return false;
        }
        int maxValue = paramValues.getMaxValue();
        int minValue = paramValues.getMinValue();

        if (minValue <= value && maxValue >= value) {

            return true;
        }

        return false;
    }

    public boolean analyzeMachineByParams(int valueOne, int valueTwo, int valueThree) {

        boolean isValueOneCorrect = isCorrect(valueOne, ParamValues.VALUE_ONE);
        boolean isValueTwoCorrect = isCorrect(valueTwo, ParamValues.VALUE_TWO);
        boolean isValueThreeCorrect = isCorrect(valueThree, ParamValues.VALUE_THREE);

        if (isValueOneCorrect && isValueTwoCorrect && isValueThreeCorrect) {
            System.out.println("Correct values");
            return true;
        } else {
            System.out.println("Incorrect values");
            return false;
        }

    }
}
