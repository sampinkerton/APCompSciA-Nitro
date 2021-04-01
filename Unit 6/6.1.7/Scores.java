public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        int[] scores = {80, 95, 82, 67, 100};
        int i = 0;
        while(i < scores.length)
        {
            System.out.println(scores[i]);
            i++;
        }
        
        scores[2] = 72;
        scores[4] = 95;
        System.out.println();
        i = 0;
        while(i < scores.length)
        {
            System.out.println(scores[i]);
            i++;
        }
    }
}
