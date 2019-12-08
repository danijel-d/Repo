package excel;

import java.util.Scanner;

public class GlavniProgram {

	public static void main(String[] args) {
		
		ExcelUtils.setExcell("Data (DOM).xls");
		ExcelUtils.setWorkSheet("Brojevi");
		ExcelUtils.getDataAt(0, 0);
		double zbir=0;
		
		String bv =ExcelUtils.getDataAt(0, 0);
		Double dd = Double.parseDouble(bv);
		System.out.println(dd);
		int s = ExcelUtils.getRowNumber();
		for (int i = 0; i <s; i++) {
			String b =ExcelUtils.getDataAt(i, 0);
			Double d1 = Double.parseDouble(b);
			System.out.println(d1);
			zbir += d1;
		}
		System.out.println("Zbir brojeva je :"+zbir);
		System.out.println("Unesite dodatni broj : ");
		Scanner sc = new Scanner(System.in);
		String clan="";
		try {
			 clan = sc.nextLine();
			double d1=Double.parseDouble(clan);
		} catch (Exception e) {
			
		System.out.println("Probajte ponovo :");
		
		while (!sc.hasNextInt()) {
			clan = sc.nextLine();
		}
		clan = sc.nextLine();
		}
		
		
		ExcelUtils.setDataAt(s, 0, clan);
		System.out.println("Novi clan je ubacen");
		
		int r = ExcelUtils.getRowNumber();
		double zbir2 =0;
		for (int i = 0; i < r; i++) {
			String b =ExcelUtils.getDataAt(i, 0);
			Double d1 = Double.parseDouble(b);
			
			zbir2 += d1;
		}
		System.out.println("Novi zbir brojeva je :"+zbir2);
		
	ExcelUtils.closeExcell();
	}

}
