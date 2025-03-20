public class IncrementDecrement {
    public static void main(String[] args) {
        int value = 1;
        value = value + 1;
        System.out.println("First Increment:" + value);
        value += 1;
        System.out.println("Second Increment:" + value);
        value++;
        System.out.println("Third Increment :" + value);
        value = value - 1;
        System.out.println("First Decrement:" + value);
        value -= 1;
        System.out.println("Second Decrement:" + value);
        value--;
        System.out.println("Third Decrement:" + value);

        //increment and Decrement order

        value =1;
        value ++;
        System.out.println("First:" + value);
        System.out.println("Second:" + value++);
        System.out.println("Third:" + value);
        System.out.println(" First:" + (++value));

        value =1;
        ++value;
        value ++ ;
        System.out.println("First:" + value);

        //My own example
        // Postfix increment
        int x = 1;
        int y = x++;
        System.out.println("x:" + x + " y:" + y); //value of x is 2 and y is 1 because x is incremented after assigning to y.        
      

    }
}