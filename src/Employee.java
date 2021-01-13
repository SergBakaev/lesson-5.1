public class Employee {

    public String FIO;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;




    public Employee(String FIO, String position, String email, String  phone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }



    public  void printEmployee() {
        for (int i = 0; i<5; i++){
            System.out.println("ФИО " + FIO);
            System.out.println("Должность " + position);
            System.out.println("email " + email);
            System.out.println("phone " + phone);
            System.out.println("Зарплата " + salary);
            System.out.println("Возраст " + age);
        }
    }

}

