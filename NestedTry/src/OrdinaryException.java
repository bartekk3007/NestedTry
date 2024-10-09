public class OrdinaryException extends Exception
{
    public OrdinaryException()
    {
        super();
    }
    public OrdinaryException(String message)
    {
        super(message);
    }

    public OrdinaryException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public OrdinaryException(Throwable cause)
    {
        super(cause);
    }
}
