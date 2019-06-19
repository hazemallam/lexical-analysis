package lexicaAnalyais;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String s  = input.nextLine();
		LexiclAnalysis l = new LexiclAnalysis();
		l.tokenize(s);
	}

}
