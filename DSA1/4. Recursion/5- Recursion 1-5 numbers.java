class Recusrions5{

    static void hello(int n){

        if(n==0){
            return;
        }

        hello(n-1);
        
        System.out.println(n);

        
    }

    public static void main(String[] args) {
        hello(5);
    }
    
}