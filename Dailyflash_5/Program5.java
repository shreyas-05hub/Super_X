/*
Que 5: WAP to print the occurrence of a letter in given String.
Input String: “Know the code till the core”
Alphabet : o
Output: 3
*/

class CountOccurrencesOfLetter {
    public static void main(String[] args) {
        String inputString = "Know the code till the core";
        char alphabet = 'o';

        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == alphabet) {
                count++;
            }
        }

        System.out.println("The occurrence of the letter '" + alphabet + "' in the string '" + inputString + "' is " + count);
    }
}