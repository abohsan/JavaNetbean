// 5676440
 
package assignment4;

/**
 *
 * @author abdu
 */
public class ElementType {

    public String identifier;
    public String access;

    public ElementType() {
        identifier = "";
        access = "";
    }

    public ElementType(String i, String a) {
        identifier = i;
        access = a;
    }

    @Override
    public String toString() {
        return identifier + "," + access;
    }

}
