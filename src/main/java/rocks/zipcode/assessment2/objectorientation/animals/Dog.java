package rocks.zipcode.assessment2.objectorientation.animals;


/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you completed the `Animal` class before attempting this class
 */
public class Dog extends Animal implements Woofer{

    public String speak() {
        String string = "Woof!\nWoof!";
        return string;
    }

}
