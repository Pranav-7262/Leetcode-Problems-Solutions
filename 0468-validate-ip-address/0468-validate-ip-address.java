class Solution {
    public String validIPAddress(String queryIP) {
        if (queryIP.contains(".")) {
            return isIPv4(queryIP) ? "IPv4" : "Neither";
        } else if (queryIP.contains(":")) {
            return isIPv6(queryIP) ? "IPv6" : "Neither";
        }
        return "Neither";
    }

    private static boolean isIPv4(String str) {
        String[] parts = str.split("\\.", -1);
        if (parts.length != 4)
            return false;
        for (String part : parts) {
            if (part.length() == 0)
                return false;

            if (part.length() > 1 && part.charAt(0) == '0')
                return false;

            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false;
                }
            }
            try {
                int num = Integer.parseInt(part);
                if (num > 255) return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    private static boolean isIPv6(String str) {
        String[] parts = str.split(":", -1);
        if (parts.length != 8)
            return false;
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 4)
                return false;
            for (char ch : part.toCharArray()) {
                if (!isHexChar(ch))
                    return false;
            }
        }
        return true;
    }

    private static boolean isHexChar(char ch) {
        return Character.isDigit(ch) ||
               (ch >= 'a' && ch <= 'f') ||
               (ch >= 'A' && ch <= 'F');
    }
}