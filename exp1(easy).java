import java.util.*;

public class IntegerSumCalculator {

    
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null; 
        }
    }

   
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num; 
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();

       
        String[] parts = input.split("\\s+");
        for (String part : parts) {
            Integer num = parseStringToInteger(part);
            if (num != null) {
                numbers.add(num);
            }
        }

      
        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);

        scanner.close();
    }
}
