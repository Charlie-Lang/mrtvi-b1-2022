package Week3;

public class Day16B {
    public static void main(String[] args) {
        int[] numRandom = new int[6];
        int getNum=0;
        
        for (int i = 0; i < numRandom.length; i++) {
            getNum = (int) (Math.random()*48+1);
            for (int j : numRandom) { // to reroll if the number is in the list
                if (getNum == j) {
                    i--;
                }
            }
            numRandom[i] = getNum;
        }
        
        for (int i : numRandom) {
            System.out.print(i+ "|");
        }
    }
}
