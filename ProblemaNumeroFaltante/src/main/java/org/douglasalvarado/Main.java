package org.douglasalvarado;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Main");
        NumerousAntenatal numerousAntenatal = new NumerousAntenatal();

        Integer[] dates = {1,2,3,5,6,7,8,9,13};
        String menses = "Los números que faltan son: \n "+numerousAntenatal.getNumerousFantasises(dates);

        logger.info(menses);
    }
}