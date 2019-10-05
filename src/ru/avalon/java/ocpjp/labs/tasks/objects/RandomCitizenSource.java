package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

public class RandomCitizenSource implements Iterable<Citizen>{

    private static Random random = new Random();
    private List<Citizen> source;
        
    private RandomCitizenSource(Factory<Citizen> factory){
        source = new ArrayList();
        int n = random.nextInt(10) + 10;
        for (int i = 0; i < n; i++) {
            source.add(factory.create());
        }
    }
       
    @Override
    public Iterator<Citizen> iterator() {
        return source.iterator();
    }
    
    public static RandomCitizenSource getInstance(Factory<Citizen> factory){
        return new RandomCitizenSource(factory);
    }
    
    
}
