public class BDay {
	private int roomFolks; // people count in room
	private int target;
	public BDay(int people, int inittarget) {
		roomFolks = people;
		target = inittarget;
	}

	public boolean runTest() {
		int[] days = new int[30]; // boolean scoreboard
		int ranDay;
		for (int p = 0; p < roomFolks; p++) {
			ranDay = genDay(); // generate a random day
			days[ranDay]++;	
		}
		for(int value : days) {
			if(value >= target) {
				return true;
			}
		}
		return false;
	}

	private int genDay() {
		// no leap year - just gen a random day 0-364
		return ((int) (30 * Math.random()));
	}
}