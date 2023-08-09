package lotto.view;

import lotto.Lotto;

import java.util.Arrays;
import java.util.List;

public class OutputPrinter {
    public void printPayMoneyMessage(){
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void printBuyLottoCount(int lottoCnt){
        System.out.printf("%d 개를 구매했습니다 %n", lottoCnt);
    }

    public void printLottolist(List<Lotto>lottos){

        for (Lotto lotto : lottos) {
            System.out.println(lotto.toString());
        }

    }
    public void printWinNumberMessage(){
        System.out.println("당첨번호를 입력해주세요.");
    }

    public void printBonusNumberMessage(){
        System.out.println("보너스 번호를 입력해 주세요");
    }


}
