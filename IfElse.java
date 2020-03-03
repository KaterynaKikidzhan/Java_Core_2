public class IfElse {
//if-else statement
//3) Створити числову змінну і присвоїти їй значення. Створити  if-else statement, яке залежно від значення вашої змінної виводить в консоль текст
//— якщо число більше 7 - “Число більше 7”
//— якщо число менше 7 - “Число менше 7”
//— якщо число дорівнює 7 - “Щасливе число 7!”
    public static void main(String[] args) {
        int number = 4;
        if (number > 7) {
            System.out.println("Число більше 7");
        } else if (number < 7) {
            System.out.println("Число менше 7");
        } else {
            System.out.println("Щасливе число 7!");
        }
    }
}
