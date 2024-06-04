//Define Interface
interface person
{
    void speak();//abstract method
}

//Student class
class Student implements person
{
    public void speak()
    {
    System.out.println("This is student class speak method");
    }
}

//Teacher class
class Teacher implements person
{
    public void speak()
    {
    System.out.println("This is Teacher class speak method");
    }

    public static void main(String[] args)
    {
        
        Student s=new Student();
        s.speak();
        Teacher t=new Teacher();
        t.speak();
        
    }
}

