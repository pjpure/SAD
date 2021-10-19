package edu.parinya.softarchdesign.structural;

import org.w3c.dom.ls.LSOutput;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate "+super.getName()+" with TaxPaying.");
    }

    @Override
    public double getPrice(){
        return super.getPrice()*1.1;
    }
}
