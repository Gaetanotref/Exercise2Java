package it.develhope.Ex2;

public class CompetitionRules {
    private static CompetitionRules competitionRules =new CompetitionRules();
    private CompetitionRules() {}

    private static String competionRule1 = "Do not copy and paste from StackOverflow";
    private static String competionRule2 = "Learn every day!";
    private static String competionRule3 = "Be the best Team";

    public static void printRules(){
        System.out.println("The rules are: ");
        System.out.println(competionRule1);
        System.out.println(competionRule2);
        System.out.println(competionRule3);

    }
}
