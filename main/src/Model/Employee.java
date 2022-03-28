package Model;

public abstract class Employee {
    private String name;
    private int dateOfBirth;
    private int dateStartOfContract;

    public Employee() {

    }

    public Employee(String name,
                    int dateOfBirth,
                    int dateStartOfContract,
                    Position position
    ) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateStartOfContract() {
        return dateStartOfContract;
    }

    public void setDateStartOfContract(int dateStartOfContract) {
        this.dateStartOfContract = dateStartOfContract;
    }

    public Employee(String name, int dateOfBirth, int dateStartOfContract) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateStartOfContract = dateStartOfContract;
    }

    public void workHard() {

    }
}
