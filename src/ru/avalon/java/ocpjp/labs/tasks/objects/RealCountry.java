package ru.avalon.java.ocpjp.labs.tasks.objects;

public class RealCountry implements Country{
    
    private String code;
    private String name;

    public RealCountry(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
        
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return code + ":" + name;
    }

    
}
