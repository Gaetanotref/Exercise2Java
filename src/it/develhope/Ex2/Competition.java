package it.develhope.Ex2;
//WHY I CAN'T MAKE THINGS EASIER WITH THIS? -> OTHER SOLUTION NOT WORKING

public class Competition {
    public static void main(String[] args) {
        //RULES
        CompetitionRules rules=CompetitionRules.getInstance();
        CompetitionRules.printRules();
        //TEAM
        Team teamA=new Team();
        Team teamB=new Team();
        teamA.teamName="TeamNumber1";
        teamB.teamName="TeamNumber2";

        //WHY I CAN'T MAKE THINGS EASIER WITH THIS?
        teamA.p1.Programmer("Gaetano","Java",1);
        teamA.p2.Programmer("Franco","python",1);

        teamB.p1.Programmer("Ciccio","Java",12);
        teamB.p2.Programmer("Lello","Python",4);

        //PROGRAMMERS
        //TEAM A
        /*teamA.p1.name="Francesco";
        teamA.p1.programmingLanguage="Java";
        teamA.p1.yearsOfExperience=3;

        teamA.p2.name="Giacomo";
        teamA.p2.programmingLanguage="Python";
        teamA.p2.yearsOfExperience=1;
        //TEAM B
        teamB.p1.name="Leonardo";
        teamB.p1.programmingLanguage="Java";
        teamB.p1.yearsOfExperience=8;

        teamB.p2.name="Pietro";
        teamB.p2.programmingLanguage="C++";
        teamB.p2.yearsOfExperience=4;*/

        //PRINT ALL VALUES
        teamA.printTeamDetails();
        teamB.printTeamDetails();

    }
}
