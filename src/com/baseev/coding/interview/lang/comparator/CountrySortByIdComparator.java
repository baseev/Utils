package com.baseev.coding.interview.lang.comparator;

import java.util.Comparator;

public class CountrySortByIdComparator
    implements Comparator<Country>
{

    @Override
    public int compare(Country o1, Country o2)
    {
        return (o1.getCountryId() < o2.getCountryId() ) ? -1: (o1.getCountryId() > o2.getCountryId() ) ? 1:0 ;
    }
}
