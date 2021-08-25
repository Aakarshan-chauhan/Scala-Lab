object Program4 {
    def main(args: Array[String]) = {
        println("Check if 723 is even or odd");

        // nested function 1 
        def evenOrOdd(a:Int)= {

            // nested function 2
            def even()={
                if (a % 2 == 0)
                    println("Even");
            }

            // nested function 2
            def odd()={
                if (a%2 != 0)
                    println("Odd");
            }
            even();
            odd();
        }

        evenOrOdd(723);
    }

    
}
