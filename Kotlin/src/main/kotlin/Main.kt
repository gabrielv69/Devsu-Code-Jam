
import java.math.BigInteger
import java.util.*


fun main(){
    //val ejer1 = Ejer1()
    //ejer1.construirSerie(7, 6, 1, -2)
    //println(ejer1.sumaElementos(7,8))
   // eariMob(19)
    print(maximunDistance("abcdefghi", "de"))
    //print(maximunDistance("axucgrzqebtbuxpiyuavccltqwcmpzmmfaakncabbbdxepyevkswxhlellrfobyufmyumrorcgmjilzogezuggtxotzukeifvybxkacmwvkhswcoabmgwknminltbdqexopvysobpautmkmiuipuzfqpmwhwiyzdprxnadedrquxzassyfgrrjmgfenwmynehqnabgajrnfgdfvftghczetmhcakgnvjuuctufjgoqowhwtozkskaszvfpijugitoextqibynisnfbenweojapwtclszycusagzwbgavxawzfnuhmpddgzyymuxurdqkfkejsqdesmmzlxuokmloduolwyslonilvhjlqtftyxfoaopmvvomiddncnwqmxozqbmhuqpksuydcwwwuxvdfwrfiizcccktmfxcpdtunnknagsgntpnccgimnqketezhsbyrofjvwoqvturvwzttugivywdnqtzjnkyfdzkqcabyinwsowecczjgwwcgomuoogaxmbxcwjbjqozjxrzcyojylanjlpcdzgeraxhbaybxsuhcuvlsshmeblbdfaziubugweeckkvxqgtdrrsbxparablqpypqtenytfbntudlyakehtwhbbtngusmjaudcbazjfeqjufbileiwtylkkfkdmtertqzayaohzkuokkuplcwqrcwzxeqlzbhlubycufmwbvsbcseggwpmezxxnxmjcabibhjlurjtzuxxjartfgqogmrgpjigfazhpoaqggwpakbcxnghxhddcydmzqgsejyrstktdpcaeqpiqnzyebaioirhvlckxamorbriylesbwszzletemgyfcjyhpsmjandcxdrsjvfzuswuoxybtxzmhjqhbcxbhxdhbxjbrecpuvutlfyamkltfogwklisxhscgvwufckkszpejndjxzsaiuxengwgbpdssryllxmzgejtwmqyehdtymzivyygtqqbcu","ggwp"))
    //print(maximunDistance("wmsbexxcherystodmtfvldoaazzwrcbnoxtrprmoxapcdtkedzyxebdeazzadueyvpudeinbzshoprybjgkaxyyajybslslcnlitdcfzoebcnnqlckjpwihmleezgtbrqmygdlqmabcwmjuzulgxfbimebehakskuptbizbnxepezlfujlkdtwpmweppkbqgymrepinn", "kasasdkydwg"))
    //print(maximunDistance("axucgrzqebtbuxpiyuavccltqwcmpzmmfaakncabbbdxepyevkswxhlellrfobyufmyumrorcgmjilzogezuggtxotzukeifvybxkacmwvkhswcoabmgwknminltbdqexopvysobpautmkmiuipuzfqpmwzdprxnadedrquxzassyfgrrjmgfenwmynehqnabgajrnfgdfvftghczetmhcakgnvjuuctufjgoqowhwtozkskaszvfpijugitoextqibynisnfbenweojapwtclszycusagzwbgavxawzfnuhmpddgzyymuxurdqkfkejsqdesmmzlxuokmloduolwyslonilvhjlqtftyxfoaopmvvomiddncnwqmxozqbmhuqpksuydcwwwuxvdfwrfiizcccktmfxcpdtunnknagsgntpnccgimnqketezhsbyrofjvwoqvturvwzttugivywdnqtzjnkyfdzkqcabyinwsoxqlxwecczjgwwcgomuoogaxmbxcwjbjqozjxrzcyojylanjlpcdzgeraxhbaybxsuhcuvlsshmeblbdfaziubugweeckkvxqgtdrrsbxparablqpypqtenytfbntudlyakehtwhbbtngusmjaudcbazjfeqjufbileiwtylkkfkdmtertqzayaohzkuokkuplcwqrcwzxeqlzbhlubycufmwbvvvveeweqmezxxnxmjcajlurjtzuxxjartvvvegmrgpjigfazhpoaqeshxakbcxnghxhddcydmzqgsejyrstktdpcaeqpiqnzyebaioirhvlckxamorbriylesbwszzletemgyfcjyhpsmjandcxdrsjvfzuswuoxybtxzmhjqhbcxbhxdhbxjbrecpuvutlfyamkltfogwklisxhscgvwufckkszpejndjxzsaizjkzuxengwgbpdssryllxmzgejtwmqyehdtymzivyygtqqbcu", "vvve"))
//maximumElement(intArrayOf(1, 2, 3, 3, 3, 3, 4, 5, 6, 6));
    //print(returnvalue(81239812739128371.toBigInteger()))
    }

