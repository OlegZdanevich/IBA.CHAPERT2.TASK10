package com.company;

import java.util.Comparator;

public class IndexAndElementComp implements Comparator<IndexAndElement>
{
    @Override
    public int compare(IndexAndElement e1, IndexAndElement e2)
    {
        if(e1.getElement() > e2.getElement()){
            return 1;
        } else {
            return -1;
        }

    }

}
