/* Example CLASS that defines an OBJECT
Class names like Student are always capitalized!
Object-Oriented Classes are like BLUEPRINTS
(in another Java class, you create instances from this blueprint)
*/
public class Student {
    // 1. INSTANCE VARIABLES (attributes/data/fields)
    // think of what this object "needs to know"
    // must be PRIVATE ("encapsulation")
    private String firstName;
    private String lastName;
    private int gradYear;
    private String email; 

    // 2. CONSTRUCTORS (manuals for setting up an object)
    // DEFAULT constructor (user did not provide data)
    // Job: initialize instance variables to default values 
    public Student() {
        firstName = "First";
        lastName= "Last"
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";

    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    public Student(String initFName, String initLName, int initGradYear) {
        firstName = initFName;
        lastName = initLName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }
    // 3. METHODS (behaviors associated with the object type)
} 