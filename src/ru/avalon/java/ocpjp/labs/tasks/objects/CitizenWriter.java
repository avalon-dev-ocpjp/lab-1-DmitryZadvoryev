package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

public class CitizenWriter implements ObjectWriter<Citizen>{

    @Override
    public void write(Citizen citizen) throws IOException {
        System.out.println(citizen.toString());
    }

    @Override
    public void close() throws IOException {
    }
    
    
    
}
