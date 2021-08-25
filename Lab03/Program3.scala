//keyword (import)
import java.io;

// keyword (object)
object Program3{

    // keyword (def)
    // keyword (:)
    def main(args: Array[String]) : Unit =
    {
        val x:String = "Keyword  (val)"; //keyword (=)
        var y:Int = 5; //keyword (var)
        var z:Boolean = true; //keyword (true)
        var a:Boolean = false; // keyword (false)
        if(y == 5){
            print("Keyword (if)");
        }
        else {
            print("Keyword (else)")
        }

        var integer : Int = new Integer(52); //keyword (new)
        printf("\nInteger = %d\n", integer);
        
        while (y >1){
            y -= 1;
        }

        return;
    }
}