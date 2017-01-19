package edu.bsu.cs222;

/**
 * Created by nicole on 1/17/17.
 */
public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        return ((year % 4) == 0) && (year >=1752) && ((year % 100) != 0  || (year % 400) == 0);
    }
}


