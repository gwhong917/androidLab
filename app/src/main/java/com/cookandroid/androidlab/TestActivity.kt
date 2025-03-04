package com.cookandroid.androidlab

val data1 = 10 //const같이 재할당 불가능한..?
var data2 = 10
val data3: Int = 10
lateinit var data4: String  //이건 추후 초기화 할 것을 명시 함
// lateinit은 var에만 사용가능 // Int Long Short Double, Float, Boolean, Byte 불가.

//fun main() {
////    data1 = 20 // 오류!
////    data2 = 20 // 성공!
//
////    val data3: Int =10 // 이렇게 하면 밑에 값 할당이 안됨.. 재할당 안되는거지
////    val data3: Int// 근데 이렇게 선언만 해두고 초기화 안하면 밑에 할당할 때 에러 안남..
////    data3 = 10
//}

//fun hofFun(arg: (Int) -> Boolean): () -> String {
//    val result = if(arg(-5)) {
//        "valid"
//    } else {
//        "invalid"
//    }
//    return {"hoffun result : $result"}
//}
//fun main() {
//    val result = hofFun ({no -> no > 0})
//    println(result())
//}

//fun main() {
//    var data: String? = null
//    // 널 안전성을 개발자가 고려한 코드
//    val length = if (data == null) {
//        0
//    } else {
//        data.length
//    }
//    println("data length : $length")
//    // 코틀린이 제공하는 널 안전성 연산자를 이용한 코드
//    println("data length : ${data?.length ?: 0}") //null일 경우 0 반환
//}

//fun main() {
//    var data: String? = "kke"
//    println("data = $data : ${data?.length ?: -1}")
//    data = null
//    println("data = $data : ${data?.length ?: 1}")
//
//    fun some (no1: Int, no2: Int): Int {    // 일반 함수 선언
//        return no1 + no2
//    }
//    fun some (no1: Int): Int {    // 일반 함수 선언
//        return no1
//    }
//}

class User(name: String) {
    constructor(name: String, count: Int) : this(name) {
//        name="adfsadfs" //이거 안됨... name 앞에 val이 안붙어있어도 재할당은 안됨...!
        println("name : $name")
        println("count : $count")
//        println("email : $email")
    }
    constructor(name: String, count: Int, email: String) : this(name, count) {
        println("adafdfas")
        println("email : $email")
    }
}

//class User(val name: String) {// 이렇게 val을 넣어주면 이 클래스 하위 전체 영역에서 전부사용가능
//
//}

fun main() {
//    val user = User ("kke", 10,"a@a.com")// 이경우 위 보조생성자 전부 호출됨
//    val user = User ("kke", 10) //이 경우 매개변수가 2개인 첫번쨰 보조생성자만 호출됨.
    val user = User ("kke")
}

