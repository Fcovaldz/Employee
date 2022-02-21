/*
 * @autor Francisco Bañuelos.
 */
package trucos.employee;

class Employee {
    int eno;
    String ename;
    float salary, netsal;

    public Employee(int no, String ename, float salary) {
        this.eno = no;
        this.ename = ename;
        this.salary = salary;
        this.netsal = salary+((salary/100)*10)+((salary/100)*20)-((salary/100)*15);
    }

    void display(){
        System.out.println("Emp no: "+ eno);
        System.out.println("Emp name: "+ ename);
        System.out.println("Emp salary: "+ netsal);
    }
}
class Employeemain{
    public static void main(String[] args){
        Employee e = new Employee(100, "Chris",45000.5f);
        e.display();

    }
}
