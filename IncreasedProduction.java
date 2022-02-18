import java.util.*;
public class IncreasedProduction {
	// Bradley Cox

	public static void main(String[] args) {
		
		double ppm = 4000;
		ArrayList<Double> production = new ArrayList<>();
		
		production.add(ppm);
		System.out.println("On month 1, this employee should produce " + ppm + " parts.");
		
		for (int i = 2; i < 25; i++) {
			ppm = ppm + (ppm * 0.06); 
			production.add(ppm);
			System.out.println("On month " + i + ", this employee should produce " + ppm + " parts.");
		}
		
		for (Double k : production) {
			if (k > 7000) {
				System.out.println("This employee will produce " + k + " parts on month " + (production.indexOf(k) + 1) + ", qualifying them for a raise.");
				break;
			}
		}
		
		
	

	}

}
