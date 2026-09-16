class Solution {
public:
    ListNode* addTwoNumbers(ListNode* a, ListNode* b) {
        ListNode d(0), *p = &d;
        int c = 0;
        while (a || b || c) {
            int s = c + (a ? a->val : 0) + (b ? b->val : 0);
            c = s / 10;
            p = p->next = new ListNode(s % 10);
            if (a) a = a->next;
            if (b) b = b->next;
        }
        return d.next;
    }
};