package LearningPackages.Generics;

interface Player{

    String name();
}

record BaseballPlayer  (String name, String position)implements Player{}
record FootballPlayer(String name, String position)implements Player{}
public class Main {

    public static void main(String[] args) {

        var philly = new Affiliation("city", "Philadelphia, PA", "US");
        //baseball team
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, String> astros = new Team<>("Houston Astros", "Houston");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        //football team
        Team<FootballPlayer, Affiliation> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker" , "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        //cannot add football player to baseball team and reverse
        //afc.addTeamMember(harper);
        //astros.addTeamMember(tex);

        //would work, if T wouldn't extend Player
       /* Team<String> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember("N Roberts");
        adelaide.listTeamMembers();
*/

    }
    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
