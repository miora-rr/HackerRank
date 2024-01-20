import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockAndValidString {
    public static String isValid(String s) {
        if (s.length() == 1) return "YES";

        Map<Character, Long> letterFrequencyMap = s.chars()
                .filter(Character::isLetter)
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //Sort the letterFrequencyMap
        List<Long> sortedFrequencies = letterFrequencyMap.values().stream()
                .sorted()
                .collect(Collectors.toList());

        int first =  sortedFrequencies.get(0).intValue();
        int second = sortedFrequencies.get(1).intValue();
        int secondLast = sortedFrequencies.get(sortedFrequencies.size()-2).intValue();
        int last = sortedFrequencies.get(sortedFrequencies.size()-1).intValue();

        // If the first and last elements of the list are the same, it means that all the frequencies are equals
        if (first == last) return "YES";

        // The first element frequency can be different from the others but the frequencies of the rest should be the same ex: [1,2,2,2]
        if (first == 1 && second == last) return "YES";

        // All the frequencies are the same but the last is different. The last can at most be different by 1 from the others. Example [2,2,2,3]
        if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";

        return "NO";

    }

    public static void main(String[] args) {
        System.out.println(isValid("hyzzeohdidavrazjqqjfyulkoutdkywsyvrdlaitdirxkqicitijovtcpphcndwmzppmpziujzrtrcvavfjlceputwwhauvbjmnylvuuwopoqkonszzwdoqznognidorpbrazmwvaljsxzfpagmgxefktnxdqlvfoohnaflcquwnwcfwktchxhrsuqwmdtruhajkfumxplllnsjzlmjkvafqtdcywwsfycpewebnpoaegkftyoetrjjkookkmdrkhjodpstggtmpfridgoxxzijnwtziyrtfcjlrbexkxjzfcjiiafhzospmooxmhqsjzdadjzpiionnzyvzdfbtxqingfaqvuzwzcbkbqsmggziewjjbkfbcnqlsqbpmannerxghquqyvyerhpvuwywjojdhkutnkjrbizkavayqaekiwfesdaermjawgwjqfdtnefoaiosivcsrhwlmzpglbgjhctzjyuzeznehdzqybkrlhfxiwftxmceqxfcxzbczqigthyujjnusstapzvmnztfzahwaiabyjjusiqdtdznytnpukdjjyokzwhbgjehsndnxtqsyqfyjunferoqpcaqajtjtxsnlvakqrdqhipsfexjvnznrcfslzdewvujsuuilxyuhpomunyrazgsbmmplrthmnrekloxkouteiiawgryhyqjmeyxvtejjxpvkdswumqavaatgtrntkyfqycmujxdinytsspmfhmchmxpiqfdafjtenhyyedhrbcmvtyadlemzdcjujnuownulwsmbxvuyxgwshyvudktgmfcxsxnqmidlcpmakgajpwcwvzqajlixqlwkkkaysgjuvvugevrvtttovjoewzepkazwkcueiezfbvlhsdemyxctgtafsguegvatxuzhaynewanqfscephzyabduhzyqualuukbxlodhrqzwieaalcynddhnefdyfqsbawalmdudwuagycglegyklfxpmcq"));
    }
}
