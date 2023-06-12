import java.util.Random;

class task1 {

    public static void main(String[] args) {

	int data,total=0;
	int[] dice = {1, 2, 3, 4, 5, 6};
	Random r = new Random();


	System.out.println("Rolling dice...");

	for(int i=0; i<2; i++) {

	    data = dice[r.nextInt(6)];
	    total += data;
	    
	    System.out.println("Die " + (i+1) + ": " + data);

	}

	System.out.println("Total value: " + total);

    }

}
