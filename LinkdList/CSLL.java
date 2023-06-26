public class CSLL {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircular(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=node;
        head=node;
        tail=node;
        this.size=1;

        return head;
    }
   public void insertionCircular(int nodeValue,int location){
        Node node=new Node();
        node.value=nodeValue;
        if(size==0 || head==null){
            createCircular(nodeValue);
            return;
        }
        if(location==0){
            node.next=head;
            head=node;
            tail.next=node;
        }
        else if(location>=size){
            tail.next=node;
            tail=node;
            tail.next=head;
        }
        else {
            Node tempNode=head;
            int i=0;
            while(i<location-1){
                tempNode=tempNode.next;
                i++;
            }
            Node currNode=tempNode.next;
            tempNode.next=node;
            node.next=currNode;
        }
        size++;
   }
   public void traversingCircular(){ //to prevent infinite loop we are using size property
       if(head==null) {
           System.out.println("create the list first ");
             return;
       }

        Node tempNode=head;
       for(int i=0;i<size;i++){
           System.out.print(tempNode.value);
           if(i<size-1)
           System.out.print("----> ");
           tempNode=tempNode.next;
       }
       System.out.println();
   }

   public void searchingCircular(int nodeValue){
        if(head==null){
            System.out.println("Crate the list first");
            return;
        }
        Node tempNode=head;
        int flag=1;
        for(int i=0;i<size;i++){
            if(tempNode.value==nodeValue){
                flag=0;
                System.out.println("The value "+nodeValue+"  found at location "+i+"");
                break;
            }
                tempNode=tempNode.next;
        }
        if(flag==1)
            System.out.println("The value "+nodeValue+" not found");
   }
      public void deletingCircular(int location){
        if(head==null || size==0) {
            System.out.println("NO list created");
            return;
        }
        else if(size==1){
            head.next=null;
            head=null;
            tail=null;
        }
        else if(location==0){
            head=head.next;
            tail.next=head;
        }
        else if(location==size-1){
            Node tempNode=head;
            int i=0;
            while(i<location-1){
                tempNode=tempNode.next;
                i++;
            }
            tempNode.next=head;
            tail=tempNode;

        }
        else if(location>=size){
            Node tempNode=head;
            int i=0;
            while(i<size-1){
                tempNode=tempNode.next;
                i++;
            }
            tempNode.next=head;
            tail=tempNode;
        }
        else
        {
            Node tempNode=head;
            int i=0;
            while(i<location-1){
                tempNode=tempNode.next;
                i++;
            }
            tempNode.next=tempNode.next.next;
        }
          System.out.println("Node Deleted successfully");
        size--;

      }
      public void deleteEntireList(){
        if(head==null || size==0){
            System.out.println("No need to delete Already deleted ");
            return;}
        else
        {
            tail.next=null;
            head=null;
            tail=null;
            size=0;
        }
          System.out.println("The list deleted successfully ");
      }

}
