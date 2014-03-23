<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author N56V
 */
public class Changer {
    private String[] words = new String[31];
    private long[] amount = new long[31];
    
    public void change(String pathRead, String pathWrite){
        try {
            FileInputStream fos1;
            fos1 = new FileInputStream(pathRead);
            Reader input = new java.io.InputStreamReader(fos1, "UTF8");
            BufferedReader inputbuf = new BufferedReader(input);
            String lineRead;
            
            String lineWrite;
            
            int length, index;
            String[] temp;
            BST tree = new BST();
            long find;
            
            // Tải từng dòng từ file "token.txt"
            while ((lineRead = inputbuf.readLine()) != null){
            for (String retval: lineRead.split(" ")){
                length = retval.length();
                length -= 1;
                // Phát hiện danh từ
                if ((retval.charAt(length) == 'N')
                        ||(retval.charAt(length) == 'p')
                        ||(retval.charAt(length) == 'c')
                        ||(retval.charAt(length) == 'y')
                        ||(retval.charAt(length) == 'u')){
                    temp = retval.split("/");
                    lineWrite = temp[0];
                    lineWrite = lineWrite.toLowerCase();    // Chuyển thành chữ thường
<<<<<<< HEAD
                    lineWrite = lineWrite.replace("_", " "); // Loại bỏ "_"
=======
                    lineWrite = lineWrite.replaceAll("_", " "); // Loại bỏ "_"
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
                    tree.insert(lineWrite);  // Đưa vào BST
                    find = tree.find(lineWrite);    // Số lượng các nút giống thế trong BST
                    // Danh từ đang trong số các danh từ nhiều nhất thì chỉ thay đổi số lượng
                    // Nếu không se thay 1 từ ít nhất ra và nạp từ nhiều hơn vào
                    if (checkWord(lineWrite, find) == false)
			{
				index = minAmount();
				if (find > amount[index])
				{
					amount[index] = find;
					words[index] = lineWrite;
				}
			}
                }
            }
        }
            input.close();
            sort();
            changeWords(pathWrite);
            } catch (Exception e) {
            System.out.println("Khong doc duoc file1");
            e.printStackTrace();
        }
    }
    
    // Kiểm tra danh từ có trong dãy nhiều nhất không?
    private boolean checkWord(String x, long find){
	int i = 0;
	while (words[i] != null)
	{
		if (words[i].equals(x))
		{
			amount[i] = find;
			return true;
		}
		i++;
	}
		return false;
    }

    // Tìm danh từ có số lượng ít nhất trong top 30
    private int minAmount(){
	int i, index;
	long min;
		
	min = amount[0]; index = 0;
	for (i = 1; i < 30; i++)
		if (amount[i] < min)
		{
			min = amount[i];
			index = i;
		}
		
	return index;
    }
    
    // Sắp xếp 30 danh từ nhiều nhất
    private void sort(){
	int i, j;
	long temp;
	String tempStr;
		
	for (i = 0; i < 29; i++)
                      for (j = i+1; j < 30; j++)
			if (amount[i] < amount[j])
			{
				temp = amount[i]; 
                                amount[i] = amount[j]; 
                                amount[j] = temp;
                                tempStr = words[i]; 
                                words[i] = words[j]; 
                                words[j] = tempStr;
			}
    }
    
    // Chuyển danh từ đúng định dạng yêu cầu và in ra file "AnhHMD_20140317_NOUN.tsv"
    private void changeWords(String pathWrite){
        FileOutputStream fos2;
        int i, j, lenght;
        char letter;
<<<<<<< HEAD
        StringBuilder temp;
=======
        String temp;
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
        try {
            fos2 = new FileOutputStream(pathWrite);
            Writer output = new java.io.OutputStreamWriter(fos2,"UTF8");
            String lineWrite;
            for (i=0; i<30; i++){
                output.write(words[i] + "\t");
                lenght = words[i].length();
<<<<<<< HEAD
                temp = new StringBuilder(words[i]);
                for (j=0; (j<lenght); j=j+2){
                    letter = temp.charAt(j);
                    letter = Character.toUpperCase(letter);
                    temp.setCharAt(j, letter);
=======
                temp = new String(words[i]);
                for (j=0; j<lenght; j=j+2){
                    letter = temp.charAt(j);
                    letter = Character.toUpperCase(letter);
                    temp = temp.replace(temp.charAt(j), letter);
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
                }
                output.write(temp + "\t" + amount[i] + "\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Khong doc duoc file");
<<<<<<< HEAD
            e.printStackTrace();
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
        }
    }
}
