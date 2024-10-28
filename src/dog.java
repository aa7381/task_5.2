public class dog extends animal implements runnable
{
    @Override
    public String eat()
    {
        return "the dog is eating ";
    }
    @Override
    public String makesound()
    {
        return "the dog is makesound";
    }
    public void run()
    {
        System.out.println("the dog can run");
    }
}
