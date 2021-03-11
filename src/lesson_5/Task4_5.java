/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

package lesson_5;

public class Task4_5 {

    public static void main(String[] args) {
        Employee[] emplsArray = new Employee[5];
        emplsArray[0] = new Employee("John", "Smith", 42,
                "CEO", "ceo@company.com", "79008001213", 34678.11);
        emplsArray[1] = new Employee("Peter", "Jackson", 51,
                "sales manager", "sales@company.com", "79008129537", 29678.96);
        emplsArray[2] = new Employee("Ryan", "Mole", 36,
                "HR", "hr@company.com", "79118650487", 28375.14);
        emplsArray[3] = new Employee("Alice", "McBee", 29,
                "project manager", "project@company.com", "795021511009", 26501.47);
        emplsArray[4] = new Employee("Ronald", "Heath", 63,
                "plumber", "worker@company.com", "79446321186", 10874.65);

        selectEmployees(emplsArray, 40);
    }

    private static void selectEmployees(Employee[] emplsArray, int age) {
        for (Employee employee : emplsArray) {
            if (employee.getAge() > age) {
                System.out.println(employee.showInfo());
            }
        }
    }

}
