package com.baseev.coding.interview.lang.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Country c1 = new Country(1, "India");
        Country c2 = new Country(2, "USA");
        Country c3 = new Country(3, "America");
        
        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries.add(c1);
        listOfCountries.add(c2);
        listOfCountries.add(c3);

        System.out.println(listOfCountries);
        
        Collections.sort(listOfCountries);
        
        System.out.println(listOfCountries);
    }
}


