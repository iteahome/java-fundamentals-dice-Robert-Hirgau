import java.lang.reflect.Array;

public class RollDice {

    public static void main(String[] args) {
        //Array
        int[] a = {6, 3, 5, 2};
        theDice(a);
    }
     //what print
    public static void theDice(int[] theArray) {
        if (!isValid(theArray))
            System.out.println("-1");
        else System.out.println(findNumber(theArray));
    }
        //findNumber
    public static int findNumber(int[] theArray) {
        int theNumber = 0;
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] != 6)
                theNumber++;
        }
        return theNumber;
    }

    //function to check if the array is valid
    public static boolean isValid(int[] theArray) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] < 1 || theArray[i] > 6)
                return false;
        }
        if (theArray[theArray.length - 1] == 6)
            return false;
        return true;
    }
}


