class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty())
        {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (String s : strs)
        {
            int length = s.length();
            result.append(String.valueOf(length) + "~" + s);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> strings = new ArrayList<>();
        int i = 0;

        while (i < str.length())
        {
            int delimiterIndex = str.indexOf('~', i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            strings.add(str.substring(delimiterIndex + 1, delimiterIndex + 1 + length));
            i = delimiterIndex + 1 + length;
        }

        return strings;
    }
}
