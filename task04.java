package task04;

public class task04 {
	public static void main(String args[]) {
		towerOfHanoi(5 , "First", "Last", "Mid");
	}

	static void towerOfHanoi(int countOfDisk, String fromRod, String toRod, String bufferRod)
	{
		if (countOfDisk == 1)
		{
			System.out.println("Move disk " + countOfDisk + " from rod " +  fromRod + " to rod " + toRod);
			return;
		}
		towerOfHanoi(countOfDisk-1, fromRod, bufferRod, toRod);
		System.out.println("Move disk " + countOfDisk + " from rod " +  fromRod + " to rod " + toRod);
		towerOfHanoi(countOfDisk-1, bufferRod, toRod, fromRod);
	}
}
