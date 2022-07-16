import java.security.PublicKey;

public class Test10 {
    public static void Loop3() {
        double[] numList = {1.2, 4.5, 2.9, 2.9, 3.8};

        //print all
        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }
//Sum

        double sum = 0;
        for (int i = 0; i < numList.length; i++) {
            sum = sum + numList[i];
        }
        System.out.println("Sum is:" + sum);

        //The largest element
        double max = numList[0];
        for (int i = 1; i < numList.length;i++){
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        System.out.println("the biggest is:" + max);
    }


}



