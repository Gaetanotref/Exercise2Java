package it.develhope.Ex2;

public class Team {
    public String teamName;

    public Programmer p1;
    public Programmer p2;

    public Team(){}

    public void printTeamDetails(){
        System.out.println(teamName);
        System.out.println(p1.getName()+" "+p1.getProgrammingLanguage()+" "+ p1.getYearsOfExperience());
        System.out.println(p2.getName()+" "+p2.getProgrammingLanguage()+" "+ p2.getYearsOfExperience());
    }
}
