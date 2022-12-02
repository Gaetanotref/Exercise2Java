package it.develhope.Ex2;

public class Programmer {
    private String name;
    private String programmingLanguage;
    private int yearsOfExperience;

    //WHY I CAN'T MAKE THINGS EASIER WITH THIS?
    public Programmer(String name, String programmingLanguage, int yearsOfExperience) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName(){
        return name;
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }


    public void printProgrammerDetails() {
        System.out.println(name + " " + programmingLanguage + " " + yearsOfExperience);
    }
}
