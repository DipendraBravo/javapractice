abstract class Bank{
    abstract int getRateOfInterest();
}
class NabilBank extends Bank{
    int getRateOfInterest(){
        return 10;
    }
}
class NicAsiaBank extends Bank{
    int getRateOfInterest(){
        return 12;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank obj;
        obj = new NabilBank();
        System.out.println("Rate of INterest is"+obj.getRateOfInterest()+"%");
        obj = new NicAsiaBank();
        System.out.println("Rate if interest is "+obj.getRateOfInterest()+"%");
        
    }
}
