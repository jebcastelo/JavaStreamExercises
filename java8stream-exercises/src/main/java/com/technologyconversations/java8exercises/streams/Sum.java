package com.technologyconversations.java8exercises.streams;

import java.util.List;

public class Sum {

    private Sum() {
    }

    public static int calculate7(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate(List<Integer> people) {
    	int sum = people.stream().reduce(0, (a, b) -> a+b);		  
        return sum;
    }

}
