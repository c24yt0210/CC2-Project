package guess;

import java.util.Scanner;

public class Guess {
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

        int guess, random;    
        random = (int)(Math.random()*1000) +1;
        //To show ANSWER remove the single line comment below
        //System.out.println(random);
        System.out.println("Enter number from 1 to 1000");
        guess = input.nextInt();
        


while (guess !=random) {
    if  (guess > 1000 || guess < 0){
        System.out.println("Invalid");
    }     
    if (guess > random){
            System.out.println("answer is too high");
    }
    if (guess < random) {
            System.out.println("answer is too low");
    }
    if (random % 2 == 1 ){
            System.out.println("number is odd");
    }        
    if (random % 2 == 0){
            System.out.println("number is even");
    }
    
           System.out.println("Enter number from 1 to 1000");
           guess = input.nextInt();
}
          System.out.println("Correct answer");
          System.out.println("Your answer is " + guess);
          System.out.println("random number is " + random);
          
          
          
                                
    }
 }

