package FrequencyWords;

import org.apache.commons.math3.ml.neuralnet.MapUtils;

import java.util.*;
//import java.util.Map;

/**
 * Created by lwan on 25/07/2017.
 */
public class FrequencyWord {


    //String str="the day is sunny the the the sunny is is";

    public String[] splitStr(String strTxt) {
        String regex = " +";
        String[] words = strTxt.split(regex);
        return words;
    }

    public Map<String, Integer> calculateWordNum(String[] words) {
        Map<String, Integer> word = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; ++i) {
            if (word.containsKey(words[i])) {
                word.put(words[i], (word.get(words[i])) + 1);
            }
            else
                word.put(words[i],  1);
        }

        return word;
    }



    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }


}





