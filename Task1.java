package Exception;

import java.util.Scanner;

//  Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, 
// является ли оно положительным. Если число отрицательное или равно нулю, 
// программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение "Число корректно".

public class Task1{

public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите любое число: ");
    Integer number = iScanner.nextInt();

    try{
        CheckNumber(number);
    }catch(InvalidNumberException ex){
        System.out.println("Error: " + ex.getMessage());
    }

}
public static void CheckNumber(int value) throws InvalidNumberException{
    if(value <= 0){
        throw new InvalidNumberException("Неккоректное число");
    }else{
        System.out.println("Число корректное");
    }
    
    }
}


class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}
