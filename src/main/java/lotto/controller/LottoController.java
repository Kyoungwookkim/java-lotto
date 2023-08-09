package lotto.controller;

import lotto.Lotto;
import lotto.LottoGenerator;

import lotto.view.View;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    private final View view;

    private final LottoGenerator lottoGenerator;

    public LottoController() {
        this.view = new View();
        this.lottoGenerator = new LottoGenerator();
    }


    public void buy(){
        int money = view.takeMoney();
        int lottoCnt =  lottoGenerator.countLotto(money);
        view.printLottoCount(lottoCnt);
        List<Lotto> lottos =  lottoGenerator.creatLotto();
        view.printLottoNumber(lottos);
    }

    public void winCkeck(){
        int winNumber = view.winNumber();
        int bonusNumber = view.bonusNumber();

    }


}
