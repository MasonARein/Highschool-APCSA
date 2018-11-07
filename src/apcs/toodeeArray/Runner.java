package apcs.toodeeArray;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] brick = new double [3][4];
		double amount = 0.0;
		double inci = 0.0;
		double incj = 0.0;
		for(int i = 0; i < brick.length;i++) {
			inci = inci + i;
			amount = amount + inci;
			for(int j = 0; j < brick[0].length; j++) {
				if(j == 3) {
					incj = incj + 0.2;
				}
				else {
					incj = incj + 0.1;
				}
				amount = amount + incj;
				brick [i][j] = amount;
				incj = 0.0;
			}
			amount= 0.0;
		}
		for(int i = 0; i < brick.length; i++) {
			for(int j = 0; j < brick[0].length;j++) {
				System.out.print(brick[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
