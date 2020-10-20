package com.training.java.patterns.chain;


public abstract class AbstractProcess implements IProcess {

    private final AbstractProcess next;

    public AbstractProcess(final AbstractProcess nextParam) {
        super();
        this.next = nextParam;
    }

    @Override
    public void execute(final int valueParam) {
        if (!this.process(valueParam)) {
            if (this.next != null) {
                this.next.execute(valueParam);
            }
        }
    }

    abstract boolean process(int value);

}
