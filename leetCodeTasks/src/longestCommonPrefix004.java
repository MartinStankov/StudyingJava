import java.util.HashMap;

public class longestCommonPrefix004 {
    public static void main(String[] args ){
        longestCommonPrefix004 longestPrefix = new longestCommonPrefix004();
        System.out.println(longestPrefix.longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            //The opposite of startsWith - it checks if the string at position i does not start
            //with the current prefix
//            while (strs[i].indexOf(prefix) != 0){
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) {
//                    return "";
//                }
//            }
            //Simpler to understand
            while (!strs[i].startsWith(prefix)){
                //Cuts the string from the 0 index to the last - 1
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
