// Faça um programa que recebe o nome de 4 times de futebol e mostra todas as combinações
//de jogos de modo que todos enfrentem todos uma única vez.
package List3;
import java.util.Scanner;

public class ex9_soccerMatches {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String[] teams = new String[4];

        System.out.print("1 - Enter a soccer team name: ");
        String firstTeam = keyboard.next();
        teams[0] = firstTeam;

        System.out.print("2 - Enter a soccer team name: ");
        String secondTeam = keyboard.next();
        teams[1] = secondTeam;

        System.out.print("3 - Enter a soccer team name: ");
        String thirdTeam = keyboard.next();
        teams[2] = thirdTeam;

        System.out.print("4 - Enter a soccer team name: ");
        String fourthTeam = keyboard.next();
        teams[3] = fourthTeam;

        keyboard.close();

        System.out.println("Confrontations:");
        System.out.println("--------------------------");

        for (int i = 0; i < teams.length - 1; i++){
            String team = teams[i];
            for (int j = i + 1; j < teams.length; j++){
                String nextTeam = teams[j];
                System.out.println(team + " X " + nextTeam);
            }
        }
    }
}
