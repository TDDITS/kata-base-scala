package tddits.kata.kata00

class Group(val name: String)
{
    var people: scala.collection.immutable.Vector[Person] = Vector()

    def add(person: Person) = people :+= person

    def count = people.count(p => true)

    def size = {
        1 match {
            case 1 if count ==  0 => ""
            case 1 if count <=  5 => "small"
            case 1 if count <= 20 => "medium"
            case 1 if count >  20 => "large"
        }
    }
}
