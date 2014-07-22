package SRM144.DIV2;

/**
 * SRM 144 DIV 2 200 point
 * Given number of seconds, output hh:mm:ss
 * http://community.topcoder.com/stat?c=problem_statement&pm=1708
 */
public class Time {
    public String whatTime(int seconds)
    {
//another way to do it
//        int hour;
//        int minute;
//        int second;
//
//        hour = seconds / (60 * 60);
//        minute = (seconds - (3600 * hour)) / 60;
//        second = seconds - ((3600 * hour) + (60 * minute));
//        return hour+":"+minute+second;
        return (seconds / 3600)+":"+(seconds % 3600)/60+":"+seconds%60;
    }
}
