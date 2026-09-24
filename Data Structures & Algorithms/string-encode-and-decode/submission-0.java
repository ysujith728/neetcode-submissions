class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('/').append(s);
        }
        String encoded_string = sb.toString();
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('/', i);
            int len = Integer.parseInt(str.substring(i, slash));
            i = slash + 1;
            decoded_strs.add(str.substring(i, i + len));
            i += len;
        }
        return decoded_strs;
    }
}
