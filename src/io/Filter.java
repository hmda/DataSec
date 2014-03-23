<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

<<<<<<< HEAD
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
import com.google.gson.Gson;

=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
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
<<<<<<< HEAD
<<<<<<< HEAD
            String lineRead;
            String[] temp;
            Article art = new Article();
            Gson gson = new Gson();
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
            char lineRead;
            int character, status, distance;
            status = 0;
            distance = 0;
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
            
            FileOutputStream fos2 = new FileOutputStream(pathWrite);
            Writer output = new java.io.OutputStreamWriter(fos2,"UTF8");
            
<<<<<<< HEAD
<<<<<<< HEAD
            while ((lineRead = inputbuf.readLine()) != null){
                 temp = lineRead.split("\t");
                 lineRead = temp[3];
                 art = gson.fromJson(lineRead, Article.class);
                 output.write(art.getContent().replace("\n", " ") + "\n");
            }
            
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
            character = inputbuf.read();
            while (character != -1){
                //System.out.println("OK");
                lineRead = (char)character;
                // Phát hiện "content"
                if ((lineRead == '\"') && (status == 0)) status = 1;
                else if ((lineRead == 'c') && (status == 1)) status = 2;
                else if ((lineRead == 'o') && (status == 2)) status = 3;
                else if ((lineRead == 'n') && (status == 3)) status = 4;
                else if ((lineRead == 't') && (status == 4)) status = 5;
                else if ((lineRead == 'e') && (status == 5)) status = 6;
                else if ((lineRead == 'n') && (status == 6)) status = 7;
                else if ((lineRead == 't') && (status == 7)) status = 8;
                else if ((lineRead == '\"') && (status == 8)) {
                    status = 9;
                    character = inputbuf.read();
                    character = inputbuf.read();
                    character = inputbuf.read();
                } else status = 0;
                // Khi đã phát hiện được thì ngay lập tức in ra file "baomoi.content.20140315.txt"
                if (status == 9){
                while (status == 9){
                    lineRead = (char)character;
                    // Phát hiện sự kết thúc của thẻ "content"
                    
                    // Kiểm tra xem có phải là cách viết dành cho các ký tự đặc biệt không?
                    if (lineRead == '\\') {
                        distance = 1;
                    }
                    // Phát hiện " -> kết thúc thẻ "content"
                    if ((lineRead == '\"')&&(distance == 0)) {
                        status = 0;
                        //System.out.println();
                        output.write("\n");
                        break;
                    } else distance = 0;
                    //System.out.print(lineRead);
                    output.write(lineRead);
                    character = inputbuf.read();
                }
                }
                character = inputbuf.read();
                distance = 0;
            }
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
            input.close();
            output.close();

        } catch (Exception e) {
            System.out.println("Khong doc duoc file");
<<<<<<< HEAD
<<<<<<< HEAD
            e.printStackTrace();
        }
    }
}

=======
        }
    }
}
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
        }
    }
}
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
