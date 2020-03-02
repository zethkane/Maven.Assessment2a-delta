package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> {
    Map<Ageable, Integer> shelter = new HashMap<>();
    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(Object object) {
       // shelter.put(object, 10);
    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}