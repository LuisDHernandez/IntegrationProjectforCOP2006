
public class HeroRanking {
    //Luis D. Hernandez
    //COP 2006
    //HeroRanking class takes in argument Reputation to decide the rank of the user through
    //if statements
	public static String TheHeroRank(int Reputation) {
		// method to solve for HeroRank
	 // this statement will expand to cover other heroranks and assign a
      // title to
      // them like Superhero

      // method accepts an argument to use in its class to solve for herorank
		String HeroRank = " ";
		if (Reputation > 0) {
			if (Reputation >= 5) {
				HeroRank = "Super-Hero";
			} else {
				HeroRank = "Civilian";
			}
		} else if (Reputation >= -5) {
			HeroRank = "Criminal";
		}
		else {
		    HeroRank = "Super-Villain";
		}
		// final does not allow me to change the value of theherorank
		final String THE_HERO_RANK = HeroRank;

		//System.out.println("Your Hero Rank is: " + THE_HERO_RANK);
        return THE_HERO_RANK;

	}

}