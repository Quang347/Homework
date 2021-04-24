   
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class CSVReaderWriter {
public static void main(String[] args){
    /** IMPORTANT: Please change BOTH the file path according to where you put it or else the code cannot run */
    String path = "C:/Users/Dang Quang/Desktop/readfile/advertising.csv";
    String line = "";
    String filepath = "C:/Users/Dang Quang/Desktop/readfile/advertising_cp.csv";
    try {
    BufferedReader br = new BufferedReader(new FileReader(path));

    while ((line = br.readLine()) !=null){
        System.out.println(line);
        saveData(line, filepath);
        }
        
    } catch (FileNotFoundException ex){
        ex.printStackTrace();
    } catch (IOException ex){
        ex.printStackTrace();
    }
}
public static void saveData(String line, String filepath){
    try {
        FileWriter fw = new FileWriter(filepath,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(line);
        pw.flush();
        pw.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, " Record not saved ");
}

}
}

