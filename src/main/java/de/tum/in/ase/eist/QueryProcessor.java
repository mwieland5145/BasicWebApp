package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "moritz";
        } else if (query.contains("plus")) {

            String[] test = query.split(" ");

            int sum = 0;

            for (String word : test) {
                try {
                     int intOfWord = Integer.parseInt(word);
                    sum += intOfWord;
                } catch (Exception a) {
                    //
                }

            }
            return String.valueOf(sum);

        }
        return "";
    }
}
