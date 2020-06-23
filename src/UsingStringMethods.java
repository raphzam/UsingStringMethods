import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a word:");
        String userWord = input.nextLine();

        System.out.println("Enter a number as an index: ");
        int userIndex = input.nextInt();
        if (userIndex > userWord.length()){
            System.out.println("Index is larger than length.");
            return;
        }

        System.out.printf("The length of %s is %d\n", userWord, userIndex);
        System.out.printf("The substring from 0 to %d is " + userWord.substring(0, userIndex), userIndex);
    }

}