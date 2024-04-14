import java.util.*;

public class Apriori {
    
    public static void main(String[] args) {
        List<Set<String>> transactions = new ArrayList<>();
        transactions.add(new HashSet<>(Arrays.asList("bread", "milk", "butter")));
        transactions.add(new HashSet<>(Arrays.asList("bread", "milk", "cheese")));
        transactions.add(new HashSet<>(Arrays.asList("milk", "butter")));
        transactions.add(new HashSet<>(Arrays.asList("bread", "milk", "butter")));
        transactions.add(new HashSet<>(Arrays.asList("bread", "cheese")));
        
        int minSupportCount = 2;
        
        List<Set<String>> frequentItemsets = generateFrequentItemsets(transactions, minSupportCount);
        
        System.out.println("Frequent Itemsets:");
        for (Set<String> itemset : frequentItemsets) {
            System.out.println(itemset);
        }
    }
    public static List<Set<String>> generateFrequentItemsets(List<Set<String>> transactions, int minSupportCount) {
        List<Set<String>> frequentItemsets = new ArrayList<>();
        Map<Set<String>, Integer> candidateItemsets = new HashMap<>();
        Map<String, Integer> itemSupportCounts = new HashMap<>();
        for (Set<String> transaction : transactions) {
            for (String item : transaction) {
                itemSupportCounts.put(item, itemSupportCounts.getOrDefault(item, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : itemSupportCounts.entrySet()) {
            if (entry.getValue() >= minSupportCount) {
                Set<String> itemset = new HashSet<>();
                itemset.add(entry.getKey());
                frequentItemsets.add(itemset);
                candidateItemsets.put(itemset, entry.getValue());
            }
        }
        int k = 2;
        while (!candidateItemsets.isEmpty()) {
            Map<Set<String>, Integer> frequentCandidates = new HashMap<>();
            Set<Set<String>> candidateSet = generateCandidates(candidateItemsets.keySet(), k);
            for (Set<String> transaction : transactions) {
                for (Set<String> candidate : candidateSet) {
                    if (transaction.containsAll(candidate)) {
                        frequentCandidates.put(candidate, frequentCandidates.getOrDefault(candidate, 0) + 1);
                    }
                }
            }   
            candidateItemsets.clear();
            for (Map.Entry<Set<String>, Integer> entry : frequentCandidates.entrySet()) {
                if (entry.getValue() >= minSupportCount) {
                    candidateItemsets.put(entry.getKey(), entry.getValue());
                    frequentItemsets.add(entry.getKey());
                }
            }
            
            k++;
        }  
        return frequentItemsets;
    }
    public static Set<Set<String>> generateCandidates(Set<Set<String>> itemsets, int k) {
        Set<Set<String>> candidates = new HashSet<>();
        for (Set<String> itemset1 : itemsets) {
            for (Set<String> itemset2 : itemsets) {
                if (isJoinable(itemset1, itemset2, k)) {
                    Set<String> candidate = new HashSet<>(itemset1);
                    candidate.addAll(itemset2);
                    if (candidate.size() == k) {
                        candidates.add(candidate);
                    }
                }
            }
        }  
        Set<Set<String>> prunedCandidates = new HashSet<>();
        for (Set<String> candidate : candidates) {
            if (hasInfrequentSubset(candidate, itemsets)) {
                prunedCandidates.add(candidate);
            }
        }
        
        return prunedCandidates;
    } 
    public static boolean isJoinable(Set<String> itemset1, Set<String> itemset2, int k) {
        List<String> list1 = new ArrayList<>(itemset1);
        List<String> list2 = new ArrayList<>(itemset2);
        Collections.sort(list1);
        Collections.sort(list2);
        
        for (int i = 0; i < k - 2; i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }  
        return !list1.get(k - 2).equals(list2.get(k - 2));
    }
    public static boolean hasInfrequentSubset(Set<String> candidate, Set<Set<String>> itemsets) {
        List<String> list = new ArrayList<>(candidate);
        Set<Set<String>> subsets = new HashSet<>();
        
        generateSubsets(list, subsets);
        
        for (Set<String> subset : subsets) {
            if (!itemsets.contains(subset)) {
                return true;
            }
        }   
        return false;
    }
    public static void generateSubsets(List<String> list, Set<Set<String>> subsets) {
        int n = list.size();
        for (int i = 0; i < (1 << n); i++) {
            Set<String> subset = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(list.get(j));
                }
            }
            if (!subset.isEmpty()) {
                subsets.add(subset);
            }
        }
    }
}
