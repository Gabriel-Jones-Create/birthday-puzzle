import javax.swing.JOptionPane;

/**
 * Given any number of people in a room (people ct) what is the experimental
 * probability that two people have the same birthday? Code runs ten-thousand
 * experiments
 */
public class BDayTester {
	public static void main(String[] args) {
		final int trials = 10000;
		String r = JOptionPane.showInputDialog("Enter duplicate count");
		int target = Integer.parseInt(r);
		String s = JOptionPane.showInputDialog("Now enter the number of people in the room");
		int count = Integer.parseInt(s);
		BDay bday = new BDay(count,target);
		int match = 0;
		for (int j = 0; j < trials; j++) {
			if (bday.runTest() == true) {
				match++;
			}
		}
		System.out.println("match chance for " + count + " people: looking for "+ target+" duplicates");
		System.out.println((double) match / trials);
	}
}