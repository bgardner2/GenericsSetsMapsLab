package genericssetsmapslab;

import java.util.*;



public class GenericsSetsMapsLab {

    
    public static void main(String[] args) {

/////////////////////        
////////Lab #2///////
/////////////////////
        
//        List employees = new ArrayList();
//        Employee e1 = new Employee("Ben", "Gardner", "111-11-1111");
//        Employee e2 = new Employee("John", "Jones", "111-11-1111");
//        Employee e3 = new Employee("Greg", "Clark", "222-22-2222");
//        Employee e4 = new Employee("Jim", "Lombardo", "333-33-3333");
//        
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        employees.add(e4);
//        
//        Employee employeeAtIndex2 = (Employee)employees.get(1);
//       
//        System.out.println("Outputting List Lab"
//                + "\n-----------------");
//        System.out.println("employee list size: " + employees.size());
//        System.out.println("Second employee in employee list: " + employeeAtIndex2);
//        System.out.println("\nAll employees in the table: ");
//        
//        for(int i = 0; i < employees.size(); i++){
//            System.out.println("employee at index " + i +  " in employee list: " + employees.get(i));
//        }
        
////////////////////
////////Lab 3//////
///////////////////
        
//        List<Employee> employees = new ArrayList<Employee>();
//        Employee e1 = new Employee("Ben", "Gardner", "111-11-1111");
//        Employee e2 = new Employee("John", "Jones", "111-11-1111");
//        Employee e3 = new Employee("Greg", "Clark", "222-22-2222");
//        Employee e4 = new Employee("Jim", "Lombardo", "333-33-3333");
//        
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        employees.add(e4);
//        
//        Employee employeeAtIndex2 = employees.get(1);
//       
//        System.out.println("Outputting List Lab"
//                + "\n-----------------");
//        System.out.println("employee list size: " + employees.size());
//        System.out.println("Second employee in employee list: " + employeeAtIndex2);
//        
//        System.out.println("\nAll employees in the table: ");
//        for(Employee e : employees){
//            System.out.println(e);
//        }
        
//////////////////////
////////Lab #4////////
//////////////////////
        
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("Ben", "Gardner", "111-11-1111");
        Employee e2 = new Employee("John", "Jones", "111-11-1111");
        Employee e3 = new Employee("Greg", "Clark", "222-22-2222");
        Employee e4 = new Employee("Jim", "Lombardo", "333-33-3333");
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        Set<Employee> setEmployees = new HashSet<Employee>(employees);
        List<Employee> newListEmployees = new ArrayList<Employee>(setEmployees);
       
        System.out.println("Outputting List Lab"
                + "\n-----------------");
        System.out.println("employee list size: " + newListEmployees.size());
        
        System.out.println("\nAll employees in the table: ");
        for(Employee e : newListEmployees){
            System.out.println(e);
        }
        
////////////////////        
////////Lab #5//////
////////////////////
        
//        Map<String, Employee> employees = new HashMap<String, Employee>();
//        Employee e1 = new Employee("Ben", "Gardner", "111-11-1111");
//        Employee e2 = new Employee("John", "Jones", "111-11-1111");
//        Employee e3 = new Employee("Greg", "Clark", "222-22-2222");
//        Employee e4 = new Employee("Jim", "Lombardo", "333-33-3333");
//        
//        
//        employees.put(e1.getSsn(), e1);
//        employees.put(e2.getSsn(), e2);
//        employees.put(e3.getSsn(), e3);
//        employees.put(e4.getSsn(), e4);
//        
//        Collection<Employee> employeeValues= employees.values();
//       
//        System.out.println("Outputting Map Lab #5"
//                + "\n---------------------");
//        System.out.println("employee Map size: " + employees.size());
//        
//        System.out.println("\nAll employees in the table: ");
//        for(Employee e : employeeValues){
//            System.out.println(e);
//        }
        
        
        
//////////////////////
////////Lab 6/////////
//////////////////////        
//        Map<String, Employee> empTreeMap = new TreeMap<String, Employee>();
//        Employee e1 = new Employee("Ben", "Gardner", "111-11-1111");
//        Employee e2 = new Employee("John", "Jones", "111-11-1111");
//        Employee e3 = new Employee("Greg", "Clark", "222-22-2222");
//        Employee e4 = new Employee("Jim", "Lombardo", "333-33-3333");
//        
//        
//        empTreeMap.put(e1.getSsn(), e1);
//        empTreeMap.put(e2.getSsn(), e2);
//        empTreeMap.put(e3.getSsn(), e3);
//        empTreeMap.put(e4.getSsn(), e4);
//        
//        Collection<Employee> employeeValues = empTreeMap.values();
//       
//        System.out.println("Outputting Map Lab #5"
//                + "\n---------------------");
//        System.out.println("employee Map size: " + empTreeMap.size());
//        
//        System.out.println("\nAll employees in the table: ");
//        for(Employee e : employeeValues){
//            System.out.println(e);
//        }
        
        
//////////////////////
////////Lab 7/////////
//////////////////////  
        
        
        
        
    }

}
