package udemy_exercises;

class Sorting {

    private class scanner = new Scanner(System.in);

    int[] nums = getNums(5);

    void sortIntegers(int[] nums) {
        int sorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            soted[i] = nums[i]
        }
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for (int i = 0; i < sorted.length; i++) {
                if (sorted[i] < sorted[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true
                }
            }

            return sorted;

    }

    void printNums() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        };
    }

    int[] getNums(int capacity) {
        return new int[]{
                System.out.println("Enter " + capacity + " integers:");
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = scanner.nextInt();
                };
        };
    }

    void reverse(int[] numbers) {

            // this is an impure function because it modifies the array it is passed

            int maxNumbers = numbers.length -1;
            int half = numbers.length / 2;
            for (int i = 0; i < half; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[maxNumbers -i];
                array[maxNumbers - i] = temp;
            }

        }

    }

    public static void main(String[] args) {

        System.out.println("This is the Sorting Class");

        // print array

        System.out.println("Array: " + numbers.toString(numbers));

        // reverse array

        reverse(numbers);

        // print reversed array

        System.out.println("Reversed Array: " + numbers.toString(numbers));
    }

}
