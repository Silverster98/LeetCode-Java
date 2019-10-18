package com.silvester.LCI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LC890
 */
public class LC890 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != pattern.length()) continue;

            Map<Character, Character> map = new HashMap<Character, Character>();
            int flag = 0;

            for (int index = 0; index < words[i].length(); index++) {
                if (map.get(pattern.charAt(index)) == null) {
                    if (map.containsValue(words[i].charAt(index))) {
                        flag = 1;
                        break;
                    }
                    map.put(pattern.charAt(index), words[i].charAt(index));
                } else {
                    if (map.get(pattern.charAt(index)) != words[i].charAt(index)) {
                        flag = 1;
                        break;
                    }
                }
            }

            if (flag == 1) continue;
            
            list.add(words[i]);
        }

        // for (String s: list) {
        //     System.out.println(s);
        // }
        return list;
    }
}