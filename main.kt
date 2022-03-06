fun main(){
    array("akirachix","school","nairobi","kenya")
    arrangement()
    find()
    var result=names("Pascaline","Umulisa","Kayitete")
    println(result.contentToString())

}
fun array(word:String, word1:String,word2:String,word3:String){
    var result=arrayOf(word,word1,word2,word3)
    println(result.contentToString())
}
fun arrangement(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    var sorted=cities.sortedArray()
    var arranged=sorted.forEach { city->
        println(city.capitalize())
    }
}
fun find(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var num=arrayOf(numbers[1],numbers[4])
    println(num.sum())
    println(numbers.indexOf(158))
    println(numbers.sorted())

}
fun names(name:String,name1: String,name2:String):Array<String>{
    var mynames=arrayOf(name,name1,name2)
    return mynames


}