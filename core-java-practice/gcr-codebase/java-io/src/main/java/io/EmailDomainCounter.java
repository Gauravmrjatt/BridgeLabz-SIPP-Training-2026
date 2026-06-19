package io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EmailDomainCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("emails.txt"));
        Map<String, Integer> domainCount = new HashMap<>();
        
        String email;
        while ((email = reader.readLine()) != null) {
            int atIndex = email.indexOf('@');
            if (atIndex != -1) {
                String domain = email.substring(atIndex + 1);
                domainCount.put(domain, domainCount.getOrDefault(domain, 0) + 1);
            }
        }
        
        reader.close();
        
        System.out.println("Email Domain Counts:");
        for (Map.Entry<String, Integer> entry : domainCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}