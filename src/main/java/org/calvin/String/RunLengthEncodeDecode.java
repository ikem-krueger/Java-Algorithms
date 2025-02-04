package org.calvin.String;

public class RunLengthEncodeDecode {
    public String encode(String in) {
        char[] tracker = in.toCharArray();
        int count = 1;
        char prev = tracker[0];
        String result = "";
        for (int i = 1; i < tracker.length; i++) {
            if (tracker[i] == prev) {
                count++;
            } else {
                result += String.valueOf(count) + prev;
                count = 1;
                prev = tracker[i];
            }
        }
        result += String.valueOf(count) + prev;
        return in.length() > result.length() ? result : in;
    }

    public String decode(String in) {
        char[] tracker = in.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder nums = new StringBuilder();
        for (int i = 0; i < tracker.length; i++) {
            if (Character.isDigit(tracker[i])) {
                nums.append(tracker[i]);
            } else if (nums.length()>0) {
                int x = Integer.parseInt(nums.toString());
                while (x != 0) {
                    sb.append(tracker[i]);
                    x--;
                }
                nums = new StringBuilder();
            }
        }
        return sb.toString().isEmpty() ? in : sb.toString();
    }
}
