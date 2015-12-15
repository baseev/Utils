package com.baseev.coding.interview.lang.comparable;

public class Country
    implements Comparable<Country>
{
    private int countryId;
    private String countryName;
    
    public Country(int countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }
    
    @Override
    public int compareTo(Country country)
    {
        return this.countryName.equals(country.countryName) ? 0 : 1;
    }

    @Override
    public String toString()
    {
        return "Country [countryId=" + countryId + ", countryName="
                + countryName + "]";
    }
}
