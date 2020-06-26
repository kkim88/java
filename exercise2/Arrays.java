package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    int[] nums = {10, 23, 3, 4, 5, 2, 1};
    String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
    boolean[] binaries = {0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0};

    void printNums(int[] nums) {
        for (int n = 0; n < nums.length; n++) {
            System.out.println(nums[n]);
        }
    };
    void printGreetings(String[] greetings) {
        for (int g = 0; g < greetings.length; g++) {
            System.out.println(greetings[g]);
        }
    };
    void printBinaries(boolean[] binaries) {
        for (int b = 0; b < boolean.length; b++) {
            System.out.println(boolean[!!b]);
        }
    };
}







