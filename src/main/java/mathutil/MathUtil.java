package mathutil;

public class MathUtil {
    //
    public static int cube(int num){
        return num*num*num;
    }
    public static void Arm(int num){
        int temp = num;
        int sum = 0;
        while(num != 0){
            int rem = num %10;
            sum += fact(rem);
            num /= 10;
        }
        if(sum == temp){
            System.out.println("Arm Number");
        }
        else{
            System.out.println("Not Arm");
        }
    }

    public static int reverseNum(int num){
        int sum = 0;
        while(num != 0){

            int rem = num % 10;
            sum = sum *10 + rem;
            num /= 10;
        }
        return sum;
    }

    public static int sum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }

    public static int sumRange(int num, int num2){
        int sum = 0;
        for(int i = num+1; i < num2; i++){
            sum += i;
        }
        return sum;
    }

    public static int greatest(int num1, int num2, int num3){
        if(num1 > num2 && num3 > num2){
            return num1;
        }
        else if(num2 > num1 && num3 > num1){
            return num2;
        }
        else{
            return num3;
        }
    }

    public static void leap(int num){
        if(num % 4 == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }

    public static void prime(int num){
        int i;
        for(i = 2; i < num; i++){
            if(i % num == 0){
                break;
            }
        }
        if(i != num){
            System.out.println("Not prime");
        }
        else {
            System.out.println("prime");
        }
    }

    public static void primeRange(int num1, int num2){
        int j;
        for(int i = num1; i < num2; i++){
            for( j = 2; j < i; j++){
                if(i % j == 0){
                    break;
                }
            }
            if(j == i){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }

    public static boolean isPal(int num){
        if(reverseNum(num) == num){
            return true;
        }
        else {
            return false;
        }
    }

    public static void fiboSeries(int num){
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.print(a + " " + b + " " + c + " ");
        for(int i = 0; i <= num; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static int power(int num, int power){
        int pow = 1;
        for(int i = 1; i <= power; i++){
            pow *= num;
        }
        return pow;
    }

    public static void factors(int num){
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isStrong(int num){
        int temp = num;
        int m = 0;
        while(num != 0){
            int rem = num % 10;
            m = m + fact(rem);

            num = num/10;
        }
        if(m == temp){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i==0){
                sum += i;
            }
        }
        if(sum == num){
            return true;
        }
        else {
            return false;
        }
    }

    public static int fact(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    public static boolean isAutomorph(int num){
        int temp = num;
        int sqr = power(num, 2);
        int count = 0;
        while(num != 0){
            count++;
            num = num/10;
        }

        if(sqr % (power(10,count)) == temp){
            return true;
        }
        else {
            return false;
        }


    }

    public static void isHarshad(int num){
        while(num != 1){
            int temp = num;
            int sum = 0;
            while(temp != 0){
                int rem = temp % 10;
                sum += rem;
                temp = temp / 10;

            }
            num = num / sum;
            System.out.println(num);
        }

    }
}


