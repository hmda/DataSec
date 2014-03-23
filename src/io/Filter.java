package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;

import com.google.gson.Gson;

/**
 *
 * @author N56V
 */
public class Filter {
    public void readWriteFile(String pathRead, String pathWrite){
        try {
            FileInputStream fos1 = new FileInputStream(pathRead);
            Reader input = new java.io.InputStreamReader(fos1, "UTF8");
            BufferedReader inputbuf = new BufferedReader(input);
            String lineRead;
            String[] temp;
            Article art = new Article();
            Gson gson = new Gson();
            
            FileOutputStream fos2 = new FileOutputStream(pathWrite);
            Writer output = new java.io.OutputStreamWriter(fos2,"UTF8");
            
            while ((lineRead = inputbuf.readLine()) != null){
                 temp = lineRead.split("\t");
                 lineRead = temp[3];
                 art = gson.fromJson(lineRead, Article.class);
                 output.write(art.getContent().replace("\n", " ") + "\n");
            }
            
            input.close();
            output.close();

        } catch (Exception e) {
            System.out.println("Khong doc duoc file");
            e.printStackTrace();
        }
    }
}

