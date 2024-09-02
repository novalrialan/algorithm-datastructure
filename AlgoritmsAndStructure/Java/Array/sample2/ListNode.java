package Array.sample2;

// /**
//  * ListNode
//  */
// public class ListNode {

//     String player;
//     ListNode next;

//     public ListNode(String player,ListNode next){
//         this.player = player;
//         this.next = next;
//     }

//     public void setNext(ListNode next){
//         this.next = next;
//     }

//     @Override
//     public String toString() {
//         StringBuilder result = new StringBuilder();
//         ListNode current = this;
//         while (current != null) {
//             result.append("[").append(current.player).append("] -> ");
//             current = current.next;
//         }
//         result.append("null");
//         return result.toString();
//     }


//     public static void main(String[] args) {
//         ListNode l4 = new ListNode("Messi", null);
//         ListNode l3 = new ListNode("Steph Curry", l4);
//         ListNode l2 = new ListNode("Ronaldo", l3);
//         ListNode l1 = new ListNode("Michael Jordan", l2);

//         ListNode temp = l1;

//         // null [Garnett] -> [Messi] -> [S-Curry]-> [Ronaldo] -> [M-Jordan] -> null
//         //                                                          temp

//         // insert at end of LinkedList 
//         ListNode l5 = new ListNode("Granatee", null);

//         while (temp != null) {
//             if (temp.next == null) {
//                 temp.next = l5;
//                 break;
//             }
//             temp = temp.next;
//         }

//         System.out.println("Insert Garnett at the End");
//         System.out.println(l1.toString());
//         l4.setNext(null);
//         temp = l1;


//         // insert at index after M Jordan
//         while (temp != null) {
//             if (temp.player.equals("Michael Jordan")) {
//                 l5.setNext(temp.next);
//                 temp.setNext(l5);
//             }
//             temp = temp.next;
            
//         }

//         System.out.println();
//         System.out.println("Insert Garnett after Michael Jordan");
//         System.out.println(l1.toString());
//     }
// }


class ListNode {
    String player;
    ListNode next;

    public ListNode(String player, ListNode next) {
        this.player = player;
        this.next = next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            result.append("[").append(current.player).append("] -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }

    public static void main(String[] args) {
        // Creating the initial linked list
        ListNode l4 = new ListNode("Messi", null);
        ListNode l3 = new ListNode("Steph Curry", l4);
        ListNode l2 = new ListNode("Ronaldo", l3);
        ListNode l1 = new ListNode("Michael Jordan", l2);

        ListNode temp = l1;

        // Insert at the end of the LinkedList
        ListNode l5 = new ListNode("Garnett", null);

        while (temp != null) {
            if (temp.next == null) {
                temp.next = l5;
                break;
            }
            temp = temp.next;
        }

        System.out.println("Insert Garnett at the End");
        System.out.println(l1.toString());
        l4.setNext(null);
        temp = l1;


        // Insert after "Michael Jordan"
        while (temp != null) {
            if (temp.player.equals("Michael Jordan")) {
                l5.setNext(temp.next);
                temp.setNext(l5);
                break;
            }
            temp = temp.next;
        }

        System.out.println();
        System.out.println("Insert Garnett after Michael Jordan");
        System.out.println(l1.toString());


    //  Explanation :
    // Initial List Creation:
    //     l4: ["Messi"]
    //     l3: ["Steph Curry"] -> ["Messi"]
    //     l2: ["Ronaldo"] -> ["Steph Curry"] -> ["Messi"]
    //     l1: ["Michael Jordan"] -> ["Ronaldo"] -> ["Steph Curry"] -> ["Messi"]

    // Inserting at the End:
    //     We traverse the list until the last node (Messi) is found, and then set its next pointer to point to the new node (Garnett).
    //     After insertion, the list becomes:
    //         ["Michael Jordan"] -> ["Ronaldo"] -> ["Steph Curry"] -> ["Messi"] -> ["Garnett"]

    // Inserting after "Michael Jordan":
    //     A new node (l6) is created to insert after "Michael Jordan".
    //     After insertion, the list becomes:
    //         ["Michael Jordan"] -> ["Garnett"] -> ["Ronaldo"] -> ["Steph Curry"] -> ["Messi"] -> 
    }
}


