/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode * mergeList1 = new ListNode();
        ListNode * mergeList = mergeList1;
        while(list1 != NULL && list2 != NULL){
            if(list1->val < list2->val){
                mergeList->next = list1;
                list1 = list1->next;
                mergeList = mergeList->next;
            }
            else {
                mergeList->next = list2;
                list2 = list2->next;
                mergeList = mergeList->next;
            }
        }
        while(list1 != NULL){
            mergeList->next = list1;
            list1 = list1->next;
            mergeList = mergeList->next;
        }
        while(list2 != NULL){
            mergeList->next = list2;
            list2 = list2->next;
            mergeList = mergeList->next;
        }
      return mergeList1->next;  
    }
};