class NamedCow extends cow {     
     private String myName;
     public Cow(String type, String name, String sound)     {         
         myType = type;         
         mySound = sound;     
         myName = name;
     }     
     public String getName(){return myName;}
}