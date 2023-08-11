package solution.retrotypewriterart;

public class SolutionTestCase {
    public final static String INPUT_1 = "1sp 1/ 1bS 1_ 1/ 1bS nl 1( 1sp 1o 1. 1o 1sp 1) nl 1sp 1> 1sp 1^ 1sp 1< nl 2sp 3|\n";

    public final static String EXPECTED_1 = " /\\_/\\\n( o.o )\n > ^ <\n  |||\n";

    public final static String INPUT_2 = "18sp 1: nl 18sp 1: nl 7sp 2, 9sp 1: 9sp 2, nl 7sp 2: 9sp 1: 9sp 2: nl 2, 5sp 2: 9sp 1: 9sp 2: 5sp 2, nl 2: 5sp 2: 9sp 1: 9sp 2: 5sp 2: nl 1sp 1sQ 2: 1. 3sp 1sQ 2: 1. 6sp 1: 6sp 1. 2: 1sQ 3sp 1. 2: 1sQ nl 4sp 1sQ 2: 1. 2sp 1sQ 2: 1. 2sp 1_ 1/ 1~ 1bS 1_ 2sp 1. 2: 1sQ 2sp 1. 2: 1sQ nl 6sp 1sQ 2: 1. 2sp 3: 1/ 5sp 1bS 3: 2sp 1. 2: 1sQ nl 8sp 1sQ 5: 1( 7sp 1) 5: 1sQ nl 15sp 1bS 1sp 3_ 1sp 1/ nl 9sp 1. 5: 1/ 1` 3sp 1` 1bS 5: 1. nl 7sp 1. 2: 1sQ 3sp 1. 1: 1bS 1o 1sp 1o 1/ 1: 1. 3sp 1sQ 2: 1. nl 5sp 1. 2: 1sQ 3sp 1. 2: 2sp 1: 1sQ 1: 2sp 2: 1. 3sp 1sQ 2: 1. nl 3sp 1. 2: 1sQ 4sp 2: 1sQ 3sp 1sQ 1sp 1sQ 3sp 1sQ 2: 4sp 1sQ 2: 1. nl 2sp 2: 6sp 2: 13sp 2: 6sp 2: nl 2sp 2^ 6sp 2: 13sp 2: 6sp 2^ nl 10sp 2: 13sp 2: nl 10sp 2^ 13sp 2^\n";

    public final static String EXPECTED_2 = "                  :\n                  :\n       ,,         :         ,,\n       ::         :         ::\n,,     ::         :         ::     ,,\n::     ::         :         ::     ::\n '::.   '::.      :      .::'   .::'\n    '::.  '::.  _/~\\_  .::'  .::'\n      '::.  :::/     \\:::  .::'\n        ':::::(       ):::::'\n               \\ ___ /\n         .:::::/`   `\\:::::.\n       .::'   .:\\o o/:.   '::.\n     .::'   .::  :':  ::.   '::.\n   .::'    ::'   ' '   '::    '::.\n  ::      ::             ::      ::\n  ^^      ::             ::      ^^\n          ::             ::\n          ^^             ^^\n";

    public final static String INPUT_3 = "13sp 2x nl 12sp 1/ 1sp 1. 1| 1_ nl 11sp 1/ 1( 1_ 1) 1_ 1< nl 10sp 1/ 2sp 1( nl 1sp 2( 4_ 1. 1- 1sQ 4sp 1) nl 2sp 2bS 9sp 1/ nl 3sp 1bS 1sQ 1- 1. 1- 1. 1- 1sQ 1` 1/ nl 1sp 1_ 2sp 1bS 6_ 1/ nl 1( 1_ 1) 3sp 1_ 1| 1_ 1bS 1_ nl 16sQ\n";

    public final static String EXPECTED_3 = "             xx\n            / .|_\n           /(_)_<\n          /  (\n ((____.-'    )\n  \\\\         /\n   \\'-.-.-'`/\n _  \\______/\n(_)   _|_\\_\n''''''''''''''''\n";

