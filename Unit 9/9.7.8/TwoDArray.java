public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){

        // Add your code here
        if(other.length != myArray.length || other[0].length != myArray[0].length)
            return false;
        for(int i = 0; i < myArray.length; i++)
            for(int j = 0; j < myArray[0].length; j++)
                if(myArray[i][j] != other[i][j])
                    return false;
        return true;
    }

}
