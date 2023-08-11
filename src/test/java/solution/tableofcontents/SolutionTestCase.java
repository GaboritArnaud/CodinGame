package solution.tableofcontents;

public class SolutionTestCase {
    public final static String INPUT_1 = "40\n5\nTitle1 4\n>Subtitle1 5\n>>Subsubtitle1 5\n>Subtitle2 6\nTitle2 10\n";

    public final static String EXPECTED_1 = "1 Title1...............................4\n    1 Subtitle1........................5\n        1 Subsubtitle1.................5\n    2 Subtitle2........................6\n2 Title2..............................10\n";

    public final static String INPUT_2 = "30\n10\nOne 5\nTwo 10\nThree 11\nFour 20\nFive 40\nSix 45\nSeven 66\nEight 80\nNine 99\nAppendixA 100\n";

    public final static String EXPECTED_2 = "1 One........................5\n2 Two.......................10\n3 Three.....................11\n4 Four......................20\n5 Five......................40\n6 Six.......................45\n7 Seven.....................66\n8 Eight.....................80\n9 Nine......................99\n10 AppendixA...............100\n";

    public final static String INPUT_3 = "45\n18\nA 1\n>AA 5\n>>AAA 8\n>>>AAAA 8\n>>>>AAAAA 9\n>>AAB 10\n>>>AABA 12\n>>>>AABAA 12\n>>>>AABAB 13\n>>>>>AABABA 14\n>AB 15\n>>ABA 20\n>>ABB 25\n>>>ABBA 26\n>>>>ABBAA 27\n>>>>>ABBAAA 28\n>AC 29\nB 5005\n";

    public final static String EXPECTED_3 = "1 A.........................................1\n    1 AA....................................5\n        1 AAA...............................8\n            1 AAAA..........................8\n                1 AAAAA.....................9\n        2 AAB..............................10\n            1 AABA.........................12\n                1 AABAA....................12\n                2 AABAB....................13\n                    1 AABABA...............14\n    2 AB...................................15\n        1 ABA..............................20\n        2 ABB..............................25\n            1 ABBA.........................26\n                1 ABBAA....................27\n                    1 ABBAAA...............28\n    3 AC...................................29\n2 B......................................5005\n";

    public final static String INPUT_4 = "50\n13\nSudamerica 1\n>Argentina 5\n>>BuenosAires 8\n>>Cordoba 10\n>Brasil 15\n>>SaoPaulo 20\n>>Fortaleza 25\nAsia 30\n>Japan 32\n>>Yokohama 35\n>>Tokio 40\n>Iran 42\n>>Teheran 45\n";

    public final static String EXPECTED_4 = "1 Sudamerica.....................................1\n    1 Argentina..................................5\n        1 BuenosAires............................8\n        2 Cordoba...............................10\n    2 Brasil....................................15\n        1 SaoPaulo..............................20\n        2 Fortaleza.............................25\n2 Asia..........................................30\n    1 Japan.....................................32\n        1 Yokohama..............................35\n        2 Tokio.................................40\n    2 Iran......................................42\n        1 Teheran...............................45\n";

}