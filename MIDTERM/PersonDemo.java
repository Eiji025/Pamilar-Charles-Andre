public class PersonDemo {
   public static void main(String[] args){
      Person person = new Person();
     
    
      person.setFirstName("CharlesAndre"); 
      person.setMiddleName("N/A");
      person.setLastName("Pamilar");
      person.setAge(20);
      person.setBday("December 07, 2003");
      person.setAddress("Sitio Sambag Tisa Cebu City"); 
      
      
     System.out.println("First Name: " +person.getFirstName());
     System.out.println("Middle Name: " +person.getMiddleName());
     System.out.println("Last Name: " +person.getLastName());
     System.out.println("Age: " +person.getAge());
     System.out.println("BirthDay: " +person.getBday());
     System.out.println("Address: " +person.getAddress());
   
 
 }
}