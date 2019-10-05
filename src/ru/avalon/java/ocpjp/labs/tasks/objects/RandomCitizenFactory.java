package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import ru.avalon.java.ocpjp.labs.common.Factory;

public class RandomCitizenFactory implements Factory<Citizen> {

    private static RandomCitizenFactory factory;

    private static final String COUNTRIES = "ru/avalon/java/ocpjp/labs/resources/countries.txt";
    private static final String FIRST_NAMES = "ru/avalon/java/ocpjp/labs/resources/first-names.txt";
    private static final String LAST_NAMES = "ru/avalon/java/ocpjp/labs/resources/last-names.txt";

    private final List<Country> countres = new ArrayList();
    private final List<String> names;
    private final List<String> lastNames;

    private static Random random;

    static {
        factory = new RandomCitizenFactory();
    }

    private RandomCitizenFactory() {
        random = new Random();
        names = getTextFromResources(FIRST_NAMES);
        lastNames = getTextFromResources(LAST_NAMES);
        for (String line : getTextFromResources(COUNTRIES)) {
            Country country = getCountry(line);
            if (country != null) {
                countres.add(country);
            }
        }

    }

    @Override
    public Citizen create() {

        return new RealCitizen(
                countres.get(random.nextInt(countres.size())),
                names.get(random.nextInt(names.size())),
                lastNames.get(random.nextInt(lastNames.size()))
        );
    }

    private static List<String> getTextFromResources(String path) {
        List<String> lines = null;
        try (InputStream in = ClassLoader.getSystemResourceAsStream(path);
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            lines = br.lines().collect(Collectors.toList());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return lines;

    }

    private static Country getCountry(String line) {
        Pattern countryPattern = Pattern.compile("([A-Z]{2}):(.+)");
        Matcher matcher = countryPattern.matcher(line.trim());
        if (matcher.find()) {
            return new RealCountry(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    public static RandomCitizenFactory getInstance() {
        return factory;
    }

}
