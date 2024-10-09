public class CustomDerivedException extends CustomException
{
    public CustomDerivedException()
    {
        super(); // o co chodzi
    }

    public CustomDerivedException(String message)
    {
        super(message);
    }

    public CustomDerivedException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public CustomDerivedException(Throwable cause)
    {
        super(cause);
    }
}
