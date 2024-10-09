public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Bartek", "Kołakowski", 30);
        try
        {
            p1.intoduce();
        }
        catch(CustomDerivedException e)
        {
            e.printStackTrace();
        }
    }
}