package string2;

public class String2 {

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result+=str.charAt(i)+str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)=='h' && str.charAt(i+1)=='i'){
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' &&
                    str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, (i + 3)).equals("xyz")){
                if(i==0 || str.charAt(i-1)!='.'){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == 'b' &&
                    str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');
        return lastY >= lastX;
    }

    public String mixString(String a, String b) {
        String result = "";
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }
        if (a.length() > b.length()) {
            result = result + a.substring(minLength);
        } else {
            result = result + b.substring(minLength);
        }
        return result;
    }

    public String repeatEnd(String str, int n) {
        String result = "";
        String end = str.substring(str.length()-n);
        for (int i = 0; i < n; i++) {
            result=result+end;
        }
        return result;
    }

    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = n ;i>0; i--) {
            result = result + str.substring(0,i);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for (int i = 0; i < count ; i++) {
            if (i>0){
                result = result+sep;
            }
            result = result+word;
        }
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);
    }

    public boolean xyzMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = str.length() - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == -1 || first == last) {
            return "";
        }
        return str.substring(first + 5, last);
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        String res = "";
        for (int i = 0; i + 2 < str.length(); i+= 3) {
            res = res + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
        }
        return res;
    }

    public String zipZap(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i<str.length()-2 &&
                    str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
                res = res + "zp";
                i = i+2;
            } else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }

    public String starOut(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*'){
                continue;
            }
            if (i>0 && str.charAt( i-1) == '*'){
                continue;
            }
            if (i<str.length()-1 && str.charAt(i+1) == '*'){
                continue;
            }
            res = res + str.charAt(i);
        }
        return res;
    }

    public String plusOut(String str, String word) {
        String res = "";
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - word.length() &&
                    str.substring(i, i + word.length()).equals(word)) {
                res = res + word;
                i = i + word.length();
            } else {
                res = res + "+";
                i++;
            }
        }
        return res;
    }

}
