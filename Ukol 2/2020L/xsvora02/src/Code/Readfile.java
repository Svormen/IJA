package Code;

import Code.Goods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class Readfile for readinf from text file
 * @author Jozef Čásar
 * @author Slavomír Svorada
 */
public class Readfile {
    Goods obj = new Goods();
    public Goods read(){
        /** Getting the entire contents from file */
        try {
            File file = new File("data/tovar.txt");
            Scanner reader = new Scanner(file, "UTF-8");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                write(data);
            }
            reader.close();
        }
        /** File is not found */
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return obj;
    }

    /** Function for dividing goods from the number of pieces
     *
     * @param data the data read from file to be written
     */
    public void write(String data) {
        String[] arrOfStr = data.split(":");
        obj.putGoods(arrOfStr[0], Integer.parseInt(arrOfStr[1]));
    }
}
