object Program5{
    def main (args : Array[String]) = {
        
        def add(a:Int, b:Int) = a + b;
        def val0(a:Int) = a==0;
        def addmul(a: Int, b: Int) = add(a, b) * a * b;
        
        printf("Adding numbers : %d\n", add(5, 10));
        printf("Checking for 0 : %s\n", val0(0));
        printf("Adding and multiplying : %d\n", addmul(5, 10));
    }
}