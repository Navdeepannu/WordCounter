// import Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Text input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text/String : ");

        // Get input
        String input = scan.nextLine();

          // Check if the input is empty or not 
          while (input.isBlank() == true){
            System.out.print("Please, Enter a valid text/String again: ");
            input = scan.nextLine();
        }
        
        // Remove white spaces and extra spaces and replace it with single space
        String sentence  = input.trim().replaceAll("\\s+", " ");
      
        // Split the sentence into an array of words separated by spaces
        String[] words = sentence.split(" ");
        
        // initialize the word count variable
        int wordCount = 0;

        // iterate through array 
        for(int i = 0; i < words.length; i++) {
            // increment the count for non-space elemets 
            if(words[i] != " "){
                wordCount++;

            }else{ 
                continue; 
            }
        }

        // print wordCount
        System.out.println("Number of words in String : " + wordCount);
        
        scan.close();
    }
}
