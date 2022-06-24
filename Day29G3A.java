package Week5;
import java.sql.*;
import java.util.Scanner;
// you will be updating a month
public class Day29G3A {
    
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        
        String month = uInput.nextLine();
        
        if (month.equalsIgnoreCase("January")) {
            
        }
    }
    
    String[] giveMonthFieldName(String monthTransact) {
        String[] fieldName = new String[2];
        switch (monthTransact.toUpperCase()) {
            case "JAN":
                fieldName[0] = "JanDb";
                fieldName[1] = "JanCr";
                break;
            case "FEB":
                fieldName[0] = "FebDb";
                fieldName[1] = "FebCr";
                break;
        }
        return fieldName;
    }
}
