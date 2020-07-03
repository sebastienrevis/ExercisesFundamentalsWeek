package be.vdab.Strings;

public class StringConstructionAndManipulation {

    public static void main(String[] args) {

        // String examples
        String message0 = ("This is a string");
        String message1 = new String("Welcome to Java"); //! Why does 'new String'  becoming redundant in the code
        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String message2 = new String(charArray);

        System.out.println(message0);
        System.out.println(message1); //! What is the purpose of adding 'new String to message1 since you can also type it in directly like with message0
        System.out.println(message2);

        // String objects are immutable, changing the content afterwards does not affect the original string
        String s = "Java";

        // Example below will not affect the original content but it can no longer be accessed
        // The original string will still exist
        s = "HTML";

        System.out.println(s);

        // Because strings are immutable and are ubiquitous in programming, the JVM uses a unique
        // instance for string literals with the same character sequence in order to improve efficiency and save
        // memory. Such an instance is called an interned string. For example, the following statements:
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";

        // In the preceding statements, s1 and s3 refer to the same interned string—"Welcome to
        // Java"—so s1 == s3 is true. However, s1 == s2 is false, because s1 and s2 are two
        // different string objects, even though they have the same contents.
        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1 == s3 is " + (s1 == s3));

        "Welcome".replace('e', 'A'); //returns a new string, WAlcomA.
        "Welcome".replaceFirst("e", "AB"); //returns a new string, WABlcome.
        "Welcome".replace("e", "AB"); //returns a new string, WABlcomAB.
        "Welcome".replace("el", "AB"); //returns a new string, WABcome.

        s1.replace('e', '3'); //! Why can't you type in oldChar and newChar manually?
        System.out.println(s1); //! Why doesnt the content change like in the example with string s

        // The split method can be used to extract tokens from a string with the specified delimiters.
        // For example, the following code, regex stands for 'regular expression'
        String[] tokens1 = "This%20is%20a%20Java%20document".split("%20");
        for (int i = 0; i < tokens1.length; i++)
            System.out.print(tokens1[i] + " ");
            System.out.println();

        // Using match method examples:
        if ("Java is fun".matches("Java.*"))
            System.out.println("This statement is true");
        else
            System.out.println("This statement is false");

        if ("440–02–4534".matches("\\d{3}–\\d{5}–\\d{4}"))
            System.out.println("This statement is true");
        else
            System.out.println("This statement is false");

        // The replaceAll, replaceFirst, and split methods can be used with a regular expression.
        // For example, the following statement returns a new string that replaces $, +, or #
        // in a+b$#c with the string NNN.
        String sr = "a+b$#c".replaceAll("[$+#]", "NNN");
            System.out.println(sr);

        // The following statement splits the string into an array of strings delimited by punctuation marks.
        String[] tokens2 = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokens2.length; i++)
            System.out.println(tokens2[i]);

        // String <> Array conversions
        char[] chars = "Java".toCharArray();
            System.out.println("The array length is: "+chars.length +" and the first character is: "+chars[0]);

        // The getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) method is meant to copy a substring
        // of the string from index srcBegin to index srcEnd–1 into a character array dst starting
        // from index dstBegin. Example:
        char[] dst = {'J', 'a', 'v', 'a', 'I', 's', 'F', 'u', 'n', '!'};
        "JavaIsEasyAs123".getChars(6, 10, dst, 6);
            System.out.println(dst);

        // To convert an array of characters into a string, use the String(char[]) constructor or the
        // valueOf(char[]) method. For example, the following statement constructs a string from an
        // array using the String constructor:
//        int[] arrayNumbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
//        String str1 = String(arrayNumbers); //! Why is this not possible?
//        System.out.println(str1);

        // The next statement constructs a string from an array using the valueOf method.
        String str2 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str2);

        // This method is similar to the printf method except that the format method returns a formatted
        // string, whereas the printf method displays a formatted string. For example,
        String s4 = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
        System.out.println(s4);
    }
}