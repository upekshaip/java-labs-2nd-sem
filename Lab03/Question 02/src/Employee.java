package src;

public class Employee {
    private String name;
    private double basic_salary;
    private double bonus;
    private double bonus_amount;

    public Employee(String name, double basic_salary, double bonus) {
        this.name = name;
        this.basic_salary = basic_salary;
        this.bonus = bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getBonus_amount() {
        return getBasic_salary() + getBonus();
    }

}
