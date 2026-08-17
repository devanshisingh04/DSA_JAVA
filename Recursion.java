/*Print name 5 time 
class Recursion {
    static void PrintName(String name, int n, int m ){
        if(n>m){
            return;
        }
        System.out.println("Runjhun");
        PrintName(name,n+1,m);
    }    
    
    
    public static void main(String[]args){
        PrintName("Runjhun", 1, 5);
    }
}*/

 .
/*print linear 1 to n 
class Recursion{
    static void linear(int n, int m){
        if(n>m){
            return;
        }
        System.out.println(n);
        linear(n+1,m);
    }
    public static void main(String[] args) {
        linear(1,5);
    }
}*/

/*Print linearly n to 1
class Recursion{
    static void ReverseCount( int m){
        if(m==0){
            return;
        }
        System.out.println(m);
        ReverseCount(m-1);
    }
    public static void main(String[]args){
        ReverseCount(10);
    }
}*/



/*Print linearly using BackTracking 
class Recursion{
    static void Back_Track(int n , int m){
        if(n < 1){
            return;
        }
        Back_Track(n-1, m);
        System.out.println(n);
    }
    public static void main(String[]args){
        Back_Track(10,10);
    }
}*/

/*print linearly n to 1 
class Recursion{
    static void Back_Track(int n){
        if(n>10){
            return;
        }
        Back_Track(n+1);
        System.out.println(n);
        
    }
    public static void main(String[]args){
        Back_Track(1);
    }
}*/

//Reverse an array using Recursion
class Recursion{
    static void Reverse(int[] arr,int i, int j ) {
        if(i>=j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        Reverse(arr, i+1, j-1 );
       // System.out.print();
    }
    public static void main(String[]args){
        int[] arr = {3,7,2,9,3};
        Reverse(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
