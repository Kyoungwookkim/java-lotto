package lotto;

import camp.nextstep.edu.missionutils.*;
import lotto.controller.LottoController;
import lotto.view.View;

import java.util.ArrayList;
import java.util.List;

public class LottoGenerator {
    private int lottoCnt;

    public int countLotto(int money) {
        lottoCnt = money / 1000;
        return lottoCnt;
    }

    public List<Lotto> creatLotto(){
        List<Lotto> lottos = new ArrayList<>();

        for (int num = 0; num <= lottoCnt; num++){
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            lottos.add(new Lotto(numbers));
        }
        return lottos;
    }

}
