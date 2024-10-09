public class Person
{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public void intoduce() throws CustomException
    {
        throw new CustomException("Exception is thrown every time");
    }

    public void introduceDerived() throws CustomDerivedException
    {
        throw new CustomDerivedException("Derived exception is thrown every time");
    }

    public void personalise() throws OrdinaryException
    {
        throw new OrdinaryException("Ordinary exception is thrown every time");
    }
}