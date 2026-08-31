
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        List<Integer> list = new ArrayList<>();
        ListNode prev = head;
        ListNode temp = head.next;
        ListNode nextNode = temp.next;
        int cnt = 1;
        while (nextNode != null) {
            if (((temp.val < prev.val) && (nextNode.val > temp.val)) ||
                    ((temp.val > prev.val) && (nextNode.val < temp.val))) {
                list.add(cnt);
            }
            cnt += 1;
            prev = temp;
            temp = nextNode;
            nextNode = nextNode.next;

        }
        if (list.size() < 2) {
            return new int[] { -1, -1 };
        }
        int maxima = list.get(list.size() - 1) - list.get(0);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            minDiff = Math.min(minDiff, list.get(i+1) - list.get(i));
        }
        return new int[] { minDiff, maxima };
    }
}
