public class ArrayRefr {
    public static void update(int marks[] , int nonchangeable){
         nonchangeable = 10 ; 
        for (int i = 0 ; i < marks.length ; i++ ){
            marks[i] = marks[i] + 1;
        }

    }
    public static void main(String[] args) {
        int marks[] = {45 , 46 , 50};
        int nonchangeable   = 5 ; 
        update(marks , nonchangeable);

        for (int i = 0 ; i<marks.length ; i++){
            System.out.println("upated marks =" + marks[i]);    
        }
        System.out.println(nonchangeable);
    }
    
}



// pass by refrence is tuple list array . --- it will change the main function

// all other is pass by value --- it do not change the main function

