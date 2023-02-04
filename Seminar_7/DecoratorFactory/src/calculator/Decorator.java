package calculator;

public class Decorator implements Calculable{
    private Calculable calc;
    private Loggerable logger;


    public Decorator(Calculable calc, Loggerable logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        Calculable res = calc.sum(arg);
        logger.logg("Get summ");
        return res;
    }

    @Override
    public Calculable multi(int arg) {
        Calculable res = calc.multi(arg);
        logger.logg("Get multi");
        return res;
    }

    @Override
    public int getResult() {
        int res = calc.getResult();
        logger.logg("Get result");
        return res;
    }



    
}
