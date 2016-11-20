
package contactlist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jenna
 */
public class FileWriterLab {
    public static void main(String[] args) throws IOException {
        boolean append = true;
        
        File data = new File("src" + File.separatorChar + "contactList.txt");
        
        PrintWriter out = new PrintWriter(
                                            new BufferedWriter(
                                                    new FileWriter(data, append)));
        
        out.println("\nJohn Smith");
        out.println("1234 Main St");
        out.println("Oconomowoc, WI 53066");
        out.println("George F. Burdell");
        out.println("4650 Tarragon Way");
        out.println("Sarasota, FL 34687");
        
        out.close();
    }
}
