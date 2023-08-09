package lotto;

import lotto.controller.LottoController;
import lotto.view.InputReader;
import lotto.view.OutputPrinter;
import lotto.view.View;

public class LottoSystem {

    private final LottoController lottoController;

    public LottoSystem() {
        this.lottoController = new LottoController();
    }

    public void run(){
        lottoController.buy();
        lottoController.winCkeck();
    }
}
