
import java.util.Scanner;

class StudentExaminationResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            if (n == 0) {
                throw new ArithmeticException("No subjects entered");
            }

            int sum = 0;

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException(
                        "Marks must be between 0 and 100"
                    );
                }

                sum = sum + marks;
            }

            double average = (double) sum / n;

            System.out.println("Average Marks = " + average);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid input! Enter numbers only.");
        }
    }
}


