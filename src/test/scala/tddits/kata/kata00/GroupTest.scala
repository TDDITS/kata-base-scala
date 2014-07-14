package tddits.kata.kata00

import org.scalatest.{BeforeAndAfter, FunSuite}

class GroupTest extends FunSuite with BeforeAndAfter
{
    var person: Person = new Person("", "", 0)
    var group: Group = new Group("")
    val groupName = "A team"

    before {
        person = new Person("James", "Jackson", 32)
        group  = new Group(groupName)
    }

    test("Group can have a name")
    {
        assert(groupName == group.name)
    }

    test("Group can hold Persons")
    {
        group add person
        group add person

        assert(2 == group.count)
    }

    test("Group can determine size")
    {
        assert("" == group.size)

        for(i <- 1 to 5)
        {
            group add person
            assert("small" == group.size)
        }

        for(i <- 1 to 15)
        {
            group add person
            assert("medium" == group.size)
        }

        for(i <- 1 to 10) {
            group add person
            assert("large" == group.size)
        }
    }
}
