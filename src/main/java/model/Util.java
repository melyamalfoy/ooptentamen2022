package model;


import java.util.List;
import java.util.function.Consumer;

public class Util {


//    /**
//     * Demo with filter function: returns only graduated students
//     **/
//    public List<Student> filter(List<Student> students) {
//        Predicate<Student> byGraduation = student -> student.isGraduated();
//        List<Student> filtered = students.stream().filter(byGraduation).collect(Collectors.toList());
//        return filtered;
//    }

    /**
     * Demo with consumer function:
     **/
    public void lastNameToUpperCase(List<Employee> idols) {
        Consumer<Employee> upperLastName = Employee -> Employee.setName(Employee.getName().toUpperCase());
        idols.stream().forEach(upperLastName);
    }


}
