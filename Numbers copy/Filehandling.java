package Numbers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Filehandling {

	
	public static void main(String[] args)  {
File f = new  File("c://java_batch/pan.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String s=br.readLine();
while(s!=null) {
	System.out.println(s);
	s=br.readLine();
	}
}

}
