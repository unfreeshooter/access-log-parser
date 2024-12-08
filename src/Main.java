import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //выводим текст в консоль для числа 1
        System.out.println("Введите первое число:");

        //получаем первое число из консоли
        int firstNumber = new Scanner(System.in).nextInt();

        //выводим текст в консоль для числа 1
        System.out.println("Введите второе число:");

        //получаем первое число из консоли
        int secondNumber = new Scanner(System.in).nextInt();

        //складываем введенное
        int sum = firstNumber + secondNumber;

        //выводим текст в консоль для суммы чисел
        System.out.println("Сумма введенных чисел: "+sum);

        //считаем разницу введенных чисел
        int diff = firstNumber - secondNumber;

        //выводим текст в консоль для разницы чисел
        System.out.println("Разность введенных чисел: "+diff);

        //считаем произведение введенных чисел
        int prod = firstNumber * secondNumber;

        //выводим текст в консоль для произведения чисел
        System.out.println("Произведение введенных чисел: "+prod);

        //приводим к одному типу и считаем частное введенных чисел
        double quotient = (double) firstNumber / secondNumber;

        //выводим текст в консоль для деления чисел
        System.out.println("Частное введенных чисел: "+quotient);

    }
}