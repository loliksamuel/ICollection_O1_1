/**
 * Created by lolik on 2017-03-31.
 */
/* Java program to design a data structure that support folloiwng operations
   in Theta(n) time
   a) Add
   b) Delete
   c) contains
   d) getRandom */
import java.util.*;

// class to represent the required O(1) data structure
public class Collection_O1 implements Collection_Interface
{
    ArrayList<Integer> arr;   // A resizable array

    // keys =array elements , vlaues = indexes in arr[]
    HashMap<Integer, Integer>  hash;

    // Constructor (creates arr[] and hash)
    public Collection_O1()
    {
        arr = new ArrayList<Integer>();
        hash = new HashMap<Integer, Integer>();
    }

    // A Theta(1) function to add an element to MyDS
    // data structure
    public void add(int value)
    {
        // If ekement is already present, then noting to do
        if (hash.get(value) != null)
            return;

        // Else put element at the end of arr[]
        int s = arr.size();
        arr.add(value);

        // And put in hash also
        hash.put(value, s);
    }

    // A Theta(1) function to remove an element from MyDS
    // data structure
    public void remove(int value)
    {
        // Check if element is present
        Integer index = hash.get(value);
        if (index == null)
            return;

        // If present, then remove element from hash
        hash.remove(value);

        // Swap element with last element so that remove from
        // arr[] can be done in O(1) time
        int size = arr.size();
        Integer last = arr.get(size-1);
        Collections.swap(arr, index,  size-1);

        // Remove last element (This is O(1))
        arr.remove(size-1);

        // Update hash table for new index of last element
        hash.put(last, index);
    }

    // Returns a random element from MyDS
    public int getRandom(int randomIndex)
    {
        // Find a random index from 0 to size - 1


        // Return element at randomly picked index
        return arr.get(randomIndex);
    }

    // Returns index of element if element is present, otherwise null
    public Integer contains(int x)
    {
        return hash.get(x);
    }
}




