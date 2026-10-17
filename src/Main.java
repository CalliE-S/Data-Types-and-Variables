//Week 1 Activities

//Activity 1: Personal Profile Printer:

class Main {
    public static void main(String[] args) {
        String full_name = "John Carlo Otibar";
        int age = 19; 
        char initial = 'J';
        double height = 5.4;
        boolean isRegular = true;

        
        System.out.println("Student Information: ");
        System.out.println("Full Name: " + full_name);
        System.out.println("Age: " + age);
        System.out.println("Initial: " + initial);
        System.out.println("Height: " + height);
        System.out.println("Student Status (Regular?): " + isRegular);
    }
}

//Activity 2: Type-Safe Shopping Calculator

class Main {
    public static void main(String[] args) {
        int quantity = 5;
        double unitPrice = 105.5;
        String StoreName = "Alles Mart";
        double totalCost;

        totalCost = quantity * unitPrice;
        
        System.out.println(StoreName);
        System.out.println("Total Cost: " + totalCost);

        //The main reason why we cannot declared 'totalCost' as int is we used double for unitPrice which means the totalCost should have decimal/s output, thus we used double also for totalCost
    }
}






//Activity 3: Unit Casting Converter

public class Main {
    public static void main(String[] args) {
        double centimeters = 256.75;

    
        int meters = (int) (centimeters / 100);


        double remainingCm = centimeters - (meters * 100);

        System.out.println("Total centimeters: " + centimeters + " cm");
        System.out.println("Whole meters: " + meters + " m");
        System.out.println("Remaining centimeters: " + remainingCm + " cm");

        
        // No cast is needed because double can store int values.
        int number = 25;
        double widenedNumber = number;

        System.out.println("Implicit widening: " + widenedNumber);

        // The decimal part (.75) is lost when converting to int.
        double decimalValue = 12.75;
        int narrowedNumber = (int) decimalValue;

        System.out.println("Explicit narrowing: " + narrowedNumber);
    }
}


//Activity 4: Overflow & Reference Investigator



public class OverflowReferenceInvestigator {
    public static void main(String[] args) {

        // 1. Primitive Overflow
        byte number = 127;
        number++;

        System.out.println("=== Primitive Overflow ===");
        System.out.println("Byte value after increment: " + number);
        // A byte ranges from -128 to 127
        // Incrementing 127 wraps around to -128 due to overflow

        // 2. String Reference Comparisons
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println("\n=== String Reference Comparisons ===");

        // str1 == str2 is false because new String() creates
        // two separate String objects in memory.
        System.out.println("str1 == str2: " + (str1 == str2));

        // str1.equals(str2) is true because both contain "Hello".
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        // str1 == str3 is false because str1 references a new object,
        // while str3 references the string literal in the String pool.
        System.out.println("str1 == str3: " + (str1 == str3));

        // str1.equals(str3) is true because their text is identical.
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // str2 == str3 is false because str2 references a new object,
        // while str3 references the pooled string literal.
        System.out.println("str2 == str3: " + (str2 == str3));

        // str2.equals(str3) is true because their text is identical.
        System.out.println("str2.equals(str3): " + str2.equals(str3));

        // 3. Shared Array Reference
        System.out.println("\n=== Shared Array Reference ===");

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        array1[0] = 99;

        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);
        // Both variables reference the same array object
        // Changing an element through array1 is visible through array2
    }
}





