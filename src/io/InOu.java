<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
package io;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

package io;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import vn.hus.nlp.tokenizer.VietTokenizer;
import jvntagger.POSTagger;
import jvntagger.MaxentTagger;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965

/**
 *
 * @author N56V
 */
public class InOu {

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        
    public static void main(String[] args) {
        // TODO code application logic here
        String contentNameFile = getContentFileName();
        String resultFile = getOutputFileName();
        Filter filter = new Filter();
        Tokenizer tokenizer = new Tokenizer();
        Tagger tagger = new Tagger();
        Changer changer = new Changer();
        filter.readWriteFile("baomoi.tsv", contentNameFile);   // Lọc nội dung trong thẻ "content"
        tokenizer.token(contentNameFile, "token.txt"); // Xác định các từ.
        tagger.tag("token.txt", "tag.txt"); // Phân loại các từ
        changer.change("tag.txt", resultFile);  // Chuyển đổi các từ theo yêu cầu, in ra file kết quả cuối cùng.
    }
    
    private static String getContentFileName() {
	String fileName;
	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	Date date = new Date(); // get system time
	String stringDate = dateFormat.format(date);
	fileName = "baomoi.content." + stringDate + ".txt";
	return fileName;
    }

    private static String getOutputFileName() {
	String fileName;
	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	Date date = new Date(); // get system time
	String stringDate = dateFormat.format(date);
	fileName = "ANHHMD_" + stringDate + "_NOUN.tsv";
	return fileName;
    }
}
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
    private static String[] words = new String[31];
    private static long[] amount = new long[31];
        
    public static void main(String[] args) {
        // TODO code application logic here
        Filter filter = new Filter();
        Tagger tagger = new Tagger();
        Changer changer = new Changer();
        VietTokenizer tokenizer = new VietTokenizer();
        filter.readWriteFile("baomoi.tsv","baomoi.content.20140315.txt");   // Lọc nội dung trong thẻ "content"
        tokenizer.tokenize("baomoi.content.20140315.txt", "token.txt"); // Xác định các từ.
        tagger.tag("token.txt", "tag.txt"); // Phân loại các từ
        changer.change("tag.txt", "AnhHMD_20140317_NOUN.tsv");  // Chuyển đổi các từ theo yêu cầu, in ra file kết quả cuối cùng.
    }
}

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
