package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fiserv";
        if (number % 5 == 0) return "Barclays";


        return String.valueOf(number);
    }
}