    public final static String INPUT_4 = "nl 1sp 2_ 1( 1sp 1) 1_ nl 1( 6sp 1( 1o 4_ nl 1sp 1| 10sp 1| nl 1sp 1| 6sp 1( 2_ 1/ nl 3sp 1bS 5sp 1/ 3sp 3_ nl 3sp 1/ 5sp 1bS 2sp 1bS 3_ 1/ nl 1sp 1/ 4sp 1^ 4sp 1/ 5sp 1bS nl 1| 3sp 1| 2sp 1| 2_ 1| 1_ 1H 1U 2N 1Y 1sp 1| nl 1| 4sp 1bS 6_ 1) 4_ 1/ nl 1sp 1bS 9sp 1/ nl 3sp 1bS 5sp 1/ 1_ nl 4sp 1| 2sp 1( 1sp 2_ 1) nl 4sp 1( 4_ 1)\n";

    public final static String EXPECTED_4 = "\n __( )_\n(      (o____\n |          |\n |      (__/\n   \\     /   ___\n   /     \\  \\___/\n /    ^    /     \\\n|   |  |__|_HUNNY |\n|    \\______)____/\n \\         /\n   \\     /_\n    |  ( __)\n    (____)\n";

    public final static String INPUT_5 = "1sp 1[ 1] 1[ 1] 1[ 1] 1sp 1/ 2sQ 1bS 1sp 1[ 1] 1[ 1] 1[ 1] nl 2sp 1| 2: 1| 1sp 1/ 4_ 1bS 1sp 1| 2: 1| nl 2sp 1| 1[ 1] 1| 1_ 1| 4: 1| 1_ 1| 1[ 1] 1| nl 2sp 1| 6: 2_ 6: 1| nl 2sp 1| 5: 1/ 2| 1bS 5: 1| nl 2sp 1| 1: 1# 3: 4| 2: 1# 2: 1| nl 2sp 168 nl 1sp 88 2sp 88 nl 1sp 78 4sp 78\n";

    public final static String EXPECTED_5 = " [][][] /''\\ [][][]\n  |::| /____\\ |::|\n  |[]|_|::::|_|[]|\n  |::::::__::::::|\n  |:::::/||\\:::::|\n  |:#:::||||::#::|\n  8888888888888888\n 88888888  88888888\n 8888888    8888888\n";

    public final static String INPUT_6 = "1# nl";

    public final static String EXPECTED_6 = "#\n\n";

    public final static String INPUT_7 = "10sp 5_ nl 9sp 1/ 4sp 1/ 1bS nl 8sp 1/ 4sp 1/ 2sp 1bS nl 7sp 1/ 4sp 1/ 4sp 1bS nl 6sp 1/ 4sp 1/ 2sp 1/ 1bS 2sp 1bS nl 5sp 1/ 4sp 1/ 2sp 1/ 2sp 1bS 2sp 1bS nl 4sp 1/ 4sp 1/ 2sp 1/ 1bS 3sp 1bS 2sp 1bS nl 3sp 1/ 4sp 1/ 2sp 1/ 2sp 1bS 3sp 1bS 2sp 1bS nl 2sp 1/ 4sp 1/ 2_ 1/ 4_ 1bS 3sp 1bS 2sp 1bS nl 1sp 1/ 14sp 1bS 3sp 1bS 2sp 1bS nl 1/ 16_ 1bS 3sp 1bS 2sp 1bS nl 1bS 21_ 1bS 1sp 1/\n";

    public final static String EXPECTED_7 = "          _____\n         /    /\\\n        /    /  \\\n       /    /    \\\n      /    /  /\\  \\\n     /    /  /  \\  \\\n    /    /  /\\   \\  \\\n   /    /  /  \\   \\  \\\n  /    /__/____\\   \\  \\\n /              \\   \\  \\\n/________________\\   \\  \\\n\\_____________________\\ /\n";

