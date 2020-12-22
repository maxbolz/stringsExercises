public class Main {

    public static String scroll(String s) {

        return s.substring(1) + s.charAt(0);

    }

    public static String convertName(String s) {

        String first = s.substring(s.indexOf(",") + 2);
        String last = s.substring(0, s.indexOf(","));
        return first + " " + last;

    }

    public static String negativeString(String s) {

        s = s.replace("0", "2");
        s = s.replace("1", "0");
        s = s.replace("2", "1");
        return s;

    }

    public static String convertDate(String dateStr) {

        return(dateStr.substring(3,5) + "-" + dateStr.substring(0,2) + "-" + dateStr.substring(6));

    }

    public static String convertDate2(String datStr) {

        String month = datStr.substring(0,datStr.indexOf("/"));
        String day = datStr.substring(datStr.indexOf("/") + 1, datStr.lastIndexOf("/"));
        String year = datStr.substring(datStr.lastIndexOf("/") + 1);

        if(day.length()==1) day = "0" + day;
        if(month.length()==1) month = "0" + month;

        return (day + "-" + month + "-" + year);

    }

    public static boolean startsWith(String s, String prefix) {

        return s.indexOf(prefix) == 0;

    }

    public static boolean endsWith(String s, String suffix) {

        return s.indexOf(suffix) == s.length()-suffix.length();

    }

    public static String removeTag(String s, String tag) {

        String t1 = "<" + tag + ">";
        String t2 = "</" + tag + ">";
        String temp = s;

        if (s.contains(t1) && s.contains(t2) && s.indexOf(t1) < s.indexOf(t2)) {
            temp = s.replace(t1, "");
            temp = temp.replace(t2, "");
        }
        return temp;
    }

    public static void main (String [] args){

        System.out.println("\nScroll:");
        System.out.println("'hello' -> " + (scroll("hello")));
        System.out.println("'ice cream' -> " + (scroll("ice cream")));
        System.out.println("'hi' -> " + (scroll("hi")));

        System.out.println("\nConvert Name:");
        System.out.println("'Bolz, Max' -> " + convertName("Bolz, Max"));
        System.out.println("'Trump, Donald' -> " + convertName("Trump, Donald"));
        System.out.println("'Reubenstein, Lori' -> " + convertName("Reubenstein, Lori"));

        System.out.println("\nNegative String:");
        System.out.println("'010101010101' -> " + negativeString("010101010101"));
        System.out.println("'00000' -> " + negativeString("00000"));
        System.out.println("'11110' -> " + negativeString("11110"));

        System.out.println("\nConvert Date:");
        System.out.println("'05/21/2004' -> " + convertDate("05/21/2004"));
        System.out.println("'12/25/2020' -> " + convertDate("12/25/2020"));
        System.out.println("'12/12/2012' -> " + convertDate("12/12/2012"));

        System.out.println("\nConvert Date 2:");
        System.out.println("'5/21/2004' -> " + convertDate2("5/21/2004"));
        System.out.println("'12/1/2036' -> " + convertDate2("12/1/2036"));
        System.out.println("'1/1/2021' -> " + convertDate2("1/1/2021"));

        System.out.println("\nStarts With:");
        System.out.println("'architecture' starts with 'arch': " + startsWith("architecture", "arch"));
        System.out.println("'architecture' starts with 'a': " + startsWith("architecture", "a"));
        System.out.println("'arch' starts with 'architecture': " + startsWith("arch", "architecture"));
        System.out.println("'architecture' starts with 'rch': " + startsWith("architecture", "rch"));
        System.out.println("'architecture' starts with 'architecture': " + startsWith("architecture", "architecture"));

        System.out.println("\nEnds With:");
        System.out.println("'astronomy' ends with 'nomy': " + endsWith("astronomy", "nomy"));
        System.out.println("'astronomy' ends with 'y': " + endsWith("astronomy", "y"));
        System.out.println("'astronomy' ends with 'nom': " + endsWith("astronomy", "nom"));
        System.out.println("'nomy' ends with 'astronomy': " + endsWith("nomy", "astronomy"));
        System.out.println("'astronomy' ends with 'astronomy': " + endsWith("astronomy", "astronomy"));

        System.out.println("\nRemove Tag:");
        System.out.println("'<b>Hello World</b>' -> " + removeTag("<b>Hello World</b>","b"));
        System.out.println("'Hello World</b>' -> " + removeTag("Hello World</b>","b"));
        System.out.println("'<b>Hello World' -> " + removeTag("<b>Hello World","b"));
        System.out.println("'</b>Hello World<b>' -> " + removeTag("</b>Hello World<b>","b"));
        System.out.println("'Happy Birthday <b>Hello World</b>' -> " + removeTag("Happy Birthday <b>Hello World</b>","b"));
        System.out.println("'<b>Hello World</b> Happy Birthday' -> " + removeTag("<b>Hello World</b> Happy Birthday","b"));
        System.out.println("'Happy <b>Hello World</b> Birthday' -> " + removeTag("Happy <b>Hello World</b> Birthday","b"));

    }

}
