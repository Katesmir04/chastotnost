package chast;


import javax.imageio.IIOException;
import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Numbers {


    void Start(String name) throws IOException {


            File file = new File(name);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);


            // считаем сначала первую строку
            String line = reader.readLine();
            try (FileWriter result = new FileWriter("Result.txt", false)) {
                while (line != null) {
                    //File myFile= new File("rezName.txt");
                    int len = line.length();
                    Map<Character, Integer> zip = new HashMap<Character, Integer>();
                    for (int j = 0; len > j; j++) {
                        int count = 0;
                        for (int i = 0; len > i; i++) {
                            if (line.charAt(j) == line.charAt(i)) {
                                count++;
                            }
                        }
                        zip.put(line.charAt(j), count);
                    }
                    StringBuffer myValue = new StringBuffer();
                    String myMapKeyValue = " ";

                    //try (FileWriter result = new FileWriter("Result.txt", false)) {
                    for (Map.Entry<Character, Integer> entry : zip.entrySet()) {

                        myMapKeyValue = Character.toString(entry.getKey()) + ":" +
                                Integer.toString(entry.getValue());
                        myValue.append(myMapKeyValue + " ");
                        result.write(Character.toString(entry.getKey()) + ":" + Integer.toString(entry.getValue()) + "   ");
                        //result.write(":");
                        //result.write(Integer.toString(entry.getValue()));
                        //result.write(System.lineSeparator());
                    }



                    System.out.println(myValue);
                    //System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("stdout.txt")), true));


                    //System.out.println(line);
                    // считываем остальные строки в цикле
                    line = reader.readLine();
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }



    }
}