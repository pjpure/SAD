package edu.parinya.softarchdesign.structural;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam(){
        members = new LinkedHashSet<>();
    }

    public void addMember(HealthcareServiceable member){
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member){
        members.remove(member);
    }

    @Override
    public void service() {
        for(HealthcareServiceable member : members){
            member.service();
        }
    }

    @Override
    public double getPrice() {
        Double allPrice=0.0;
        for(HealthcareServiceable member:members){
            allPrice+=member.getPrice();
        }
        return  allPrice;
    }




}
