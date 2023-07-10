package Exception;
// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением 
// "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Integer num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        Integer num2 = number2.nextInt();

        try{
            DivisionNumber(num1, num2);
            int res = num1/num2;
            System.out.println(num1 + "/" + num2 + "=" +  res);
        }catch(DivisionByZeroException ex){
            System.out.println("Error: " + ex.getMessage());
        }


    }
    public static void DivisionNumber(int value1, int value2 ) throws DivisionByZeroException{
        
        if(value2 == 0){
            throw new DivisionByZeroException("Деление на ноль не допустимо!");
        }
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}
