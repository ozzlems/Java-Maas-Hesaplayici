public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("kemal" , 2000, 45,1985);
        System.out.println(employee);

    }
}


  class Employee{
  public  String name;
  public double salary;
  public double workHours;
  public int hireYear;

  Employee(String name , double salary , double workHours , int hireYear){
      this.name = name;
      this.salary = salary;
      this.workHours = workHours;
      this.hireYear = hireYear;
  }


      public String getName() {
        return name;
    }

      public double getSalary() { return salary; }

      public double getWorkHours() {
        return workHours;
    }

      public int getHireYear() {
        return hireYear;
    }



      public double tax(){

      double a = (getSalary() * 3) / (100.0);

      if(getSalary() < 1000 && getSalary() > 0 ){
          System.out.println("No tax. Salary is : " + getSalary());
      }
      else if(getSalary() > 1000){
          return (a);
      }
    return a ;
      }


      public double bonus(){
      double bonus = 0;
      if(getWorkHours() > 40 ){
        bonus =  (getWorkHours()- 40.0) * 30.0 ;
      }
      else {
          return 0;}

      return bonus; }



     public double raiseSalary(double salary){
     int currentYear = 2021;

      if(((currentYear - getHireYear()) < 10) && ((currentYear - getHireYear()) > 0)){

      salary = (getSalary() * (0.05)) ;

         }
      else if(((currentYear - getHireYear()) > 9) && ((currentYear - getHireYear()) < 20)){

          salary = (getSalary() * (0.1)) ;

        }
      else if(currentYear - getHireYear() > 19){

          salary = (getSalary() * (0.15)) ;
       }
      return salary; }


    @Override
    public String toString() {

      double total =getSalary() + bonus()- tax();
      double totalSalary = total + raiseSalary( salary);

      return "Adı : " + getName() + "\n" +
              "Maaşı : " + getSalary() +"\n" +
              "Çalışma saati : " + getWorkHours() + "\n" +
              "Başlangıç yılı : " + getHireYear() +"\n" +
              "Vergi : " + tax() + "\n" +
              "Bonus : " + bonus() + "\n" +
              "Maaş artışı : " + raiseSalary(salary) + "\n" +
              "Vergi ve Bonuslar ile birlikte maaş : " + total + "\n" +
              "Toplam maaş : " + totalSalary;


    }
}




