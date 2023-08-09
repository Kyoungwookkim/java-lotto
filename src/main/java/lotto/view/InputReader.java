package lotto.view;

import java.util.Scanner;

public class InputReader {
    Scanner in = new Scanner(System.in);
    public int inputMoney() {
        int money = in.nextInt();
        return money;
    }

    public int inputWinNumber(){
        int winNunber = in.nextInt();
        return winNunber;
    }

    public int inputBonusNumber(){
        int bonusNumer = in.nextInt();
        return bonusNumer;
    }

}

