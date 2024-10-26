class FindLargest {
    public static void main(String[] args) {
        findLargest(5, 12, 9);
    }

    static void findLargest(int a, int b, int c) {
        int largest = a;

        if(b > largest) {
            largest = b;
        }

        if(c > largest) {
            largest = c;
        }

        System.out.println(largest);
    }
}