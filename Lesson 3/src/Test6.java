public class Test6 {
    public static void SwitchCondition (){
        String grade ="B";
        switch (grade) {
            case "A":
                System.out.println("Great!");
                break;
            case "B":
                System.out.println("Good!");
                break;
            case "C":
                System.out.println("Try better!");
                break;
            case "E":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
