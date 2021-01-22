
fun main() {
    val a: String? = null
    val b: String = "night flyer"

    var c: String

    //c = a //Type MisMatching
    c= b
    println(c)
}

/*
<코틀린 nullable type>

컴파일 시점에 널 여부를 체크해서 예외 가능성을 줄이는 것!

사용은 단순하다 타입 뒤에 ? 를 붙이면 널을 참조할 수 있다.
String 과 String? 타입은 다른 타입이다!!
*/