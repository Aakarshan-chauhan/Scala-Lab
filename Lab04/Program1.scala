object Program1{
    def main(args:Array[String]) : Unit={
        println("Min and Max from 5, 7  " );
        maxAndMin(5,7);
    }

    def maxAndMin(a: Int, b : Int) = {

        // nested function 1
        def maxValue() : Int = {
            if (a > b){
                return a;
            }
            else 
                return b;
        }

        // nested function 1
        def minValue(): Int = {
            if (a < b){
                return a;
            }
            else 
                return b;
        }

        printf("Max : %d , Min : %d", maxValue(), minValue());
    }
}