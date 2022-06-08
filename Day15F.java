package Week3;

public class Day15F {
    public static void main(String[] args) {
        int[] numRandom = new int[5];
        int[][] numTally = {
            {1,0}
            ,{2,0}
            ,{3,0}
            ,{4,0}
            ,{5,0}
        }; // to count the numbers from from .random
        boolean youWin = false;
        
        while (!youWin) { // para ma test ng paulit ulit hanggang manalo
            numTally[0][1] = 0;
            numTally[1][1] = 0;
            numTally[2][1] = 0;
            numTally[3][1] = 0;
            numTally[4][1] = 0;
            System.out.print("|");
            for (int i = 0; i < numRandom.length; i++) {
                numRandom[i] = (int) (Math.random()*5+1);
                System.out.print(numRandom[i]+ "|");
            }
            System.out.println("");

            // to get the total recurring numbers in the rolls
            for (int rolls : numRandom) {
                for (int[] numT : numTally) {
                    if (numT[0] == rolls) {
                        numT[1]++;
                    }
                }
            }

            // tinitignan na kung meron bang numero na nanalo
            for (int[] is : numTally) {
    //            System.out.println(is[0]+"|"+is[1]);
                // mas madali yun gawin gamit ng switch statement
                switch (is[1]) {
                    case 5:
                        System.out.println("You win with all the numbers are: "+is[0]);
                        youWin = true;
                        break;
                    case 4:
                        System.out.println("You win with 4 of a kind: "+is[0]);
                        youWin = true;
                        break;
                    case 3:
                        System.out.println("You win with 3 of a kind: "+is[0]);
                        youWin = true;
                        break;
                }
            }
        }
    }
}
