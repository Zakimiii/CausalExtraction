package cabochaParser;

import java.util.ArrayList;
import cabochaParser.CabochaParser.POS;

public class parserTest {

	public static void main(String[] args) {
		String test = "* 0 1D 0/1 0.000000\n����\t����,�����\,*,*,*,*,����,�L���E,�L���[\n��\t����,�W����,*,*,*,*,��,�n,��\n* 1 -1D 0/0 0.000000\n����\t����,���,*,*,*,*,����,�n��,�n��\nEOS";
		CabochaParser parser = new CabochaParser(test);
		ArrayList<POS> results = parser.parse();
		System.out.println("�I��");
	}

}
