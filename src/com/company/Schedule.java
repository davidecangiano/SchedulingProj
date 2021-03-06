package com.company;

public class Schedule {
    protected SchedulingStrategy schedulingStrategy;
    public Schedule() {

        this.schedulingStrategy = null;
    }
    public void setSortStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }
    public void sort()
    {
        if (this.schedulingStrategy != null) {
            this.schedulingStrategy.schedule();
        }
    }
}
