package com.natalya.nodcalculator;

public class NodResult {

    private int firstValue;
    private int secondValue;
    private int thirdValue;
    private int result;

    public NodResult(int firstValue, int secondValue, int result) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.result = result;
    }

    public NodResult(int firstValue, int secondValue, int thirdValue, int result) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.result = result;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public int getThirdValue() {
        return thirdValue;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "(" + firstValue + ", " + secondValue + ", " + result + ")";
    }
}
