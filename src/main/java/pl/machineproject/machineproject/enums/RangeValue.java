package pl.machineproject.machineproject.enums;

public enum RangeValue {

    VALUE_ONE(10, 1000),
    VALUE_TWO(10, 1000),
    VALUE_THREE(10, 1000);

    private final int minValue;
    private final int maxValue;

    public int getMinValue() {
        return minValue;
    }

    RangeValue(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
