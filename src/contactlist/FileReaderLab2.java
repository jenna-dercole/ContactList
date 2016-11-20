/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jenna
 */
public class FileReaderLab2 {

   
    public static void main(String[] args) {
        File data = new File("src" + File.separatorChar + "contactList.txt");
        
        if (data.exists()) {
            BufferedReader in = null;
            int lineCount = 1;
            try {
                in = new BufferedReader(new FileReader(data));
                String line = in.readLine();
                while(line != null) {
                    line = in.readLine();
                    lineCount++;
                    if (lineCount == 4) {
                        System.out.print(line);
                    }
                    if (lineCount == 6) {
                        String[] lineArray = line.split(" ");
                        System.out.println(" State: " + lineArray[1]);
                    }
                } 
           } catch (IOException ioe) {
                System.out.println("There was an error reading this file!");
            } finally {
                try {
                    in.close();
                } catch (Exception e) {
                    System.out.println("The file did not close properly!");
                }
            }
        }
    }
    
}
