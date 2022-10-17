import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            String PATH_FILE ="C:\\Users\\askih\\OneDrive\\Desktop\\lam bai tap\\rikkei\\MD2_Bai16_BT2\\src\\countries.cvs";
            br = new BufferedReader(new FileReader(PATH_FILE));
            while ((line = br.readLine()) != null){
                printCountry(cvsLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<String> cvsLine(String cvsline){
        List<String> result = new ArrayList<>();
        if (cvsline != null){
            String[] splitData = cvsline.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }return result;
    }
    private static void printCountry(List<String> country){
        System.out.println(
                "Country [id= "
                        +country.get(0)
                        +country.get(1)
                        +country.get(2)
                        +"]");
    }
}