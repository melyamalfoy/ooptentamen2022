package Model;

public abstract class Employee {
    private String name;
    private int dateOfBirth;
    private int dateStartOfContract;

    public Employee() {
        name = " ";
        dateOfBirth = 2008;
        dateStartOfContract = 0;
    }

    public Employee(String name,
                    int dateOfBirth,
                    int dateStartOfContract) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateStartOfContract = dateStartOfContract;
    }

    public String getName() {

        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }


    public int getDateStartOfContract() {
        return dateStartOfContract;
    }


    public abstract String workHard();
}
