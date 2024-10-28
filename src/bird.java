public class bird extends animal implements  flyable
{
    @Override
    public String eat()
    {
        return "the bird is eating ";
    }
    @Override
    public String makesound()
    {
        return "the bird is makesound";
    }
    @Override
    public void fly()
    {
        System.out.println("the bird can fly");
    }
}
