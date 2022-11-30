package it.develhope.Ex2;

public class Programmer {
    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;

    //WHY I CAN'T MAKE THINGS EASIER WITH THIS?
    /*public String Programmer(String name,String programmingLanguage, int yearsOfExperience){
        return name+" "+programmingLanguage+" "+yearsOfExperience;
    }*/

    public void printProgrammerDetails(String name,String programmingLanguage,int yearsOfExperience){
        System.out.println(name+ " " +programmingLanguage+" "+yearsOfExperience);
    }
}
