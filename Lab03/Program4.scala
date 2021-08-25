object Program4{

    def main(args: Array[String] ) : Unit={
        printf("Sum = %d" , addFn(10, 15));
    }
    def addFn(a: Int, b: Int) : Int = {
        var sum = a + b;
        return sum;
    }
}