import java.util.Scanner

fun main(){
    var input = Scanner(System.`in`)
    var number = input.nextInt()
    var index = 0;
    var numberCompare = number
    while(true){
        var numberA = numberCompare / 10
        var numberB = numberCompare % 10
        var numberC = (numberA+numberB) % 10
        numberCompare = (numberB*10)+numberC
        index++
        if(number == numberCompare) break;
    }
    print(index)
}
//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
//
//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//
//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.


//처음에 배열로 처리하려다가 그만뒀다.. 왜 굳이 toString toInt를 쓰고 처리하려했는지 모르겠다..

// 26을 입력 받았을때 numberA는 처음 십의자리를 10으로 나누어 2를 나타내고
// numberB는 10의 자리를 나눈 나머지 6을 나타낸다
// numberC는 2와6를 더해서 10을 나눈 나머지값인데 10에 해당하지 않으므로 8출력
// numberCompare에 numberB 6를 10 곱해 60으로 만들고 numberC의 8를 더해 68를 만들었다.
// 이를 반복하여 사이클을 만든다



//var input = Scanner(System.`in`)
//var number = input.nextInt()
//
//var inputNumber = -1;
//var index = 0;
//
//if(number < 10){
//    number *= 10
//}
//println(number)
//while (number != inputNumber){
//    index++
//    var number2 = if (inputNumber == -1 && number.toString().length != 1) number.toString()
//    else if(number.toString().length == 1) (number*10).toString()
//    else if(inputNumber.toString().length == 1) "0"+inputNumber.toString()
//    else inputNumber.toString()
//
//    var number3 = (number2[0].toString().toInt() + number2[1].toString().toInt()).toString()
//    var inputNumberString: String = (number2[1].toString() + if (number3.length == 1) number3.toInt().toString() else number3[1].toString().toInt().toString())
//    inputNumber = inputNumberString.toInt()
//}