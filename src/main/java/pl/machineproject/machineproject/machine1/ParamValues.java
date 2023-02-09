package pl.machineproject.machineproject.machine1;

public enum ParamValues {

    VALUE_ONE(10, 1000),
    VALUE_TWO(10, 1000),
    VALUE_THREE(10, 1000);

    private int minValue;
    private int maxValue;

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    ParamValues(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
}
