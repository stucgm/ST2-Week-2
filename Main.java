//Week 2, ST2.

import java.util.*;
import java.text.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String x = readUTF8File("French.txt");
    System.out.print(x);
    writeUTF8File("FrenchOut.txt", x);

    /*int x = in.nextInt();
    int y = in.nextInt();
    int z = sum(x, y);
    System.out.println(z);*/
  }
  
  public static String readUTF8File(String filePath) {
		StringBuilder fileContent = new StringBuilder();
		try {
			Reader reader = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String s;
			while ((s = bufferedReader.readLine()) != null) {
			    fileContent.append(s + "\n");
			}
			bufferedReader.close();
			reader.close();
		} 
    catch (Exception e) 
    {
			e.printStackTrace();
		}
		return fileContent.toString();
	}

  public static void writeUTF8File(String filePath, String content) {
      try {
            Writer writer = new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_8);
            PrintWriter printWriter = new PrintWriter(writer);
    
            // write your code here to write the newly read content to file
            printWriter.println(content);

            writer.close();
            printWriter.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }



  static int sum(int a, int b){
    return (a + b);
  }
}