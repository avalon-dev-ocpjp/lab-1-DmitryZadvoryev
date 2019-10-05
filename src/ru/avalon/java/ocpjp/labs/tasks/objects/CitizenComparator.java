package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Comparator;

public class CitizenComparator implements Comparator<Citizen>{

    @Override
    public int compare(Citizen o1, Citizen o2) {
        
        int lastNameCompareResult = o1.getLastName().compareToIgnoreCase(o2.getLastName());
        if(lastNameCompareResult != 0) {
            return lastNameCompareResult;
        }
        
        int nameCompareResult = o1.getName().compareToIgnoreCase(o2.getName());
        if(nameCompareResult != 0){
            return nameCompareResult;
        }
        
        int codeContryCompareResult = o1.getCountry().getCode().compareToIgnoreCase(o2.getCountry().getCode()); 
        if(codeContryCompareResult != 0){
            return codeContryCompareResult;
        }
        
        int nameCountryCompareResult = o1.getCountry().getName().compareToIgnoreCase(o2.getCountry().getName());
        if(nameCountryCompareResult != 0){
            return nameCountryCompareResult;
        }
        
        return 0;
    }
    
    
}
