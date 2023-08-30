package com.kodnest.calculator;

public class Flamecalculator {
	 public static void main(String[] args) {
	        String name1 = "Jayaprakash";  // Replace with the first name
	        String name2 = "ghjkl";  // Replace with the second name

	        String flames = "FLAMES";
	        StringBuilder result = new StringBuilder(flames);

	        for (char c : name1.toCharArray()) {
	            int index = result.indexOf(String.valueOf(c));
	            if (index != -1) {
	                result.deleteCharAt(index);
	            }
	        }

	        for (char c : name2.toCharArray()) {
	            int index = result.indexOf(String.valueOf(c));
	            if (index != -1) {
	                result.deleteCharAt(index);
	            }
	        }

	        while (result.length() > 1) {
	            int index = name1.length() + name2.length() % result.length();
	            result.deleteCharAt(index - 1);
	        }

	        char relationship = result.charAt(0);

	        switch (relationship) {
	            case 'F':
	                System.out.println("Friends");
	                break;
	            case 'L':
	                System.out.println("Lovers");
	                break;
	            case 'A':
	                System.out.println("Affectionate");
	                break;
	            case 'M':
	                System.out.println("Marriage");
	                break;
	            case 'E':
	                System.out.println("Enemies");
	                break;
	            case 'S':
	                System.out.println("Siblings");
	                break;
	        }
	    }

}