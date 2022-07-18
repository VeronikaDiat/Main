import Lesson4.Circle;
import Lesson4.RegexValidator;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
       // Test1.Name();
        //Test2.Type();
        //Test3.Type();
       // Test4.Else();
       // Test5.Conditional();
        //Test6.SwitchCondition();
       // Test7.Array();
        //Test8.Loop();
        //Test9.Loop2();
        //Test10.Loop3();
        //Circle.CalculateArea(0.8);
       // Circle.CalculateLength(1);
        RegexValidator phoneValidator = new RegexValidator(("(((\\+38)?0)([0-9]{9}))$"));
        phoneValidator.Validate("+380665714021");
        RegexValidator nameValidator = new RegexValidator("^[A-Z]+$");
        nameValidator.Validate("NIKA");
    }
}

