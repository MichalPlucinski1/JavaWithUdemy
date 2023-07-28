package LearningPackages.SortingWithNestedClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10002, "Maria", 2021),
                new Employee(10003, "Stefan", 2013),
                new Employee(10006, "Tim", 2014),
                new Employee(10009, "Jin", 2022)

        ));

       employees.sort(new Employee.EmployeeComparator<>());

        printList(employees);

        System.out.println();

        employees.sort(new Employee.EmployeeComparator<>("yearstarted").reversed());
        printList(employees);
    }

    public static void  printList (List<Employee> employees){
        for (Employee e : employees){
            System.out.println(e);
        }
    }
}
