import java.time.Period

fun main() {
     wordlist(mutableListOf("My","name","is","Lynette","and","I","am","one","born","of", "God"))


    var height= mutableListOf(5.6,5.0,6.2,4.5,5.7)
    println(height.average())
    println(height.sum())

    person()

   println( cars())
}
//1.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun wordlist(words:List<String>):List<String>{
    val wordseven= mutableListOf<String>()
    for (word in words) {
        if (words.indexOf(word) %  2==0) {
         wordseven.add(word)
         println(wordseven)
        }
    }
    return words
}

//2.Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heightslist(height:Double):Double{

    return height
}

//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Personobject(var name:String,val age:Int,var height:Double,var weight:Double)
fun person(){
    val persons=Personobject("Mary Maina",30,5.7,67.0)
    val persons1=Personobject("Jecinta Wangui",45,6.3,70.0)
    val persons3=Personobject("Joyce Wanjiku",35,5.2,56.7)
    val person= listOf(persons,persons1,persons3)
    val personlist=person.sortedByDescending { person -> person.age }
    println(personlist)

}

//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.


//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:Any,var mileage:Double)
fun cars():Double{
    val car= Car("KDJ2020",10.0)
    val toyota= Car("KCD2018",7.0)
    val ford= Car("KDK"+(2023),12.0)
    val carw= listOf(car,toyota,ford)

    val w=carw.sumOf { w ->w.mileage }
    val average=w/carw.size
    return  average
}
