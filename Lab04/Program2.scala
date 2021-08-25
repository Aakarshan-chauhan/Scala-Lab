object Program2 {

    def main(args:Array[String]) : Unit={
        println("Min and Max from 20, 15  " );
        
        // nested function 1
        def maxAndMin(a:Int , b:Int) = {

            // nested function 2
            def maxValue() : Int = {
                if (a > b){
                    return a;
                }
                else 
                    return b;
            }

            // nested function 2
            def minValue(): Int = {
                if (a < b){
                    return a;
                }
                else 
                    return b;
            }

            printf("Max : %d , Min : %d", maxValue(), minValue());
        }
        maxAndMin(20, 15);
    }

    

}
