package src;

public class Employee {
    private String name;
    private int empId;
    private String empDesignation;

    public Employee(String name, int empId, String empDesignation) {
        this.name = name;
        this.empId = empId;
        this.empDesignation = empDesignation;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

}
