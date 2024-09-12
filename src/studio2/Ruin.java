package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startAmount, winChance, winLimit, currentAmount, chance;
		double ruinTime;
		startAmount= 3;
		winLimit= 5;
		winChance= 1.0/2.0;
		ruinTime=0.0;
		


		for (int totalSimulation =1; totalSimulation <= 3; totalSimulation++) {
			currentAmount= startAmount ;
		while (currentAmount < winLimit && currentAmount >0) {
			chance= Math.random();
			if (chance <= winChance) {
				currentAmount++;

			}
			else {
				currentAmount --;
				ruinTime++;
			}


		}
		double ruinRate = ruinTime/totalSimulation;

		if (currentAmount >= winLimit) {
			System.out.println(totalSimulation + " and " +currentAmount+"Success!");
		}

		else {
			System.out.println(totalSimulation+" and "+currentAmount+"Ruin");
		}
		System.out.print(ruinRate);

	}
	}

}


