package calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Decorator(new Calculator(primaryArg), new LoggerTerminal());
    }

}
