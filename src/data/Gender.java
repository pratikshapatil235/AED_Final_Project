
package data;

public enum Gender {
    Male("MALE"),
    Female("FEMALE"),
    Other("OTHER");
    
   private final String name;
   private Gender(String name){
       this.name =name;
   } 

    public String getName() {
        return name;
    }
   
}