package mattroseb1d18;
// ***PARENT CLASS***
// Day18B file will be the used in Day18C and Day18C file
class Day18B {
    public static String txt1 = "Contents";
    
    //ito ang tools na gagamitin ni child
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
    //ginamit yung pang capital sa baba para lahat ng word sa isang sentence pwede
    
    //Para kay parent lang ito
    private String caps1stLetter(String txtIn) {
        String txtOut = txtIn.trim().substring(0, 1).toUpperCase()
            + txtIn.trim().substring(1, txtIn.trim().length());
        return txtOut;
    }
    //pang capital ng 1st letter ng isang word
}
