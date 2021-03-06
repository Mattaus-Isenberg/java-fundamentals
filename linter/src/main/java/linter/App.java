/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class App
{


    public static void main(String[] args)
    {
        Path path_To_Lint = Paths.get("src/main/resources/gates.js");
        System.out.println(lintJavaScriptFile(path_To_Lint));
    }

    public static String lintJavaScriptFile(Path filePath)
    {
        Scanner fileScanner;
        String log_Message = new String();
        int line_Number = 1;

        try
        {
            fileScanner = new Scanner(new File(filePath.toUri()));

            while(fileScanner.hasNextLine())
            {
                String currentLine = fileScanner.nextLine();
                if(!currentLine.endsWith(";") && !currentLine.endsWith("}") && !currentLine.endsWith("{") && !currentLine.contains("if") && !currentLine.contains("else") && !currentLine.isEmpty() && !currentLine.startsWith("//"))
                {
                    //log_Message = String.format("Line %s: Missing semicolon.\n", line_Number);
                    log_Message += "Line "+ line_Number +": Missing semicolon.\n";
                }
                line_Number ++;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return log_Message;
    }
}