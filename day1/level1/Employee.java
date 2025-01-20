 class man
{
    String name;
    String Id;
    Double salary;

    public void input(String name,String Id,Double salary)
    {
        this.name=name;
        this.Id=Id;
        this.salary=salary;
    }

    public void display()
    {
        System.out.println("Employee name is  " + name + " , ID is --" + Id + "and salary is "+ salary );
    }

}

 class Employee
{
    public static void main(String[] args) {
        
        man e1=new man();
        e1.name="Rahul";
        e1.input("Ankit", "0111IT211019", 50000.0);
        e1.display();
    }
}
