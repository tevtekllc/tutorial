/*
 * During a recent tutoring session of AP Computer Science A
 * One of the assignments tasked the student with merging two sorted arrays
 * The following is one example of how to implement the merge.
 * The merge class will also sort the new merged array.
 */
package staticsort;

/**
 *
 * @author steveg
 */
public class StaticSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] FA = new int[] {5,10,11,12};
        int[] FB = new int[] {1,2,3,7,13,26};
        int[] FC;
        
        FC = merge(FA,FB);
        
        for (int i =0; i <FC.length; i++) {
            System.out.println(FC[i]);
        }
        
    }
public static int[] merge(int[] a, int[] b) {

    int[] merged_array = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length)
    {
        if (a[i] < b[j])       
            merged_array[k++] = a[i++];

        else        
            merged_array[k++] = b[j++];               
    }

    while (i < a.length)  
        merged_array[k++] = a[i++];


    while (j < b.length)    
        merged_array[k++] = b[j++];

    return merged_array;
}
}
