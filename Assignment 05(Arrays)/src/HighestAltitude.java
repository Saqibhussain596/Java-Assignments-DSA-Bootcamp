
// There is a biker going on a road trip.
// The road trip consists of n + 1 points at different altitudes.
// The biker starts his trip on point 0 with altitude equal 0.
//You are given an integer array gain of length n where gain[i] is the net gain in
// altitude between points i and i + 1 for all (0 <= i < n).
// Return the highest altitude of a point.


public class HighestAltitude {
    static int largestAltitude(int[] gain) {
        int currSum = 0;
        int maxAltitude = 0;
        for (int count = 0; count < gain.length; count++)
        {
            currSum += gain[count];
            if (maxAltitude < currSum)
            {
                maxAltitude = currSum;
            }
        }
        return maxAltitude;
    }
    public static void main(String[] args)
        {
            int[] gain = {-5, 1, 5, 0, -7};
            System.out.println(largestAltitude(gain));
        }
}
