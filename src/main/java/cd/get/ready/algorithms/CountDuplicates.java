package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String, Integer> dupli = new HashMap<>();
        int duplicates = 0;
        for(String i: input){
            if(!dupli.containsKey(i))
                dupli.put(i, 1);
            else{
                int count = dupli.get(i);
                dupli.put(i, count + 1);
            }
        }

        for(String j: dupli.keySet()){
            if(dupli.get(j) > 1){
                duplicates++;
            }
        }
        return duplicates;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Map<Integer, Integer> dupli = new HashMap<>();
        int duplicates = 0;
        for(int i: input){
            if(!dupli.containsKey(i))
                dupli.put(i, 1);
            else{
                int count = dupli.get(i);
                dupli.put(i, count + 1);
            }
        }

        for(int j: dupli.keySet()){
            if(dupli.get(j) > 1){
                duplicates++;
            }
        }
        return duplicates;
    }
}
