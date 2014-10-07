//  Katherine Porfirio

//  define a class
public class Practice {
    
//  add main method
public static void main(String[] args) {

//  generate a random number between 0 and 1
double randomNumber = Math.random();
//  multiply random number by 13
randomNumber = randomNumber * 13;
//  make random number an int
int randomNumberInt = (int) randomNumber;

//  declare string for random number on card
String numberOnCard = "0";
 
//  switch statement for random number on card
switch (randomNumberInt)    {

    case 0:     numberOnCard = "1";
                break;
    case 1:     numberOnCard = "2";
                break;
    case 2:     numberOnCard = "3";
                break;
    case 3:     numberOnCard = "4";
                break;
    case 4:     numberOnCard = "5";
                break;
    case 5:     numberOnCard = "6";
                break;
    case 6:     numberOnCard = "7";
                break;
    case 7:     numberOnCard = "8";
                break;
    case 8:     numberOnCard = "9";
                break;
    case 9:     numberOnCard = "10";
                break;
    case 10:    numberOnCard = "Jack";
                break;
    case 11:    numberOnCard = "Queen";
                break; 
    case 12:    numberOnCard = "King";
                break;
    }

System.out.println(numberOnCard);

    }
}