package common3;

import java.util.*;

public class Startup {
    
    

    public static void main(String[] args) {
        
        
        List <Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Roberts", "Rob", "123-45-6789");
        Employee emp2 = new Employee("Johnson", "John", "123-45-6789");
        Employee emp3 = new Employee("Philbert", "Phil", "333-33-3333");
        Employee emp4 = new Employee("James", "Jim", "444-44-4444");
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        
        //Retrieve and display the size of the list.
        System.out.println("The size of the employee list is: " 
                + employeeList.size());
        Employee thisEmployee = employeeList.get(1);
        
        //Retrieve the 2nd item in the list and store it in a variable of 
        //type Employee.
        System.out.println("The 2nd employee in the list is:" 
                + thisEmployee.toString());
        
        //Create an old style for loop with counter variable and output all 
        //items to the console. New for each loop.
        System.out.println("All employees:");
        for(Employee emp : employeeList)
            System.out.println(emp);
//        for (int i = 0; i < employeeList.size(); i++){
//            System.out.println(employeeList.get(i));
//        }
        
        //Generified and removes duplicates
        Set<Employee> removeDupes = new HashSet<>();
        employeeList = new ArrayList<>(removeDupes);
        
        //Experiment with at least two other operations on a List.
        employeeList.remove(1);
        System.out.println("Remove 2nd empoyee.");
        for (Object employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }
        
        employeeList.clear();
        System.out.println("Clear employee list.");
        employeeList.stream().forEach((employeeList1) -> {
            System.out.println(employeeList1);
        });


//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
//        System.out.println(a1);
//        System.out.println(a2);
//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    }
}
