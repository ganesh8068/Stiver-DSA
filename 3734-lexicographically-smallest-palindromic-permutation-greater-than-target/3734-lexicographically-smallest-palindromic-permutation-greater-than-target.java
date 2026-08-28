class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int[] a = new int[26];
        for (char ch : s.toCharArray()){
            a[ch - 'a']++;
        }
        char mid = '.';
        for (int i = 0; i < 26; i++){
            if ((a[i]&1) == 1){
                if (mid != '.')return "";
                mid = (char) (i + (int)'a');
            }
            a[i] /= 2;
        }
        StringBuilder str = new StringBuilder();
        int flag = 0;
        for (int i = 0; i < s.length() / 2; i++){
            char ch = target.charAt(i);
            if (flag == 0){
                boolean ok  = false;
                if (a[ch - 'a'] > 0){
                    a[ch - 'a']--;
                    str.append(ch);
                    continue;
                }
                for (int j = ch - 'a'; j < 26; j++){
                    if (a[j] > 0){
                        a[j]--;
                        ok =true;
                        str.append((char) (j + 'a'));
                        break;
                    }
                }
                if (ok){
                    flag = 1;
                    continue;
                }
                for (int j = i - 1; j >= 0 && !ok; j--){
                    for (int k = 0; k < 26; k++){
    
                        if (k > str.charAt(j) - 'a' && a[k] > 0){
                            a[str.charAt(j) - 'a']++;
                            str.setCharAt(j, (char) (k + 'a'));
                            a[k]--;
                            ok = true;
                            break;
                        }
                    }
                    if (ok){
                        i = j;
                        flag = 1;
                        // System.out.printf("%d ", i);
                        break;
                    }
                    a[str.charAt(j) - 'a']++;
                    str.deleteCharAt(str.length() - 1);
                }
                if (!ok)return "";

            }
            else {
                for (int j = 0; j < 26; j++){
                    if (a[j] > 0){
                        a[j]--;
                        str.append((char) (j + 'a'));
                        break;
                    }
                }
            }
            
        }
        StringBuilder con = palind(str, mid);
        if (comp(con, new StringBuilder(target)) == 1)return con.toString();
        next_perm(str);
        con = palind(str, mid);
        if (comp(con, new StringBuilder(target)) == 1)return con.toString();
        
        return "";

    }
    int comp(StringBuilder s1, StringBuilder s2){
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == s2.charAt(i))continue;
            return s1.charAt(i) < s2.charAt(i) ? -1 : 1;
        }
        return 0;
    }
    StringBuilder palind(StringBuilder s, char mid){
        StringBuilder con = new StringBuilder();
        con.append(s);
        if (mid != '.') con.append(mid);
        s.reverse();
        con.append(s);
        s.reverse();
        return con;
    }
    void swap(StringBuilder s, int i, int j){
        s.setCharAt(i, (char) (s.charAt(i) ^ s.charAt(j)));
        s.setCharAt(j, (char) (s.charAt(i) ^ s.charAt(j)));
        s.setCharAt(i, (char) (s.charAt(i) ^ s.charAt(j)));
    }
    void next_perm(StringBuilder s){
        int n = s.length();
        int pos = -1;
        for (int i = n -2; i >= 0; i--){
            if (s.charAt(i) < s.charAt(i + 1)){
                pos = i;
                break;
            }
        }
        if (pos == -1)return ;
        for (int i = n - 1; i >= 0; i--){
            if (s.charAt(i) > s.charAt(pos)){
                swap(s, i, pos);
                for (int j = pos + 1, r = n - 1; j < r; j++, r--){
                    swap(s, j, r);
                }

                break;
            }
        }
    }
}