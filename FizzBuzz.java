// Fizz Buzz is a classic children's game and common
//  programming challenge. Write a program that prints each 
//  number from 1 to 20. If the number is divisible by three, print
//   Fizz instead of the number. If the number is divisible by five
//   , print Buzz. And if the number is divisible by both three and five,
//    then print FizzBuzz. Write code to produce this program and save the
//     source code in a file named fizzbuzz (i.e. fizzbuzz.go for Go programs).
//      This will be submitted later with the workshop assignment.

public static void main(String[]args){
    for(int i = 0; i < 20; i++){
        System.out.println(i);
        if(i % 3 == 0){
            System.out.println("Fizz");
        }
        else if(i % 5 == 0){
            System.out.println("Buzz");
        }
        else if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        }
    }
}