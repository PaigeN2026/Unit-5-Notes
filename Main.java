public class Main {

   // This is the "Tester Class" with a main method
   public static void main(String []args) {
      System.out.println("Constructing Student objects...");

      // Call DEFAULT CONSTRUCTOR
      // "Student senior" is the type declaration 
      // "= new Student()" is calling the constructor 
      Student kinder = new Student();

      // Call CONSTRUCTOR with PARAMETERS (String, String, int)
      Student junior = new Student("Paige", "Nunez", 2026);
      // Does argument order matter? YES!
      // Student senior = new Student(2025, "Zoie", "Vitale");

      // Look at our constructed Student objects
      System.out.println(kinder); // will print the LOCATION of the object
      // ...unless our class has a toString method defined!
      System.out.println(junior);

      // Construct two more Student objects & print them out
      Student senior = new Student("Zoie", "Vitale", 2025);
      System.out.println(senior);
      
      Student sophomore = new Student("Soph", "Omore", 2027);
      System.out.println(sophomore);

      // Test ACCESSOR/GETTER methods 
      // methods that RETURN output need to be handled 
      // 1. either by storing the output in a variable 
      String juniorEmail = junior.getEmail();
      System.out.println(juniorEmail);
      // 2. or by using the method call directly 
      System.out.println(kinder.getEmail());

      // Test MUTATOR/SETTER methods
      // void methods (no output) 
      // but they need an argument (input)
      kinder.setFirstName("James");
      kinder.setLastName("Smith");
      kinder.setEmail("James.Smith2037@gbwl.org");
      System.out.println(kinder);
      // note that didn't need to setGradYear because the DEFAULT CONSTRUCTOR gave an appropriate values for this already (we chose 2037 as the default)

      // Use the Object's class' equals() method
      // Checks the values of each instance variable 
      // junior is the CALLING OBJECT. kinder is the argument
      boolean isEqual = junior.equals(kinder);
      System.out.println(isEqual);

      // CALL our custom behavior methods
      // Example: no output, no input
      junior.complain();

      // Example: no output, NEEDS input
      junior.doHomework(8);
   }
}
