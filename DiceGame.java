import java.util.Random;
import java.util.Scanner;

class DiceGame {

    public static void main(String[] args) {

        int data,total=0;
	String name;
        int[] dice = {1, 2, 3, 4, 5, 6};
        Random r = new Random();

	System.out.println("What is your name?");
	System.out.print(">");

	Scanner sc = new Scanner(System.in);

	name = sc.next();

	System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");

        for(int i=0; i<2; i++) {

            data = dice[r.nextInt(6)];
            total += data;

            System.out.println("Die " + (i+1) + ": " + data);

        }

        System.out.println("Total value: " + total);

	if(total > 7) System.out.println(name + " won!");
	else System.out.println(name + " lost");

    }

}
