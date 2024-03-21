//TURGAY ÖZDEMİR

@file:JvmName("FooBar") //Sayfa 29
package com.turgayozdemir.patikaodev //SAYFA 8

import kotlin.text.* //SAYFA 8
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.turgayozdemir.patikaodev.databinding.ActivityMainBinding
import org.junit.Test
import org.junit.Assert.*
import java.math.BigDecimal
import java.nio.file.Files
import java.nio.file.Paths


//-----SAYFA 12
open class Shape

class Rectangle(val height: Double, val length: Double) : Shape() {
    val perimeter = (height + length) * 2
}


//-----SAYFA 13
open class Color{
    var colorName: String = "Red"
}
class Square(val edge: Double) : Color() {
    val perimeter = edge * 4
}


//-----SAYFA 25

class MyTestCase {
    @Test fun `ensure_everything_works`() {}
    @Test fun ensureEverythingWorks_onAndroid() {}
}
@Test
fun addition_isCorrect() {
    assertEquals(5, 7 + 9)
}
@Test
fun stringConcatenation_isCorrect() {
    val str1 = "Hello, "
    val str2 = "World!"
    assertEquals("Hello, World!", str1 + str2)
}


//-----SAYFA 37
data class User(
    val id: Long,
    val username: String,
    val email: String
)


//-----SAYFA 47
object MySingleton {
    init {
        println("Sayfa 47 = Singleton sınıfı başlatıldı.")
    }
    fun doSomething() {
        println("Sayfa 47 = Singleton sınıfından bir işlem yapılıyor.")
    }
}


//-----SAYFA 48
abstract class Vehicle {
    abstract fun makeSound()
}
class Car : Vehicle() {
    override fun makeSound() {
        println("Sayfa 48 = Vın Vın!")
    }
}


//-----SAYFA 61
class StickMan {
    fun up(){
        println("Sayfa 61 = Up")
    }
    fun down(){
        println("Sayfa 61 = Down")
    }
    fun turn(degrees: Double){
        println("Sayfa 61 = Turn $degrees degree")
    }
    fun forward(pixels: Double){
        println("Sayfa 61 = Forward $pixels pixel")
    }
}


//-----SAYFA 74
class Customer

class Person(val id:Int, var email: String)


//-----SAYFA 75
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

//-----SAYFA 76
open class Phone {
    open fun callSomenone(){
        println("Sayfa 76 = Calling!")
    }
}
class Apple : Phone(){
    override fun callSomenone(){
        println("Sayfa 76 = Ringing!")
    }
}


//-----SAYFA 78
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("Sayfa 78 = $name, the lion from $origin says: groah!")
    }
}
class Asiatic(name: String) : Lion(name = name, origin = "India")


//-----SAYFA 79
open class Hayvan(val isim: String, val yas: Int) {
    open fun bilgileriGoster() {
        println("Sayfa 79 = $isim isimli hayvan, $yas yaşında.")
    }
}

class Kedi(isim: String, yas: Int, val tur: String) : Hayvan(isim, yas) {
    override fun bilgileriGoster() {
        println("Sayfa 79 = $isim isimli kedi, $yas yaşında ve türü $tur.")
    }

    // Alt sınıfa özgü bir metod
    fun miyavla() {
        println("Sayfa 79 = $isim miyavladi!")
    }
}


