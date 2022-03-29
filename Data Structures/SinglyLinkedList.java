public class SinglyLinkedList {
     Node head = null;
     
    
    public SinglyLinkedList() {
    
    }

    public void insert(int data) {
        Node in_node = new Node(data);
        if (this.head == null) {
            this.head = in_node;
        }
        else {
            Node curr = this.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = in_node;            
        }
    }

    public void delete(int d) {
        if (this.head.data == d) {
            this.head = this.head.next;
        } 
        else {
	        Node curr = this.head;
	        Node prev = this.head;
	        while (curr != null && curr.data != d) {
	            curr = curr.next;
	            // System.out.println(curr.data);
	            // System.out.println(prev.data);            
	            if (curr.data == d) {
	                prev.next = curr.next;
	            }
	            prev = prev.next;
	        }        	
        }


    }


    public static void main(String[] args) {
        SinglyLinkedList my_list = new SinglyLinkedList();
        my_list.insert(40);
        my_list.insert(50);
        my_list.insert(60);
        my_list.insert(22);
        my_list.delete(50);

        for (Node curr = my_list.head; curr != null; curr = curr.next) {
            System.out.println(curr.data);

        }


    }
}