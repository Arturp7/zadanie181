public class Calculator {


    double calculation(double limit) {
        int sum = 2;
        int first = 1;
        int second = 2;
        int next = 0;

        while (next < limit) {
            next = first + second;
            first = second;
            second = next;
            if (next % 2 == 0) {
                sum = sum + next;
            }
        }
        return sum;


    }


}
