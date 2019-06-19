package lexicaAnalyais;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] regEX = {"\\b(void|int|double|private|for|public|class)\\b.*", "\\b([a-zA-Z]{1}[0-9a-zA-Z_]{0,31})\\b.*"
				, "(=).*","(\\+{1}).*","(\\-{1}).*","(\\*).*","(/).*","(==).*", "(\\!=).*", "(>).*","(<).*"
				, "\\b(\\d{1,9}\\.\\d{1,32})\\b.*","\\b(\\d{1,9})\\b.*","(/\\*.*?\\*/).*", "(//(.*?)[\r$]?\n).*"
				,"(\\().*","(\\)).*","(;).*","(,).*","(\\{).*","(\\}).*"};
		
		
		String [] symbolTable = {"keyWord", "identifier", "operator","operator","operator","operator","operator","operator"
				,"operator","operator","operator", "numericConstants","numericConstants", "comment","comment"
				,"special character","special character","special character","special character","special character","special character"};
		
		Scanner input = new Scanner(System.in);
		String source = input.nextLine();
		String []arraySource = source.split(" ", 0);
		for(int i = 0; i<arraySource.length; i++) {
			System.out.println(arraySource[i]);
		}
		
		for (int i = 0; i<arraySource.length; i++) {
			for(int j = 0;j<regEX.length;j++) {
	
				Pattern p = Pattern.compile(regEX[j]);
		
				Matcher m =p.matcher(arraySource[i]);
				if(m.matches()) {
					System.out.println(symbolTable[j]+" ==>> "+m.group(1));
						break;
					}
				}
			}
		}

}





