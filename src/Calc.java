import java.util.Scanner;

public class Calc
	{
		static Scanner input = new Scanner(System.in);
		static int num1;
		static int num2;

		public static void main(String[] args)
			{
				calcMenu();

			}

		public static int add(int x, int y)
			{
				return x + y;
			}

		public static int subtract(int x, int y)
			{
				return x - y;
			}

		public static int multiply(int x, int y)
			{
				return x * y;
			}

		public static double divide(double x, double y)
			{
				return x / y;
			}

		public static void calcMenu()
			{

				System.out.println("What would you like to do?" + "\n" + "1) Add" + "\n" + "2) Subtract" + "\n"
						+ "3) Multiply" + "\n" + "4) Divide" + "\n" + "5) Powers");
				int operation = input.nextInt();
				switch (operation)
					{
					case 1:
						addNums();
						break;

					case 2:
						subtractNums();
						break;
					case 3:
						multiplyNums();
						break;
					case 4:
						divideNums();
						break;
					case 5:
						powersNums();
						break;
					}
			}

		public static void addNums()
			{
				System.out.println("What is the first number?");
				int num1 = input.nextInt();
				System.out.println("What number would you like to add that to?");
				int num2 = input.nextInt();
				System.out.println("\n" + num1 + " + " + num2 + " = " + add(num1, num2));

			}

		public static void subtractNums()
			{
				System.out.println("What is the first number?");
				int num1 = input.nextInt();
				System.out.println("What number would you like to subtract from that?");
				int num2 = input.nextInt();
				System.out.println("\n" + num1 + " - " + num2 + " = " + subtract(num1, num2));

			}

		public static void multiplyNums()
			{
				System.out.println("What is the first number?");
				int num1 = input.nextInt();
				System.out.println("What number would you like to multiply that to?");
				int num2 = input.nextInt();
				System.out.println("\n" + num1 + " x " + num2 + " = " + multiply(num1, num2));
 
			}

		public static void divideNums()
			{
				System.out.println("What is the numerator?");
				int num1 = input.nextInt();
				System.out.println("What is the denominator?");
				int num2 = input.nextInt();
				System.out.println("\n" + num1 + " / " + num2 + " = " + divide(num1, num2));

			}

		public static void powersNums()
			{
				System.out.println("What is the base number?");
				double base=input.nextDouble();
				System.out.println("What is the exponent?");
				double exponent=input.nextDouble();
				System.out.println("\n" + base + "^" + exponent + " = " + Math.pow(base, exponent));

			}

	}
