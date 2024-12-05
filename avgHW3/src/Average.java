public class Average {

    /* PART A: Brief Functional Description
     * The average method computes the average of a subarray of integers 
     * from an array list. The subarray includes elements starting from 
     * index k to the end of the array. If the subarray has elements (n > 0), 
     * it calculates the average using integer division; otherwise, 
     * the method returns 0.
     */

    public int calcAverage(int k, int[] list){
        int average = 0;
        int n = Math.min(k, list.length);

        /*Part F: Fixed OUT OF BOUNDS ERROR */
        if (k >= list.length) {  
            return 0;
        }

        /* Part C:  Partitions and Test Cases*/
        // Partition (1): if (n > 0) { ... } //Changing the bounds
        // Test Case (1): k = 0; //This becomes a valid range
        // Partition (2): if (n = 0) { ... } //Changing the bounds
        // Test Case (2): k = 1; //K exceeds the range
        if(n > 0){
            for(int i = 0; i < n; i++){
                average += list[i];
            }
            average = average/n;
        }
        return average;
    }

    public static void main(String[] args) {
        Average avg = new Average();

        /* Part B: Generate Functional Test Cases */
        int[] list1 = {1,3,5,7,9};
        int[] list2 = {2,4,6,8,10};
        int[] list3 = {12,45,56,89,20};

        int result1 = avg.calcAverage(4, list1);
        System.out.println("Average List 1: " + result1);
        int result2 = avg.calcAverage(3, list2);
        System.out.println("Average List 2: " + result2);
        int result3 = avg.calcAverage(5, list3);
        System.out.println("Average List 3: " + result3);

        /* Part D: Generate Boundary Value Test Cases */
        int[] list4 = {10,20,30};
        int result4 = avg.calcAverage(0, list4);
        System.out.println("Average List 4: " + result4);        
        
        int[] list5 = {5,15,25};
        int result5 = avg.calcAverage(0, list5);
        System.out.println("Average List 5: " + result5);        

    }
}