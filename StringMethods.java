public class StringMethods {
    public static void main(String [] args) {
        String name = "Mini Mouse";

        System.out.println(name.length());  //returns length
        System.out.println(name.toLowerCase()); //lower case
        System.out.println(name.toUpperCase()); //upper case

        String nonTrimmedString = "   Mini   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim()); //trims the spaces
        System.out.println(name.substring(2)); //returns a substring from given index to end
        System.out.println(name.substring(2, 5)); //returns a substring from given index to end, excluding end index
        System.out.println(name.replace('o', 'i')); //returns a substring by replacing the characters
        System.out.println(name.replace("o", "man"));
        System.out.println(name.startsWith("Min"));
        System.out.println(name.endsWith("se"));

        System.out.println(name.charAt(1)); //returns character at the given index
        String modifiedName = "Minickey";
        System.out.println(name.indexOf('M'));
        System.out.println(modifiedName.indexOf("in", 2));//retunrs index of the string
        System.out.println(modifiedName.lastIndexOf("in", 1));
        System.out.println(name.equals("Mini"));
        System.out.println(name.equalsIgnoreCase("Mini Mouse")); //matches character irrespective of their case
        System.out.println(name.equalsIgnoreCase("MINI MOUSE"));

        System.out.println("Im an Escape Sequence \"double quote"); //include escape sequences

        System.out.println("Im an Escape Sequence \n double quote"); //enters

        System.out.println("Im an Escape Sequence \tdouble quote"); //tabs
    }
}