fun isPerfect(n: Int): Boolean {
    var sum = 0
    var i = 1
    while (i <= n / 2) {
        if (n % i == 0) {
            sum += i
        }
        i++
    }
    return sum == n
}

fun findPerfectNumber(x: Int, y: Int): Int {
    var x = x
    var perfectNumber = -1
    var isPerfect = false
    while (!isPerfect && x <= y) {
        isPerfect = isPerfect(x)
        if (isPerfect) {
            perfectNumber = x
        }
        x++
    }
    return perfectNumber
}


fun eariMob( a:Int?=-1 ):String{
    var earie = "(O_o)"
    val complete = "(-_-)"
    val sideR = "_-)"
    val sideL = "(-_"
    val partialR = "-_-)"
    val partialL = "(-_-"
    val finalR = "-)"
    val finalL = "(-"



    if (a != null) {
        if(a>256 ||a<1 )
            return earie
        else{
            val middle: Int = (a/2)
            val aerieString = arrayOfNulls<String>(a)
            for ( i in 0 until a) {
                if(aerieString[i]==null)
                    aerieString[i]=sideL
                if(i<middle){
                    if((middle-(3*i))>0)
                        aerieString[middle-(3*i)]=partialL
                }else{
                    aerieString[i]=sideR
                    if ((i-middle)%3==0){
                        aerieString[i]=partialR
                    }
                }

            }

            if(a>7){
                aerieString[0]=finalL
                aerieString[a-1]=finalR
            }
            aerieString[middle] = complete
            val join: String = java.lang.String.join("", *aerieString)
             print(join)
        }
    }
    return earie
}

fun toeplitz(matriz: Array<IntArray?>?): Int {
    return -1
}


fun maximunDistance(text:String,subString:String):Int{
        var distance =-1
        if (text.contains(subString)){
            val izq= text.indexOf(subString)+1
            val der = text.length-izq+1
            if (izq>der) {
                distance = izq
            }else{
                distance=der
            }
        }
        return distance
    }

fun maxSubArraySum(a: IntArray) {
    val size = a.size
    var max_so_far = Float.MIN_VALUE
    var max_ending_here = 0f
    var start = 0
    var end = 0
    var s = 0
    for (i in 0 until size) {
        max_ending_here *= a[i]
        if (max_so_far < max_ending_here) {
            max_so_far = max_ending_here
            start = s
            end = i
        }
        if (max_ending_here < 0) {
            max_ending_here = 0f
            s = i + 1
        }
    }
    val maxArray = FloatArray(end - start + 1)
    for (i in start..end) {
        maxArray[i - start] = a[i].toFloat()
    }
    println(start)
    println(end)
    println("Array" + Arrays.toString(maxArray))
}

fun maximumElement(a: IntArray): Int {
    var max = Int.MIN_VALUE
    var menorSuma = Int.MAX_VALUE
    for (i in a.indices) {
        var suma = 0
        for (j in a.indices) {
            if (a[j] != a[i]) {
                suma += a[j]
            }
        }
        if (suma <= menorSuma) {
            menorSuma = suma
            if (a[i] > max) {
                max = a[i]
            }
        }
    }
    return max
}

fun construirSerie(inicio1: Int, inicio2: Int, patron1: Int, patron2: Int) {
    val a = arrayOf(BigInteger.ONE, BigInteger.TEN)
}
fun returnvalue(index:BigInteger):BigInteger{
    var value: Long = 0
    var bigFour:BigInteger=4.toBigInteger()
    var bigUno:BigInteger=1.toBigInteger()
    var bigDos:BigInteger=2.toBigInteger()
    val n: BigInteger = ((index.divide(bigFour))+bigUno)
    val res = index.mod(bigFour)
    val first= (n.multiply(bigDos))-bigUno
    val second = n.multiply(bigDos)
    val third = (n.multiply(bigDos))+bigUno
    val fourth = (n.multiply(bigDos))+bigDos
    val serie = arrayOf(first,second,third,fourth)
    return serie[res.toInt()]
}
fun construirSerie(index:Long) : Long{
    val serie = LongArray(10000)
    serie[0] = 1
    for (i in 1 until serie.size) {
        serie[i] = serie[i - 1]+1
        if(i%4==0){
            serie[i]= serie[i-2]
        }
    }
    print(serie.contentToString())
    return serie[index.toInt()]
}

