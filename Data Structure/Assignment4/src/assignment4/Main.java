// 5676440
 
package assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author abdu
 */
public class Main {

    static String[] sy;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String fileName = "TTAA.txt";
        File f = new File(fileName);
        SymbolTable symblTable = new SymbolTable(25);

        if (f.exists()) {

            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;

            int i = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {

                sy = strLine.split("\t"); 

                ElementType elementTybe = new ElementType(sy[0], sy[1]);

                symblTable.add(elementTybe);
                i++;

            }
            //Close the input stream
            br.close();
            System.out.println("Finished reading " + i + " lines");
            System.out.println("Printing the data ");
            System.out.println("______________ _________ _____________");

            System.out.println(symblTable.toString());
        } else {
            System.out.println("File not found!");
        }

    }

}
