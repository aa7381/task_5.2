public class cat extends animal implements  runnable
{
    @Override
    public String eat()
    {
        return "the cat is eating ";
    }
    @Override
    public String makesound()
    {
        return "the cat is makesound";
    }
    public void run()
    {
        System.out.println("the cat can run");
    }
}
