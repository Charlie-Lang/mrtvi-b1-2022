package Week3;

public class Day14A {

    public static void main(String[] args) {
        String[][] nameList = {
            {"john", "malinaw", "Cruz"}
            ,{"edward","crisostomo  ","dimalamangan"}
            ,{" julio"," senorito","principio"}
            ,{"yvanna ","masinop"," dela  cruz"}
            ,{"andres","Lopez","Guiginto"}
            ,{"Pablo","Velasquez","marquez"}
        };
        String firstName = "";
        String midName = "";
        String lastName = "";
        
        for (String[] nameRow : nameList) {
            firstName = nameRow[0].trim().substring(0, 1).toUpperCase()
                + nameRow[0].trim().substring(1, nameRow[0].trim().length());
            midName = nameRow[1].trim().substring(0, 1).toUpperCase()
                + nameRow[1].trim().substring(1, nameRow[1].trim().length());
            lastName = nameRow[2].trim().substring(0, 1).toUpperCase()
                + nameRow[2].trim().substring(1, nameRow[2].trim().length());
            
            System.out.println(String.format("%-12s", firstName)
                    +"|"+String.format("%-12s", midName)
                    +"|"+String.format("%-12s", lastName));
//            System.out.println(firstName+" "+midName+" "+lastName);
        }
        
//        for(String[] getRow : nameList){
//            for(String getCol : getRow){
//                System.out.print(getCol.trim().substring(0,1).toUpperCase() 
//                        + getCol.substring(1, getCol.length()));
//            }
//            System.out.println("");
//        }
        
//        for (int i = 0; i < nameList.length; i++) {
//            System.out.println(nameList[i][0]+" "+nameList[i][1]+" "+nameList[i][2]);
//        }
        
    }
}