//-----SAYFA 91
data class Kitap(val ad: String, val yazar: String, val yayinYili: Int)


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var z = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //-----SAYFA 9
        print("Sayfa 9 = ")
        print("Hello ")
        println("world!")
        println("Sayfa 9 = Hello world!")
        println("Sayfa 9 = " + 7)


        //-----SAYFA 10
        println("Sayfa 10 = " + sum1(3,5))
        println("Sayfa 10 = " + sum2(4,3))
        printSum(2,8)


        //-----SAYFA 11
        val a : Int = 1
        val b = 2
        val c : Int
        c = 3
        var u = 5
        u += 1
        val PI = 3.14
        incrementZ()
        println("Sayfa 11 = " + z)


        //-----SAYFA 12
        val rectangle = Rectangle(7.0, 4.0)
        println("Sayfa 12 = The perimeter is ${rectangle.perimeter}")


        //-----SAYFA 13
        val square = Square(5.0)
        println("Sayfa 13 = The perimeter is ${square.perimeter} and color is ${square.colorName}")


        //-----SAYFA 14
        var d = 1
        val s1 = "d is $d"
        println("Sayfa 14 = $s1")
        d = 2
        val s2 = "${s1.replace("is", "was")}, but mow is $d"
        println("Sayfa 14 = $s2")


        //-----SAYFA 15
        println("Sayfa 15 = ${maxOf(3, 9)}")
        println("Sayfa 15 = ${maxOfShort(11, 9)}")


        //-----SAYFA 16
        val items = listOf("Red", "Blue", "Green")
        for (item in items){
            println("Sayfa 15 = $item")
        }
        for (index in items.indices){
            println("Sayfa 15 = ${items[index]}")
        }


        //-----SAYFA 17
        var index = 0
        while (index < items.size){
            println("Sayfa 17 = ${items[index]}")
            index++
        }


        //-----SAYFA 18
        println("Sayfa 18 = ${describe("Hello")}")


        //-----SAYFA 19
        val x = 10
        val y = 9
        if (x in 1..y+1) {
            println("Sayfa 19 = fits in range")
        }
        val list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            println("Sayfa 19 = -1 is out of range")
        }
        if (list.size !in list.indices) {
            println("Sayfa 19 = list size is out of valid list indices range, too")
        }
        for (x in 1..5) {
            println("Sayfa 19 = " + x)
        }
        for (x in 1..10 step 2) {
            println("Sayfa 19 = " + x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            println("Sayfa 19 = " + x)
        }


        //-----SAYFA 20
        val fruits = listOf("banana", "apple", "kiwi", "avacado")
        fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach{ println("Sayfa 20 = " + it) }


        //-----SAYFA 21
        var str: String? = "abc"
        if (str == null){
            println("Sayfa 21 = x is null")
        }
        else{
            println("Sayfa 21 = x is not null")
        }


        //-----SAYFA 22
        val obj = "Turgay"
        if (obj is String){
            println("Sayfa 22 = ${obj.length}")
        }
        if (obj is String && obj.length > 0){
            println("Sayfa 22 = ${obj.length}")
        }
        if (obj !is String) return null!!


        //-----SAYFA 23
        /* PatikaOdev.kt */


        //-----SAYFA 24
        /*
        * open class Shape
        * fun SumNumber(){}
        * */


        //-----SAYFA 26
        val MAX_COUNT = 5
        val USER_NAME_FIELD ="UserName"
        println("Sayfa 26 = MAX_COUNT is ${MAX_COUNT} USER_NAME_FIELD is ${USER_NAME_FIELD}")
        val mutableCollection : MutableSet<String> = HashSet()
        val SquareShape : Square

        //-----SAYFA 27
        /*
        public / protected / private / internal
        expect / actual
        final / open / abstract / sealed / const
        external
        override
        lateinit
        tailrec
        vararg
        suspend
        inner
        enum / annotation / fun // as a modifier in `fun interface`
        companion
        inline / value
        infix
        operator
        data
        */


        //-----SAYFA 28
        /*
        @Named("Foo")
         val foo: Foo

        @Target(AnnotationTarget.PROPERTY)
        annotation class Shape

        @JsonExclude @JvmField
        var k: String

        @Test fun foo() {}
        */


        //-----SAYFA 30
        println("Sayfa 30 = " + longMethodName(3,5))


        //-----SAYFA 31
        println("Sayfa 31 = ${foo()}")


        //-----SAYFA 32
        foo()


        //-----SAYFA 33
        /*
        val isEmpty: Boolean get() = size == 0
        val zoo: String
            get(){ return "sas"}
        */


        //-----SAYFA 34/35
        if (true &&
            false
            ){

        }
        if (true){
            /**/
        } else{
            /**/
        }
        try {
            /**/
        }finally {
            /**/
        }


        //-----SAYFA 37
        var user = User(1,"Turgi", "aa@aa.com")
        println("Sayfa 37 = ${user.username}")


        //-----SAYFA 38
        greet()


        //-----SAYFA 39
        var nums = listOf(-1,-5,5,6,7,-9)
        val positives = nums.filter { x -> x > 0 }
        positives.forEach{ println("Sayfa 39 = $it") }
        val negatives = nums.filter { it < 0 }
        negatives.forEach{ println("Sayfa 39 = $it") }


        //-----SAYFA 40
        var emails = listOf("jhon@example.com", "aaa@csd.com", "ref@fgh.com")
        if ("jhon@example.com" in emails){
            println("Sayfa 40 = jhon@example.com is included")
        }
        if ("ttt@ggg.com" !in emails){
            println("Sayfa 40 = ttt@ggg.com is not included")
        }


        //-----SAYFA 41
        when(square){
            is Square -> println("Sayfa 41 = Square")
            is Color -> println("Sayfa 41 = Color")
        }

        //-----SAYFA 42
        val letters = listOf("a", "b", "c")
        letters.forEach{ println("Sayfa 42 = $it") }


        //-----SAYFA 43
        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
        println("Sayfa 43 = " + map.get("a"))


        //-----SAYFA 44
        for ((k, v) in map){
            println("Sayfa 44 = $k -> $v")
        }


        //-----SAYFA 45
        val myLazyValue : String by lazy {
            println("Sayfa 45 = Lazy Property")
            "Merhaba Lazy"
        }
        var qq = myLazyValue


        //-----SAYFA 46
        println("Sayfa 46 = ${"Patika".toUppercaseExtension()}")


        //-----SAYFA 47
        MySingleton.doSomething()


        //-----SAYFA 48
        val car = Car()
        car.makeSound()


        //-----SAYFA 49
        val files : String? = null
        println("Sayfa 49 = " + files?.length)


        //-----SAYFA 50
        println("Sayfa 50 = " + (files?.length ?: "empty"))
        val stringSize = files?.length ?: run{
            println("Sayfa 50 = run Method")
        }
        stringSize

        //-----SAYFA 51
        val letter = map["f"] ?: println("Sayfa 51 = No F in Map")


        //-----SAYFA 52
        val emptyArray = listOf<String>()
        val mainEmail = emptyArray.firstOrNull() ?: println("Sayfa 52 = !")


        //-----SAYFA 53
        val value = "Getir"
        value?.let {
            println("Sayfa 53 = value is not null")
        }


        //-----SAYFA 54
        val name : String? = null
        val mapped = name?.let { println("Sayfa 54 = not null")} ?: 5
        println("Sayfa 54 = $mapped")


        //-----SAYFA 55
        println("Sayfa 55 = ${transform("Blue")}")


        //-----SAYFA 56
        tryCatch()


        //-----SAYFA 57
        /*
           Performans İlişkisi: try-catch blokları, normal program akışını bozan hatalar için tasarlanmıştır. Bu blokların içindeki kod, bir hata meydana geldiğinde işlenir ve bu süreç bir maliyete yol açar. Bu nedenle, performansı önemli olan kod bölgelerinde gereksiz yere try-catch blokları eklemek, genel performansı düşürebilir.
           Kodun Karmaşıklığı: Gereksiz try-catch blokları, kodu karmaşık hale getirebilir ve okunabilirliği azaltabilir. Sadece gerçekten hata olasılığı olan yerlerde try-catch kullanmak, kodunuzu daha anlaşılır ve bakımı daha kolay hale getirebilir.
           Kontrol Akışı: try-catch blokları, normal program akışını bozduğu için, gereksiz kullanıldığında kontrol akışını karmaşıklaştırabilir. Bu, kodunun beklediği gibi çalışmasını anlamayı zorlaştırabilir.
           Hataların Görmezden Gelindiği Durumlar: Bazı durumlarda, try-catch blokları hataları sadece görmezden gelmek için kullanılır. Bu durum, hataların gerçek nedenini çözme şansını azaltabilir ve programın beklenmedik davranışlar sergilemesine neden olabilir.
        */


        //-----SAYFA 58
        val v = 2
        val ifValue = if (v == 1) {
            "one"
        } else if (v == 2) {
            "two"
        } else {
            "other"
        }
        println("Sayfa 58 = $ifValue")


        //-----SAYFA 59
        arrayOfMinusOnes(3).forEach { println("Sayfa 59 = $it") }


        //-----SAYFA 60
        println("Sayfa 60 = ${theAnswer1()}")
        println("Sayfa 60 = ${theAnswer2()}")


        //-----SAYFA 61
        val stickMan = StickMan()
        with(stickMan) {
            down()
            for (i in 1..2) {
                forward(100.0)
                turn(90.0)
            }
            up()
        }


        //-----SAYFA 62
        val myColor = Color().apply {
            colorName = "Blue"
        }
        println("Sayfa 62 = ${myColor.colorName}")


        //-----SAYFA 63
        /*val stream = Files.newInputStream(Paths.get("/some/file.txt"))
        stream.buffered().reader().use{ reader ->
            println(reader.readText())
        }*/


        //-----SAYFA 64
        val number = 7
        val text = "Generic"

        genericFunction(number)
        genericFunction(text)


        //-----SAYFA 65
        var myVar = 5
        myVar = myVar.also {
            println("Sayfa 65 = Değişkenin değer: $it")
            it.minus(2)
        }


        //-----SAYFA 67
        printMessageWithPrefix("Hello")
        printMessageWithPrefix("Log","Hello")


        //-----SAYFA 68
        println("Sayfa 68 = " + (1 shl 2))
        println("Sayfa 68 = " + (2 times "Bye "))


        //-----SAYFA 69
        val strng = "Always forgive your enemies; nothing annoys them so much."
        println("Sayfa 69 = " + strng[0..14])


        //-----SAYFA 70
        printAll("T","U","R","G","A","Y")


        //-----SAYFA 71
        var init: String = "initial"
        println("Sayfa 71 = $init")
        val h : Int = 1
        val p = 43


        //-----SAYFA 72
        var neverNull: String = "This can't be null"
        var nullable: String? = "You can keep a null here"
        var inferredNonNull = "The compiler assumes non-null"

        println("Sayfa 72 = ${strLength(neverNull)}")
        println("Sayfa 72 = ${strLength(nullable!!)}")


        //-----SAYFA 73
        println("Sayfa 73 = " + describeString("Kotlin"))
        println("Sayfa 73 = " +describeString(""))


        //-----SAYFA 74
        val customer = Customer()
        val person = Person(1, "ss@sgf.com")
        println("Sayfa 74 = ${person.email}")
        person.email = "sdfd@fdf.com"


        //-----SAYFA 75
        val stack = MutableStack(1, 2, 3)
        println("Sayfa 75 = $stack")
        stack.push(4)
        println("Sayfa 75 = Peek: ${stack.peek()}")
        println("Sayfa 75 = Pop: ${stack.pop()}")
        println("Sayfa 75 = $stack")
        println("Sayfa 75 = Is empty: ${stack.isEmpty()}")
        println("Sayfa 75 = Size: ${stack.size()}")


        //-----SAYFA 76
        val mutableStack = mutableStackOf(0.62, 3.14, 2.7)
        println("Sayfa 76 = " + mutableStack)


        //-----SAYFA 77
        val phone: Phone = Apple()
        phone.callSomenone()


        //-----SAYFA 78
        val lion: Lion = Asiatic("Rufo")
        lion.sayHello()


        //-----SAYFA 79
        val kedi = Kedi("Whiskers", 3, "Siyam")
        kedi.bilgileriGoster()
        kedi.miyavla()


        //-----SAYFA 80
        cases("Hello")
        cases(1)
        cases(0L)
        cases(Color())
        cases("hello")


        //-----SAYFA 81
        println("Sayfa 81 = ${whenAssign(1)}")


        //-----SAYFA 82
        val cakes = listOf("carrot", "cheese", "chocolate")
        for (cake in cakes){
            println("Sayfa 82 = Yummy, it's a $cake cake")
        }


        //-----SAYFA 83
        var cakesEaten = 0
        while (cakesEaten < 5){
            println("Sayfa 83 = Ate $cakesEaten cakes")
            cakesEaten++
        }


        //-----SAYFA 84
        cakesEaten = 0

        do{
            println("Sayfa 84 = Ate $cakesEaten cakes")
            cakesEaten++
        }while (cakesEaten < 5)


        //-----SAYFA 85
        for (i in 0..3) {
            println("Sayfa 85 = " +i)
        }
        for (m in 0 until 3) {
            println("Sayfa 85 = " +m)
        }
        for (n in 2..8 step 2) {
            println("Sayfa 85 = " +n)
        }
        for (p in 3 downTo 0) {
            println("Sayfa 85 = " +p)
        }


        //-----SAYFA 86
        for (c in 'a'..'d') {
            println("Sayfa 86 = " + c)
        }
        for (c in 'z' downTo 's' step 2) {
            println("Sayfa 86 = " + c)
        }


        //-----SAYFA 87
        val xe = 2
        if (xe in 1..5) {
            println("Sayfa 87 = xe is in range from 1 to 5")
        }
        if (xe !in 6..10) {
            println("Sayfa 87 = xe is not in range from 6 to 10")
        }


        //-----SAYFA 88
        val aa: Int = 5
        val bb: Int = 5
        val cc: Int = 10
        println("Sayfa 88 = " + (aa == bb))
        println("Sayfa 88 = " + (aa == cc))
        val xx: Int = 5
        val yy: Int = 5
        val zz: Int? = xx
        println("Sayfa 88 = " + (xx === yy))
        println("Sayfa 88 = " + (xx === zz))

        //-----SAYFA 89
        println("Sayfa 89 = ${max(99, -42)}")


        //-----SAYFA 90
        /*
        Data class'lar, veri taşıma amacıyla kullanılır. Bu sınıflar genellikle sadece veri saklamak ve taşımak için kullanılır, iş mantığı içermez.
        Data class'lar, otomatik olarak equals(), hashCode(), toString(), copy() gibi standart fonksiyonları üretir.
        Data class'lar, sınıf içindeki değişkenleri tanımlarken val veya var anahtar kelimelerini kullanabilirler.
        Data class'lar, öğelerine erişmek için component fonksiyonları oluşturur.
         */


        //-----SAYFA 91
        val kitap1 = Kitap("Kotlin Programlama", "Ahmet Yılmaz", 2022)
        val kitap2 = Kitap("Kotlin Programlama", "Ahmet Yılmaz", 2022)
        println("Sayfa 91 = equals(): ${kitap1.equals(kitap2)}")
        println("Sayfa 91 = hashCode() - Kitap1: ${kitap1.hashCode()}")
        println("Sayfa 91 = hashCode() - Kitap2: ${kitap2.hashCode()}")
        println("Sayfa 91 = toString() - Kitap1: $kitap1")
        println("Sayfa 91 = toString() - Kitap2: $kitap2")
        val kopyaKitap = kitap1.copy(yayinYili = 2023)
        println("Sayfa 91 = copy() – Kopya Kitap: $kopyaKitap")

    }


    //-----SAYFA 10
    fun sum1(a: Int, b: Int) : Int {
        return a+b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int): Unit{
        println("Sayfa 10 = sum of $a and $b is ${a+b}")
    }


    //-----SAYFA 11
    fun incrementZ(){
        z++
    }


    //-----SAYFA 14
    fun maxOf(a : Int, b : Int): Int{
        if (a>b){
            return a
        }
        else{
            return b
        }
    }
    fun maxOfShort(a : Int, b : Int) = if (a > b) a else b


    //-----SAYFA 18
    fun describe(obj : Any) : String = when(obj){
        1       ->  "One"
        "Hello" ->  "Greeting"
        is Long ->  "Long"
        else    ->  "Unknown"
    }


    //-----SAYFA 30
    fun longMethodName(
        num1: Int,
        num2: Int
    ) : Int{
        //Something
        return 0
    }


    //-----SAYFA 31
    fun foo() = 1


    //-----SAYFA 32
    fun f(x:String, y:String, z:String) =
        println("Sayfa 32 = " + veryLongFunctionCallWithManyWords())
    fun veryLongFunctionCallWithManyWords() = "Merhaba"


    //-----SAYFA 38
    fun greet(
        name: String = "Guest",
        greating: String = "Hello"
    ){
        println("Sayfa 38 = $greating, $name!")
    }


    //-----SAYFA 46
    fun String.toUppercaseExtension(): String {
        return this.uppercase()
    }


    //-----SAYFA 55
    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }


    //-----SAYFA 56
    fun tryCatch() {
        val result = try {
            println("Sayfa 56 = TryCatch")
        } catch (e: ArithmeticException) {
            throw IllegalArgumentException(e)
        }
    }


    //-----SAYFA 59
    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }


    //-----SAYFA 60
    fun theAnswer1() = 7
    fun theAnswer2() : Int{
        return 77
    }


    //-----SAYFA 64
    inline fun <reified T> genericFunction(value: T) {
        val typeName = T::class.simpleName
        println("Sayfa 64 = The type of the value is: $typeName")
    }


    //-----SAYFA 66
    fun calcTaxes(): BigDecimal = TODO("Burayı Unutma")


    //-----SAYFA 67
    fun printMessageWithPrefix(message : String, prefix : String = "Info"){
        println("Sayfa 67 = [$prefix] $message")
    }


    //-----SAYFA 68
    infix fun Int.shl(x: Int): Int {
        return this shl x
    }
    infix fun Int.times(str: String) = str.repeat(this)


    //-----SAYFA 69
    operator fun String.get(range: IntRange) = substring(range)


    //-----SAYFA 70
    fun printAll(vararg messages : String){
        for (m in messages) println("Sayfa 70 = $m")
    }


    //-----SAYFA 72
    fun strLength(notNull: String): Int {
        return notNull.length
    }


    //-----SAYFA 73
    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }

    //-----SAYFA 76
    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)


    //-----SAYFA 80
    fun cases(obj: Any) {
        when (obj) {
            1 -> println("Sayfa 80 = One")
            "Hello" -> println("Sayfa 80 = Greeting")
            is Long -> println("Sayfa 80 = Long")
            !is String -> println("Sayfa 80 = Not a string")
            else -> println("Sayfa 80 = Unknown")
        }
    }

    //-----SAYFA 81
    fun whenAssign(obj : Any): Any{
        val result = when (obj) {
            1 -> "One"
            "Hello" -> 1
            is Long -> false
            else -> 7
        }
        return result
    }


    //-----SAYFA 89
    fun max (a: Int, b:Int) = if (a > b) a else b
}