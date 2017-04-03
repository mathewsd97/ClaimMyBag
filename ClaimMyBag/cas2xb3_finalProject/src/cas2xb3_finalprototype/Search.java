package cas2xb3_finalprototype;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
/**
 * This class should not be instantiated.
 */
private Search() { }

/**
 * Returns the index of the specified key in the specified array.
 *
 */
public static int indexOf(ArrayList<LuggageT> a, Comparable key) {
    int lo = 0;
    int hi = a.size() - 1;
    while (lo <= hi) {
        // Key is in a[lo..hi] or not present.
        int mid = lo + (hi - lo) / 2;
        if      (key.compareTo(a.get(mid).getClaimNumber()) < 0) hi = mid - 1;
        else if (key.compareTo(a.get(mid).getClaimNumber()) > 0) lo = mid + 1;
        else return mid;
    }
    return -1;
}

/**
 * Returns the index of the specified key in the specified array.
 *
 */
@Deprecated
public static int rank(Comparable key, ArrayList<LuggageT> a) {
    return indexOf(a, key);
}


}

