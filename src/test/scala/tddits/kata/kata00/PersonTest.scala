package tddits.kata.kata00

import org.scalatest.FunSuite

class PersonTest extends FunSuite
{
    val testPersonFirstName = "James"
    val testPersonLastName  = "Jackson"
    val testPersonAge       = 32
    val testPersonFullName  = "James Jackson"
    val person              = new Person(testPersonFirstName, testPersonLastName, testPersonAge)

    test("Person can store information about itself")
    {
        assert(testPersonFirstName == person.firstName)
        assert(testPersonLastName == person.lastName)
        assert(testPersonAge == person.age)
    }

    test("Person can give back the full name")
    {
        assert(testPersonFullName == person.fullName)
    }
}
