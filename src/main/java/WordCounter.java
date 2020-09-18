
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {

    public int getWordCount(String sentence) {

        sentence = ignorePunctuationsExceptApostrophes(sentence);
        String[] strArray = sentence.split("\\s+");
        Map<String, String> hMap = new LinkedHashMap<String, String>();
        for (int i = 0; i < strArray.length; i++) {
            if (!hMap.containsKey(strArray[i])) {
                hMap.put(strArray[i], "Unique");
            }
        }
        return hMap.size();
    }

    public String ignorePunctuationsExceptApostrophes(String sentence) {
        sentence = sentence.replaceAll("[\\W&&[^']]", " ").toLowerCase();
        return sentence;
    }
}