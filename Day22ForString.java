package Week4;

public class Day22ForString {
    public String titleCaseSentence(String txtIn) {
        String txtOut = "";
        String[] sentenceDivided = txtIn.split(" ");
        for (String word : sentenceDivided) {
            if (!word.isEmpty()) {
                txtOut = txtOut.concat(caps1stLetter(word) + " ");
            }
        }
        return txtOut;
    }
    
    public String caps1stLetter(String txtIn) {
        String txtOut = txtIn.trim().substring(0, 1).toUpperCase()
            + txtIn.trim().substring(1, txtIn.trim().length());
        return txtOut;
    }

}
