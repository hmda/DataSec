package io;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author N56V
 */
public class InOu {

    /**
     * @param args the command line arguments
     */
        
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
