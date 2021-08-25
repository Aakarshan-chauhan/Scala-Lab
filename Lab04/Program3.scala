object Program3 {
    def main(args: Array[String]) = {
        println("Check if 723 is even or odd");
        evenOrOdd(723);
    }

    def evenOrOdd(a:Int)= {

        // nested function 1
        def even()={
            if (a % 2 == 0)
                println("Even");
        }

        // nested function 1
        def odd()={
            if (a%2 != 0)
                println("Odd");
        }
        even();
        odd();
    }
}
