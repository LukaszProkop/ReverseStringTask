package org.reverse.order.task;

import org.reverse.order.task.exception.BlankInputException;
import org.reverse.order.task.exception.OneWordInputException;

public class ReversString {

    public String solution(String str){
        if (str == null || str.trim().length()<1){
            throw new BlankInputException();
        }

        String[] strArray = str.trim().split(" ");
        if (strArray.length == 1){
            throw new OneWordInputException();
        }

        StringBuilder result = new StringBuilder();
        int leftIndex = 0;

        for(int rightIndex = strArray.length-1; rightIndex>=0; rightIndex--){
            if (strArray[leftIndex].substring(0, 1).matches("[A-Z]")){
                result.append(strArray[leftIndex]);
                result.append(" ");
            }
            if (!strArray[rightIndex].substring(0, 1).matches("[A-Z]")){
                result.append(strArray[rightIndex]);
                result.append(" ");
            }
            leftIndex++;
        }

        return result.toString().trim();
    }
}
