package FrequencyWords;

import org.apache.commons.math3.ml.neuralnet.MapUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//import java.util.Map;

/**
 * Created by lwan on 25/07/2017.
 */
public class FrequencyWord {


    //String str="the day is sunny the the the sunny is is";
    public String readFileTxt(String fileAddress) throws IOException {

        StringBuilder strTxt=new StringBuilder();
        try{
            BufferedReader BR=new BufferedReader(new FileReader(fileAddress));
            String line=BR.readLine();
            while (line!=null){
                strTxt.append(line);
                strTxt.append("\n");
                line=BR.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return strTxt.toString();


    }




    public String[] splitStr(String strTxt) {
        String regex = "\\s+";
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

    public String printFrequencyWordsResult(Map<String, Integer> wordMassege){
        String result="";
        Set<Map.Entry<String,Integer>> sets=wordMassege.entrySet();
        for(Map.Entry<String ,Integer> set:sets)
            result+=set.getKey()+" "+set.getValue()+"\n";

        return result;

    }

}





