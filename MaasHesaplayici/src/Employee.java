public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax (){
        if(this.salary < 1000){
            return 0.0;
        }else{
            return this.salary * 0.03;
        }
    }
    public int bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }else{
            return 0;
        }
    }

    public double raiseSalary(){
        if (2021 - this.hireYear < 10){
            return this.salary * 0.05;
        }else if(2021 - this.hireYear > 9 && 2021 - this.hireYear < 20){
            return this.salary * 0.1;
        }else {
            return this.salary * 0.15;
        }
    }

    public void employeeInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş: " + (this.salary - tax() + bonus() + raiseSalary()));

    }
}
