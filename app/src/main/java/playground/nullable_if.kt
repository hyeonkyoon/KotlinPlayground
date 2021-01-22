
fun main() {
    var a: String? = "night"
    val b: String = "night flyer"
    val c: String? = null

    printAllCaps(a)
    printAllCaps(b)
    printAllCaps(c)
}

fun printAllCaps(s: String?) {
    val allCaps = s?.toUpperCase()

    println(allCaps)
}

/*
<코틀린 nullable type>

사용은 ?. 으로 하면 된다.
널인 경우 ?. 뒤는 실행되지 않고 null 을 반환한다.
null 인 경우의 처리를 추가하고 싶은 경우 엘비스 연산자를 사용한다. ?:
*/