package string1;

public class String1 {

    public String helloName(String name) {
        return  "Hello " + name + '!';
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return '<' + tag + '>' + word + "</" + tag + '>';
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        return str.substring(str.length()-2,str.length()) +
                str.substring(str.length()-2,str.length()) +
                str.substring(str.length()-2,str.length());
    }

    public String firstTwo(String str) {
        if (str.length()<=2){
            return str;
        }
        return str.substring(0,2);
    }

    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public String comboString(String a, String b) {
        String result = "";
        if (a.length() < b.length()){
            result = a + b +a;
        } else if (b.length()<a.length()) {
            result = b+a+b;
        }
        return result;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        String first = str.substring(0,2);
        String last = str.substring(2);
        return last + first;
    }

    public String right2(String str) {
        String last = str.substring(str.length()-2);
        String first = str.substring(0,str.length()-2);
        return last+first;
    }

    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }

    public String withoutEnd2(String str) {
        String result = "";
        if (str.length()<=2){
            result = "";
        } else {
            result = str.substring(1,str.length()-1);
        }
        return result;
    }

    public String middleTwo(String str) {
        return str.substring(((str.length())/2)-1,((str.length())/2)+1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        String first = str.substring (0,(str.length()-1)/2);
        return str.substring(first.length()-1,first.length()+2);
    }

    public boolean hasBad(String str) {
        if (str.length() >=3 && str.substring(0,3).equals("bad")){
            return true;
        }
        return str.length() >= 4 && str.substring(1, 4).equalsIgnoreCase("bad");
    }
}
