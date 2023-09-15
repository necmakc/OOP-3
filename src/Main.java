// Доработать приложение, которое мы разрабатывали на уроке. Мы должны поработать с сортировкой
// объектов, освоить работу с интерфейсами Comparator, Comparable.
//
//   * Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.

//    Переработать метод generateEmployee, метод должен создавать случайного сотрудника
//    (Worker, Freelancer или любого другого). Метод должен быть один!

//   * Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту?
//    Тогда добавьте соответствующее состояние на уровне ваших классов).

//    Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    /**
     * TODO: Переработать метод generateWorker. Метод должен возвращать случайного
     *  сотрудника (Freelancer или Worker)
     * @return
     */
    public static Employee generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(200, 500);
        if (random.nextBoolean())
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex, random.nextInt(18,65));
        else
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], salaryIndex*20*8, random.nextInt(18,65));

    }

    public static Employee[] generateWorkers(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            employees[i] = generateWorker();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateWorkers(15);

        for (Employee employee: employees) {
            System.out.println(employee);
        }


        Arrays.sort(employees/*, new SalaryComparator()*/);

        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}