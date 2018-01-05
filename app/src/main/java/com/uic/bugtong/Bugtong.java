package com.uic.bugtong;

public class Bugtong {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 5;          //Array maximum size
    public final int TOTAL_SIZE = 5;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 50;           /*Scoring Rule:
                                                if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public Bugtong() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

        bugtong[0] = "Which one is the first search engine in internet? ";
        choices[0][0] = "Google";
        choices[0][1] = "Altavista";
        choices[0][2] = "Archie";
        choices[0][3] = "WAIS";
        answer[0] = "B";

        bugtong[1] = "Number of bit used by IPv6 address. ";
        choices[1][0] = "32 bit";
        choices[1][1] = "256 bit";
        choices[1][2] = "64 bit";
        choices[1][3] = "128 bit";
        answer[1] = "C";

        bugtong[2] = "Which one is the first web browser invented in 1990? ";
        choices[2][0] = "Internet Explorer";
        choices[2][1] = "Mosaic";
        choices[2][2] = "Nexus";
        choices[2][3] = "Mozilla";
        answer[2] = "D";

        bugtong[3] = "Which of the following programming language is used to create programs like applets? ";
        choices[3][0] = "COBOL";
        choices[3][1] = "Java";
        choices[3][2] = "C Language";
        choices[3][3] = "Basic";
        answer[3] = "C";

        bugtong[4] = "First computer virus is known as ";
        choices[4][0] = "Rabbit";
        choices[4][1] = "Creeper virus";
        choices[4][2] = "Elk cloner";
        choices[4][3] = "SCA virus";
        answer[4] = "B";
    }

    public String getBugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
