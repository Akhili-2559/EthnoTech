class Uber
{
    void pay()
    {
        System.out.println("calculating the payament");
    }
}
class auto extends Uber
{
    @Override
    void pay()
    {
        int ammount= 160;
        System.out.println("auto ammount is:"+ammount +" for 2 km");
    }
}
class bike extends Uber
{
    @Override
    void pay()
    {
        double ammount=80.50;
        System.out.println("bike ammount is:"+ammount + " for 2 km");
    }
}
class car extends Uber
{
    @Override
    void pay()
    {
        double ammount=250;
        System.out.println("car ammount is:"+ammount +" for 2 km");
    }
}
class TravelFare
{
    public static void main(String[] args)
    {
        auto a=new auto();
        a.pay();
        bike b=new bike();
        b.pay();
        car c=new car();
        c.pay();
    }
}