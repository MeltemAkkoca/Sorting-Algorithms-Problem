//-----------------------------------------------------
// Title: Person class
// Author: Meltem AKKOCA
// ID: 
// Section: 1
// Assignment: 2
// Description: This class describes person.
//-----------------------------------------------------

//STEP 5
public class Person implements Comparable<Person> {
    private String name, surname;
    private long id;

    public Person(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    //------------------------------------------------------------------------------------------------------
    // Summary: this method compares two persons' id which is bigger or smaller and returned an integer value
    //-------------------------------------------------------------------------------------------------------
    public int compareTo(Person o) {
        if (this.id > o.id)
            return 1;
        else if (this.id < o.id)
            return -1;

        return 0;
    }

    public String toString() {
        return name + " " + surname + " " + id;
    }


}