    public final static String INPUT_8 = "6sp 1_ 7sp 1_ nl 5sp 1( 1_ 1bS 5sp 1/ 1_ 1) nl 7sp 2) 3sp 2( nl 5sp 1. 1- 7sQ 1- 1. 2sp nl 1sp 1/ 1^ 1bS 1/ 2sp 1_ 1. 3sp 1_ 1. 2sp 1bS 1/ 1^ 1bS nl 1sp 1bS 1( 3sp 1/ 2_ 1bS 1sp 1/ 2_ 1bS 3sp 1) 1/ nl 2sp 1bS 1, 2sp 1bS 1o 1_ 1/ 1_ 1bS 1o 1_ 1/ 2sp 1, 1/ nl 4sp 1bS 4sp 1( 1_ 1) 4sp 1/ nl 5sp 1` 1- 1. 1sQ 3= 1sQ 1. 1- 1sQ nl 6sp 2_ 1) 1sp 1- 1sp 1( 2_ 3sp nl 5sp 1/ 2sp 1` 3~ 1` 2sp 1bS nl 4sp 1/ 2sp 1/ 5sp 1bS 2sp 1bS nl 4sp 1bS 1sp 1: 7sp 1; 1sp 1/ nl 5sp 1bS 1| 2= 1( 1* 1) 2= 1| 1/ nl 6sp 1: 7sp 1: nl 7sp 1bS 2sp 1| 2sp 1/ nl 5sp 3_ 1) 1= 1| 1= 1( 3_ nl 4sp 1{ 4_ 1/ 1sp 1bS 4_ 1}\n";

    public final static String EXPECTED_8 = "      _       _\n     (_\\     /_)\n       ))   ((\n     .-'''''''-.  \n /^\\/  _.   _.  \\/^\\\n \\(   /__\\ /__\\   )/\n  \\,  \\o_/_\\o_/  ,/\n    \\    (_)    /\n     `-.'==='.-'\n      __) - (__   \n     /  `~~~`  \\\n    /  /     \\  \\\n    \\ :       ; /\n     \\|==(*)==|/\n      :       :\n       \\  |  /\n     ___)=|=(___\n    {____/ \\____}\n";

    public final static String INPUT_9 = "15sp 1O 1o 1* 1o 1O 1o 1O 1o nl 10sp 1o 1O 1o 1O 1* 1O 1o 1* 1o 1O 1o 1O 1o 1O 1o 1O 1@ 1o nl 8sp 1o 1O 1o 1O 1o 1O 18 1O 1o 1O 1@ 1o 1@ 1o 1O 1o 1O 1o 1O 1o nl 8sp 1o 1O 1o 1O 1@ 1O 1o 18 1o 1O 2o 1@ 1o 1O 1o 18 1@ 1O 1o 1O nl 7sp 2o 1O 1o 18 1o 1O 1o 1O 1o 1O 1@ 20 1O 1o 1O 1* 1O 1o 1O 1o 1O 1o nl 4sp 2o 1O 1o 1O 1o 1O 1@ 1O 1o 1O 1o 1O 1o 10 1o 1O 1@ 1O 1o 1O 1o 1O 1o 1O 1@ 1O 1o nl 2sp 2o 1O 1o 18 1o 1O 1o 1O 1o 1O 1o 1O 1@ 1O 1* 2o 1O 1o 18 1o 1O 1@ 1O 1o 1O 1o 1O 1o 1O 1o nl 2sp 1o 1O 1o 1O 1o 1O 1o 1* 18 1O 1o 1O 1o 1O 1o 1O 1o 1O 18 1O 1o 1O 1o 1O 1o 1O 1o 18 1o 1O 1o 1O nl 2sp 1* 2o 1O 2o 1O 2o 1O 2o 1O 2o 1@ 1* 2o 1O 2o 1O 18 1o 1O 2o 1O 2o 1* nl 6sp 1O 2sp 1* 2o 1O 1sp 1x 1sp 4X 1* 1O 1o 1* 2sp 1@ 2sp 1* 1o nl 11sp 1O 1o 2sp 1x 4X 1* 2o nl 16sp 2X 1@ 1X 1x nl 16sp 4X nl 16sp 4X nl 15sp 1x 5X 1x nl 13sp 1x 8X 1x nl 9sp 16X 1x nl 35=\n";

