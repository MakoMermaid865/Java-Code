import java.util.Scanner;
public class Team {
      // TODO: Declare private fields - name, wins, losses
private String name;
private int wins;
private int losses;

   // TODO: Define mutator methods - 
   //       setName(), setWins(), setLosses()
public void setName(String name){
    this.name = name;
}

public void setWins(int wins){
    this.wins = wins;
}

public void setLosses(int losses){
    this.losses = losses;
}
   // TODO: Define accessor methods - 
   //       getName(), getWins(), getLosses()
public String getName(){
    return name;
}

public int getLosses(){
    return losses;
}

public int getWins(){
    return wins;
}

   // TODO: Define getWinPercentage()
public double getWinPercentage(){
    int total = wins + losses;
    if (total == 0) {
        return 0.0;
    }
    return (double) wins/total;
}

   // TODO: Define printStanding()
    public void printStanding(){
        double pct = getWinPercentage();
        System.out.printf("Win percentage: %.2f%n", pct);
        if (pct >= 0.5){
            System.out.println("Congratulations, Team " + name + " has a winning average!" );
        }
        else{
            System.out.println("Team " + name + " has a losing average."); 
        }
    }

}
public class WinningTeam {
public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    Team team = new Team();
    
    String name = scnr.next();
    int wins = scnr.nextInt();
    int losses = scnr.nextInt();
    
    team.setName(name);
    team.setWins(wins);
    team.setLosses(losses);
    
    team.printStanding();
}
}