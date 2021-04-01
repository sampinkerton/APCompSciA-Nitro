public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        return word.substring(word.length()/2,word.length()) + word.substring(0,word.length()/2);
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
       return word.substring(0,insertIdx) + insertText + word.substring(insertIdx, word.length());
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        int insertHere = word.indexOf(insertChar.charAt(0));
        // Insert insertText after the first
        // occurence of the insertChar
        return word.substring(0,insertHere) + insertText + word.substring(insertHere,word.length());
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
    
    
}
