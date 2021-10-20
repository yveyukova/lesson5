/**
 * Java 1. Homework 4
 *
 * @author Juliya Veyukova
 * @version 20.10.2021
 */
public class Lesson5 {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Иван Иванович", "Java-разработчик", "ivanov@mail.ru", "+7 909 999 99 90", 250000, 30);
        empArray[1] = new Employee("Федоров Федор Федорович", "Java-разработчик", "fedorov@mail.ru", "+7 909 999 99 91", 250000, 35);
        empArray[2] = new Employee("Сидоров Сидор Сидорович", "Java-разработчик", "sidorov@mail.ru", "+7 909 999 99 92", 350000, 43);
        empArray[3] = new Employee("Петров Петр Петрович", "Java-разработчик", "petrov@mail.ru", "+7 909 999 99 93", 300000, 41);
        empArray[4] = new Employee("Степанов Степан Степанович", "Java-разработчик", "stepanov@mail.ru", "+7 909 999 99 94", 200000, 25);
        for (Employee employee : empArray)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}



