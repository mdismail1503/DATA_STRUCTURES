public class DLL {
    public DNode head;
    public DNode tail;
    public int size;

    public DNode createDoubly(int nodeValue){
        head =new DNode();
//        tail=new DNode();
        DNode node=new DNode();
        node.value=nodeValue;
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size=1;
        System.out.println("Node created successfully");
        return head;

    }
    public void insertingDoubly(int nodeValue,int location){
       DNode node=new DNode();
       node.value=nodeValue;
       if(head==null){
           createDoubly(nodeValue);
           return;
       }
       else if(location==0){
           node.next=head;
           node.prev=null;
           head.prev=node;
           head=node;

       }
       else if(location>=size){
           tail.next=node;
           node.prev=tail;
           tail=node;
       }
       else{
           DNode tempNode=head;
           int i=0;
           while (i<location-1){
               tempNode=tempNode.next;
               i++;
           }
           DNode nextNode=tempNode.next;
           tempNode.next=node;
           node.prev=tempNode;
           node.next=nextNode;
           nextNode.prev=node;
       }
        System.out.println("Inserted successfully ");
       size++;
    }
    public void traverseDoubly(){
        if(head==null){
            System.out.println("no linked list created ");
            return;
        }
        DNode tempNode=head;
        int i=0;
        while(i<size){
            System.out.print(tempNode.value);
            if(i<size-1)
                System.out.print(" --> ");
            tempNode=tempNode.next;
            i++;
        }
        System.out.println();
    }

    public void reverseDoubly(){
        if(tail==null){
            System.out.println("NO linked list crated ");
            return;
        }
        DNode tempNode=tail;
        int i=0;
        while(i<size){
            System.out.print(tempNode.value);
            if(i<size-1)
                System.out.print(" <-- ");
            tempNode=tempNode.prev;
            i++;
        }
        System.out.println();
    }
    public void searchingDoubly(int val){
        if(head==null){
            System.out.println("LIst doesn't exist");
            return;
        }
        DNode temp=head;
        int i=0;
        while(i<size-1){
            if(temp.value==val){
                System.out.println(""+val+" is found at loc "+i+" ");
                return;
            }
            i++;
        }
        System.out.println("Value Not Found ");
    }
  public void deleteDoubly(int location){
        if(head==null || size==0)
        {
            System.out.println("Nodes doesn't exist");
            return;
        }
        else if(size==1){
           head=null;
           tail=null;
        }
        else if(location==0){
            head.next.prev=null;
            head=head.next;
        }
//        else if(location==size-1){
//
//        }
        else if(location>=size || location==size-1 ){
//            tail.prev=null;
            tail=tail.prev;
            tail.next=null;
        }
        else
        {
            DNode temp=head;
            int i=0;
            while(i<location-1){
                temp=temp.next;
                i++;
            }
              temp.next=temp.next.next;
              temp.next.prev=temp;

        }
      System.out.println("Node deleted Successfully ");
        size--;
  }
  public void deleteEntire(){
      DNode temp=head;
      int i=0;
      while(i<size-1){
          temp.prev=null;
          temp=temp.next;
          i++;
      }
   head=null;
   tail=null;
      System.out.println("Entire List deleted Successfully ");
     size=0;

  }
}
