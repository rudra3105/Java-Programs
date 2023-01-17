class Main {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array(5);
        int[] data = {1, 3, 2, 4, 5};
        Array arr3 = new Array(data);
        
        // fill the arrays with some values
        for (int i = 0; i < arr1.size(); i++) {
            arr1.data[i] = i;
        }
        
        for (int i = 0; i < arr2.size(); i++) {
            arr2.data[i] = i + 1;
        }
        
        // display the arrays
        System.out.print("arr1: ");
        arr1.display();
        System.out.print("arr2: ");
        arr2.display();
        System.out.print("arr3: ");
        arr3.display();
        
        // reverse the arrays
        arr1.Reverse_an_array();
        arr2.Reverse_an_array();
        arr3.Reverse_an_array();
        
        // display the reversed arrays
        System.out.print("arr1 reversed: ");
        arr1.display();
        System.out.print("arr2 reversed: ");
        arr2.display();
        System.out.print("arr3 reversed: ");
        arr3.display();
        
        // find the maximum of each array
        System.out.println("Maximum of arr1: " + arr1.Maximum_of_array());
        System.out.println("Maximum of arr2: " + arr2.Maximum_of_array());
        System.out.println("Maximum of arr3: " + arr3.Maximum_of_array());
        
        // find the average of each array
        System.out.println("Average of arr1: " + arr1.Average_of_array());
        System.out.println("Average of arr2: " + arr2.Average_of_array());
        System.out.println("Average of arr3: " + arr3.Average_of_array());
        
        // sort the arrays
        arr1.Sorting();
        arr2.Sorting();
        arr3.Sorting();
        
        // display the sorted arrays
        System.out.print("arr1 sorted: ");
        arr1.display();
        System.out.print("arr2 sorted: ");
        arr2.display();
        System.out.print("arr3 sorted: ");
        arr3.display();
        
        // search for a value in each array
        System.out.println("Index of 2 in arr1: " + arr1.search(2));
        System.out.println("Index of 2 in arr2: " + arr2.search(2));
        System.out.println("Index of 2 in arr3: " + arr3.search(2));
    }
}