package com.natalya.nodcalculator;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class NodHistory {

    private List<NodResult> history = new ArrayList<>();

    public void addResult(NodResult result) {
        history.add(result);
    }

    public void clear() {
        history.clear();
    }

    public void printHistory() {
        for (int i = 0; i < history.size(); i += 5) {
            NodResult result = history.get(i);
            Log.d("TAG", result.toString());
        }
    }
}
