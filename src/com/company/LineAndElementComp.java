package com.company;

import java.util.Comparator;

public class LineAndElementComp implements Comparator<LineAndElement> {

    @Override
    public int compare(LineAndElement e1, LineAndElement e2)
    {
        if(e1.getElement() > e2.getElement()){
            return 1;
        } else {
            return -1;
        }

    }

}
