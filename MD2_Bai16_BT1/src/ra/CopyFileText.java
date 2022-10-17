package ra;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) throws Exception {
        String source = "C:\\Users\\askih\\OneDrive\\Desktop\\lam bai tap\\rikkei\\MD2_Bai16_BT1\\src\\ra\\source.txt";
        String dest = "C:\\Users\\askih\\OneDrive\\Desktop\\lam bai tap\\rikkei\\MD2_Bai16_BT1\\src\\ra\\dest.txt";
        copyFileText(source,dest);


    }
    private static void copyFileText(String source, String dest){
        Scanner sc = new Scanner(System.in);
        File sourceFile = new File(source);
        File destFile = new File(dest);
        if (!sourceFile.exists()){
            System.out.println("Tep khong ton tai ");
            return;
        }
        boolean next = true ;
        if (destFile.exists()){
            next = false;;
            System.out.println("Tep da ton tai ban muon ghi de khong ");
            System.out.println("1. yes ");
            System.out.println("2. no ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Tap tin se bi ghi de");
                    next = true ;
                    break;
                case  2 :
                    System.out.println("Tap tin se khong ghi de ");
                    break;
                default:
                    System.out.println("su lua chon cua ban ");
            }
        }
        if (next){
            try(
                    BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));
            ){
                String line;
                while ((line= reader.readLine()) != null){
                    writer.write(line);
                }
            }
            catch (IOException e){
                System.out.println("Error");
            }
            System.out.println("da copy thanh cong ");
        }
        System.out.println("Exit");
    }
}
