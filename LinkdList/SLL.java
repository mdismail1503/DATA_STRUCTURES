public class SLL {
    public Node head;
    public Node tail;  // Because both head and tail will point to the node
    public  int size;  //every time we add a node to the list we increase the size of list..

    public Node createSinglyLinkedList(int nodeValue){
    head=new Node();
    tail=new Node();
    Node node=new Node();
    node.next=null;
    node.value=nodeValue;
    head=node;
    tail=node;
   this. size=1;

    return  head;


    } //We always return the head reference..that's why we take type as Node here..

    //Insert Method:

    public Node sum(Node head){
        if(head==null){
            return null;
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp. next;
        }
        if(count%2==0){
            count=count/2;
        }
        else{
            count=count/2 +1;
        }
        int num1=0;
        int tempo=0;
        Node t=head;
        for(int i=0;i<count;i++){
            num1=num1*10+t.value;
            t=t.next;
        }
        while(t!=null){
            tempo=tempo*10+t.value;
            t=t.next;
        }
        int num2=0;
        while(tempo!=0){
            num2=num2*10+tempo%10;
            tempo=tempo/10;
        }




        int xx=num1+num2;
        System.out.println(xx);
        StringBuilder sb=new StringBuilder(Integer.toString(xx));
        sb.reverse();
        int fin=Integer.parseInt(sb.toString());
        System.out.println(fin);
//        Node node = new Node();
//        System.out.println(node.value);
        Node node=new Node();
        node.value=fin%10;
        fin=fin/10;
        while(fin>0){

            push(node,fin%10);
            fin=fin/10;
        }

return node;

    }
    public Node push(Node n,int val){
        Node node=new Node();
        node.value=val;
        if(n==null){
            return null;
        }
    Node temp=n;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return node;

    }
    public void insertIntLinkedList(int nodeValue,int location){
        Node node =new Node();
        node.value=nodeValue;
        if(head==null){        //Here we are checking that if the linked list is created or not if it is not created then we create it and return..
            createSinglyLinkedList(nodeValue);
            System.out.println("Node created");
            return;
        }
        else if(location==0){   //This is if we are keeping node at the beginning of the linked list..;
            node.next=head;
            head=node;
        }

        //If the location parameter is > size parameter that means we have put node at the end of the list..
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }

          //For specified location:Looping through the linkedlist..

        else{
                Node tempNode=head;  //Because we need to start form the head..
                int index=0;
                while(index<location-1)
                {
                   tempNode=tempNode.next;
                   index++;
                }     //When this loop is finished the tempNode will be referencing to the node after which we should insert a node...
                      //head means node number 0;
            Node nextNode=tempNode.next;
              tempNode.next=node;
              node.next=nextNode;
        }
       size++;

    }

    // TRAVERSING THROUGH THE LIST..
    public void traverseSingleLinkedList(){
        if(head==null)
        {
            return;
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++)
            {
                System.out.print(tempNode.value);
//                if(tempNode.next==null)
//                    break;
                if(i<size-1)
                System.out.print(" ---> ");
                tempNode=tempNode.next;
            }
            System.out.println();

        }
    }
    public void traversory(Node head){
        if(head==null)
        {
            return;
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++)
            {
                if(tempNode==null)
                    return;
                System.out.print(tempNode.value);
//                if(tempNode.next==null)
//                    break;
                if(tempNode.next!=null)
                    System.out.print(" ---> ");
                tempNode=tempNode.next;
            }
            System.out.println();

        }
    }
    // SEARCHING FOR A VALUE IN LINKEDLIST..
    public boolean searchingValueInLinkedList(int x){

        Node tempNode=head;
        int flag=1;
        if(head==null)
            return false;
        for(int i=0;i<size;i++)
        {
            if(tempNode.value==x){
                flag=0;
                System.out.println("Value "+x+"found");
                break;}
            tempNode=tempNode.next;
        }
        if(flag==1)
            System.out.println(" Value "+x+" not found");

        return false;
    }
    // DELETING A NODE IN LINKEDLIST...
    public void deletionOfNode(int location){
        if(head==null) {
            System.out.println("The SLL doesn't exist ");
            return;
        }
        else if(location==0)
        {
            if(size==1)
            {
                head=null;
                tail=null;
            }
            else {
                head=head.next;
            }
            size--;
        }
        else if(location==size-1){
            Node tempNode=head;
            int i=0;
            while(i<location-1){
                tempNode=tempNode.next;
                i++;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;

        }
        else if(location>=size)
        {
            Node temp=head;
            int i=0;
           while(i<size-1) {
               temp = temp.next;
               i++;
           }

            if(size==1 || temp==head)
            {
                head=tail=null;
                size--;
                return;
            }

            temp.next=null;
            tail=temp;
            size--;
        }
        else{
            Node tempNode=head;
            int i=0;
            while(i<location-1)
            {
                tempNode=tempNode.next;
                i++;
            }
            tempNode.next=tempNode.next.next;
//            tail=tempNode.next.next;
            size--;
        }
        System.out.println("Deleted Successfully");


    }
    // Deleting entire LinkedList

    public void  deleteLinkedList(){
        head=null;
        tail=null;
        System.out.println("Deleted successfully ");
        size=0;
    }


}
