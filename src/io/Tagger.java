<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
import jvntagger.MaxentTagger;
import jvntagger.POSTagger;

/**
 *
 * @author N56V
 */
public class Tagger {
    public void tag(String pathRead, String pathWrite){
        String modelDir;
        modelDir = "model\\maxent";
        POSTagger tagger = null;
        tagger = new MaxentTagger(modelDir);        
         
        try {
            FileInputStream fos1;
            fos1 = new FileInputStream(pathRead);
            Reader input = new java.io.InputStreamReader(fos1, "UTF8");
            BufferedReader inputbuf = new BufferedReader(input);
            String lineRead;
            
            FileOutputStream fos2 = new FileOutputStream(pathWrite);
            Writer output = new java.io.OutputStreamWriter(fos2,"UTF8");
            String lineWrite;
            
            // Tải từng sòng từ file "baomoi.content.20140315.txt"
            while ((lineRead = inputbuf.readLine()) != null){
                // Phân loại từ bảng VnTagger
                lineWrite = tagger.tagging(lineRead);
                output.write(lineWrite);
            }
            input.close();
            output.close();
        } catch (Exception e) {
            System.out.println("Khong doc duoc file");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            e.printStackTrace();
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
        }
    }
}
