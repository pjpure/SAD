package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends  HealthcareWorkerDecorator{

    public TimeLoggingHealthcareWorker(HealthcareWorker worker){
        super(worker);
        System.out.println("Decorate "+super.getName()+" with TimeLogging.");
    }

    @Override
    public void service(){
        Date date = new Date();
        System.out.print(date.toString()+": ");
        super.service();
    }

}
