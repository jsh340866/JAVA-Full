package Ch07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class C02ReadLineMain {

	public static void main(String[] args) throws IOException {
		
		//
		Writer out = new FileWriter("C:\\IOTEST\\test2.txt");
//		out.write("a");
//		out.write("b");
//		out.write("c");
//		out.flush();
//		out.close();
		
		BufferedWriter bout = new BufferedWriter(out);
		PrintWriter pout = new PrintWriter(bout);
		pout.print("HELLO WORLD");
		pout.print("HELLO WORLD");
		pout.print("HELLO WORLD");
		pout.print("HELLO WORLD");
		pout.flush();
		pout.close();
		bout.close();
		out.close();
		
		
	}

}
