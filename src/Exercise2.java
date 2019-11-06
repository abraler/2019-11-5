import java.util.HashSet;

class Exercise2{
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public int numComponents(ListNode head, int[] G) {
            HashSet<Integer>hash=new HashSet<>();
            int num=0;
            for(int i:G)hash.add(i);
            ListNode cur=head;
            while(cur!=null){
                if(hash.contains(cur.val)&&hash.contains(cur.next.val)){
                    num++;
                }
                cur=cur.next;
            }
            return num;
        }
    }
}