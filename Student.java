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
    // "no-argument" constructor 
    // Job: initialize instance variables to default values 
    public Student() {
        firstName = "First";
        lastName= "Last";
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";

    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    // ORDER OF PARAMETERS IS IMPORTANT! (the data types)
    // "initFirstName," etc. are like PLACEHOLDERS for real values 
    public Student(String initFirstName, String initLastName, int initGradYear) {
        firstName = initFirstName;
        lastName = initLastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }
    // 3. METHODS (behaviors associated with the object type)
    // toString method provides a "String Representation"
    // of an object instance with all its data 
    public String  toString() {
        return ("Student [" + firstName + ", " + lastName + ", " + gradYear + ", " + email + "]");
    }

    // ACCESSOR METHODS ("Getters") return copies of the private data
    // write one for each of your instance variables
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getGradYear() {
        return gradYear;
    }
    public String getEmail() {
        return email;
    }

    //  MUTATOR METHODS ("Setters") accept a new value 
    // and change the instance variable to it
    // Setters are VOID, meaning NO RETURN (output) 
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    // OTHER METHODS(behaviors/actiosn associated with the object)

      // Example: VOID method, no parameters
      public void complain() {
        // Method BODY is the steps(s) for this process
        System.out.println("There is too much homework this week");
      }

      // Example: VOID method, need parameter
       public void doHomework(int numAssignments) {
            // Print a message for each assignment completed
            for (int i = numAssignments; i > 0; i--) {
                System.out.println("Working working working...");
                System.out.println(i - 1 +" assignments left.");
            }
            System.out.println("Homework is complete!");
       }
} 