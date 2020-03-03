package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Object> implements Iterable<Object> {

    List<Object> members;

    public Shelter() {
        members = new ArrayList<Object>();
       // throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() { return members.size(); }

    public void add(Object object) { members.add(object);}

    public Boolean contains(Object object) { return members.contains(object); }

    public void remove(Object object) { members.remove(object);}

    public Object get(Integer index) { return members.get(index); }

    public Integer getIndexOf(Object ageable) { return members.indexOf(ageable); }

    @Override
    public Iterator<Object> iterator() {
        return members.iterator();
    }
}