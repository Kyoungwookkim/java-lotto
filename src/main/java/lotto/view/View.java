package lotto.view;

import lotto.Lotto;

import java.util.List;

public class View {
    private final InputReader inputReader;
    private final OutputPrinter outputPrinter;

    public View() {
        this.inputReader = new InputReader();
        this.outputPrinter = new OutputPrinter();
    }

    public int takeMoney(){
        outputPrinter.printPayMoneyMessage();
        return inputReader.inputMoney();
    }

    public void printLottoCount(int lottoCnt){

        outputPrinter.printBuyLottoCount(lottoCnt);
    }

    public void printLottoNumber(List<Lotto> lottos){
        outputPrinter.printLottolist(lottos);
    }
    public int winNumber(){
      outputPrinter.printWinNumberMessage();
      return inputReader.inputWinNumber();
    }
    public int bonusNumber(){
        outputPrinter.printBonusNumberMessage();
        return inputReader.inputBonusNumber();
    }
}
