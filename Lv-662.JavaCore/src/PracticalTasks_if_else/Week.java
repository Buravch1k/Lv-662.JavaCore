package PracticalTasks_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Enter the number of the day of the week. Display the name in three languages.
// (switch - case - break - default)

public class Week {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		task_1(br);

	}

	private static void task_1(BufferedReader br) throws IOException {

		System.out.println("Enter the number of the day of the week: ");
		int numberOfDay = Integer.parseInt(br.readLine());

		switch (numberOfDay) {
		case 1:
			System.out.printf("Monday\n��������");
			break;
		case 2:
			System.out.printf("Tuesday\n³������");
			break;
		case 3:
			System.out.printf("Wednesday\n������");
			break;
		case 4:
			System.out.printf("Thursday\n������");
			break;
		case 5:
			System.out.printf("Friday\n�������");
			break;
		case 6:
			System.out.printf("Saturday\n������");
			break;
		case 7:
			System.out.printf("Sunday\n�����");
			break;
		default:
			System.out.println("WRONG!");

		}

	}

}
