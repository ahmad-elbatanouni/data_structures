 public class Double_Ended_LL_Test {
    public static void main(String[] args) {
        Double_Ended_LL list = new Double_Ended_LL();
        list.insertFirst(5);
        list.insertLast(2);
        list.insertFirst(8);            // 8, 5, 2
        list.deleteFirst();				// 5, 2
        list.printList();
    }
}
