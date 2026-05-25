class Recursions9{

    static void hanoi(int n, char Source, char Helper, char Destination){

    if(n == 1){
        System.out.println("Move disk 1 from " + Source + " to " + Destination);
        return;
    }

            // Step 1
            hanoi(n - 1, Source, Destination, Helper);

            // Step 2
            System.out.println("Move disk " + n + " from " + Source + " to " + Destination);

            // Step 3
            hanoi(n - 1, Helper, Source, Destination);
}
    public static void main(String[] args) {
        hanoi(5, 'A', 'B', 'C');
    }
}