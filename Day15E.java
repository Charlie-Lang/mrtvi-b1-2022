package Week3;

public class Day15E {
    public static void main(String[] args) {
        int[] numRandom = new int[5];
        boolean youWin = false;
        
        while (!youWin) { // para ma test ng paulit ulit hanggang manalo
           
            System.out.print("|");
            for (int i = 0; i < numRandom.length; i++) {
                numRandom[i] = (int) (Math.random()*5+1);
                System.out.print(numRandom[i]+ "|");
            }
            System.out.println("");

            // all slots are the same
            int numAllRef = 0;
            numAllRef = numRandom[0];
            if (numRandom[0] == numRandom[1] 
                && numRandom[1] == numRandom[2] 
                && numRandom[2] == numRandom[3] 
                && numRandom[3] == numRandom[4]) {
                youWin = true;
            }

            if (youWin) {
                System.out.println("You win!!!");
            }
        
        }
    }
}
