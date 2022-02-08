import java.util.ArrayList;

public class Digits
{
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num)
    {
        int length = Integer.toString(num).length();
        double tens = Math.pow(10, length - 1);
        for(int i = 1; i <= length; i++)
        {
            Integer digit = new Integer((int) (num/tens));
            num -= (tens * digit.intValue());
            tens /= 10;
            digitList.add(digit);
        }
    }
    
    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size() - 1; i++)
        {
            if (digitList.get(i + 1) <= digitList.get(i))
            {
                return false;
            }
        }
        return true;
    }
}