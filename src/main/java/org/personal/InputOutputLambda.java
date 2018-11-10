package org.personal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputOutputLambda {

//    public int handler(int input){
//        return 10 + input;
//    }

//    public List<Integer> handler(List<Integer> input){
//        final ArrayList<Integer> newList = new ArrayList<>();
//        input.forEach(x -> newList.add(x + 100));
//        return newList;
//    }

    public Map<String, String> handler(Map<String, String> input){
        HashMap<String, String> newMap = new HashMap<>();
        input.forEach((k, v) -> newMap.put("New map " + k, v));
        return newMap;
    }
}
