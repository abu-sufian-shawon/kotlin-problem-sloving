import java.util.Scanner

fun main(){
    val scn = Scanner(System.`in`)

    var testCase = 0
    var num1 = 0
    var num2 = 0

    // input test case
    if(scn.hasNext()) testCase = scn.nextInt()

    while(testCase > 0){
        if(scn.hasNext()) num1 = scn.nextInt()
        if(scn.hasNext()) num2 = scn.nextInt()

        val sum = num1 + num2
        println(sum)

        testCase--          // decrement test case
    }

}