public class BDay {
	private int roomFolks; // people count in room
	private int target; // creates target variable for how many people must be born on the same day of
						// the month

	/**
	 * Constructs a BDay object based on number of people and target value
	 * 
	 * @param people     number of people in the room
	 * @param inittarget number of people that will possibly have the same day of
	 *                   the month as their birthday
	 */
	public BDay(int people, int inittarget) {
		// sets room folks to the people input
		roomFolks = people;
		// sets target to the target input
		target = inittarget;
	}

	/**
	 * Returns boolean of whether or not the target number of people share the same
	 * birthday
	 * 
	 * @return <code>true</code> the target number of people are born on the same
	 *         day of the month; <code>false</code> otherwise
	 */
	public boolean runTest() {
		int[] days = new int[30]; // boolean score board
		int ranDay; // creates random day variable
		// for every person in the room, every person is assigned a random birthday
		for (int p = 0; p < roomFolks; p++) {
			ranDay = genDay(); // generate a random day
			days[ranDay]++; // sets the index of that birthday up one
		}
		// for every value in days, if the value is greater than or equal to the target,
		// it returns true
		for (int value : days) {
			if (value >= target) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns integer of random number between 0-29
	 * 
	 * @return integer value between 0-29
	 */
	private int genDay() {
		// no leap year - just gen a random day 0-364
		return ((int) (30 * Math.random()));
	}
}