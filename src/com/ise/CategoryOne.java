package com.ise;

import java.util.Scanner;

public class CategoryOne extends Category{
    public void executeCategory(){
        System.out.println("Please input a String");
        System.out.println("1: Convert to Lower and Upper case");
        System.out.println("2: Identify Numeric String");
        System.out.println("3: String valid number or not");
        System.out.println("4: Remove numeric");

        int optionalSelection;
        Scanner optionalScanner = new Scanner(System.in);
        optionalSelection = optionalScanner.nextInt();

        System.out.println("Please input a String");
        String selectionInput;
        Scanner stringScanner = new Scanner(System.in);
        selectionInput = stringScanner.nextLine();

        System.out.println("-------------");
        System.out.println();

        switch (optionalSelection) {
            case 1:
                convertToUpperLower(selectionInput);
                break;
            case 2:
                showNumerics(selectionInput);
                break;
            case 3:
                isValidNumber(selectionInput);
                break;
            case 4:
                String numericRemoveString = removeNumeric(selectionInput);
                convertToUpperLower(numericRemoveString);
            default:
                System.out.println("Invalid selection");

        }
    }

    private void convertToUpperLower(String selectionInput) {
        System.out.println(selectionInput.toLowerCase());
        System.out.println(selectionInput.toUpperCase());
    }

    private void showNumerics(String selectionInput) {
        for (char character : selectionInput.toCharArray()) {
            try {
                int number = Integer.parseInt(String.valueOf(character));
                System.out.println(number);
            } catch (NumberFormatException ex) {
            }
        }
    }

    private void isValidNumber(String selectionInput) {
        try {
            int number = Integer.parseInt(selectionInput);
            System.out.println(number + " is a number");

        } catch (NumberFormatException ex) {
            System.out.println("Not a number");
        }
    }

    private String removeNumeric(String selectionInput) {
        StringBuilder numericRemoveString = new StringBuilder();
        for (char character : selectionInput.toCharArray()) {
            try {
                Integer.parseInt(String.valueOf(character));
            } catch (NumberFormatException ex) {
                numericRemoveString.append(character);
            }
        }
        return numericRemoveString.toString();
    }
}
