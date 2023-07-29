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

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
        printList(employees);


        System.out.println("\n\tStore Members\t");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
              new StoreEmployee(10015, "Meg", 2019, "Target"),
              new StoreEmployee(10055, "Bud", 2016, "Target"),
              new StoreEmployee(10017, "Joe", 2021, "Walmart"),
              new StoreEmployee(10016, "Marty", 2018, "Walmart"),
              new StoreEmployee(10101, "Tom", 2020, "Macys")
        ));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        printList(storeEmployees);

    }

    public static void  printList (List<?> employees){
        for (var e: employees){
            System.out.println(e);
        }
    }
}
