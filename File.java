import java.io.*; 

public class File {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("file.txt")
            );
            bw.write("Hello World\n");
            bw.write("Welcome to File Handling in Java\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Reading the file
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("file.txt")
            );
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