    public final static String EXPECTED_9 = "               Oo*oOoOo\n          oOoO*Oo*oOoOoOoO@o\n        oOoOoO8OoO@o@oOoOoOo\n        oOoO@Oo8oOoo@oOo8@OoO\n       ooOo8oOoOoO@00OoO*OoOoOo\n    ooOoOoO@OoOoOo0oO@OoOoOoO@Oo\n  ooOo8oOoOoOoO@O*ooOo8oO@OoOoOoOo\n  oOoOoOo*8OoOoOoOoO8OoOoOoOo8oOoO\n  *ooOooOooOooOoo@*ooOooO8oOooOoo*\n      O  *ooO x XXXX*Oo*  @  *o\n           Oo  xXXXX*oo\n                XX@Xx\n                XXXX\n                XXXX\n               xXXXXXx\n             xXXXXXXXXx\n         XXXXXXXXXXXXXXXXx\n===================================\n";

    public final static String INPUT_10 = "4sp 2_ nl 2sp 1. 1^ 1o 1sp 1~ 1bS nl 1sp 1Y 1sp 1/ 1sQ 1~ 1) 1sp 1} 6sp 5_ nl 1sp 1l 1/ 2sp 1/ 1sp 1/ 4sp 1, 1- 1~ 5sp 2~ 2- 1. 1, 1_ nl 4sp 1( 1sp 1( 4sp 1/ 2sp 1~ 1- 1. 1_ 9sp 1^ 1. nl 5sp 1bS 1sp 1sQ 2- 1sQ 2- 1. 4sp 1sQ 1- 1. 1_ 7sp 1bS nl 6sp 1sQ 1- 1. 8_ 5sp 1~ 2- 1. 1, 2_ 1sp 1^ 1. nl 16sp 1sQ 1~ 1r 1- 1. 1, 3_ 1. 1- 1sQ 1- 1. 1sp 1^ 1. nl 17sp 1Y 1I 4sp 1bS 6sp 1~ 1- 1. 1bS nl 17sp 2| 5sp 1bS 8sp 1` 1bS nl 17sp 2| 5sp 2/ nl 17sp 2| 4sp 2/ nl 17sp 1( 1) 3sp 2/ nl 17sp 2| 2sp 2/ 4sp 1~ 1F 1r 1a 1n nl 17sp 2| 1sp 1( 1sp 1c nl 4sp 3_ 1. 1_ 1sp 2_ 2sp 3_ 1I 1| 2_ 1` 2- 2_ 1. 1_ 1sp 2_ 2sp 1_ nl 2sp 1sQ 1~ 5sp 1~ 2sp 1sQ 1~ 3sp 2: 2sp 2~ 2sQ 4sp 1~ 2sp 2~ nl 17sp 2: nl 17sp 1. 1: nl 18sp 1. nl 2sp 32~\n";

    public final static String EXPECTED_10 = "    __\n  .^o ~\\\n Y /'~) }      _____\n l/  / /    ,-~     ~~--.,_\n    ( (    /  ~-._         ^.\n     \\ '--'--.    '-._       \\\n      '-.________     ~--.,__ ^.\n                '~r-.,___.-'-. ^.\n                 YI    \\      ~-.\\\n                 ||     \\        `\\\n                 ||     //\n                 ||    //\n                 ()   //\n                 ||  //    ~Fran\n                 || ( c\n    ___._ __  ___I|__`--__._ __  _\n  '~     ~  '~   ::  ~~''    ~  ~~\n                 ::\n                 .:\n                  .\n  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

}