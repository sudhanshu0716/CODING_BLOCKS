public class compositenumber {
    public static void main(String[] args) {
        int number = 121; // Replace with the composite number you want to find prime factors for

       
        int res=findPrimeFactors(number);
        System.out.println(res);

    }

    public static int findPrimeFactors(int number) {
        int sum=0;
        // Print the number of 2s that divide the number
        while (number % 2 == 0) {
            sum=sum+2;
            number /= 2;
        }

        // At this point, 'number' must be odd
        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
       
                sum=sum+i;
                number /= i;
            }
        }
        if (number > 2) {
            sum =sum+ number;
        }


        return sum;


    }
}
