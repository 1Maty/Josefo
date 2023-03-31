class CircularLinkedList implements Lista {
    public Node head;
    @Override
    public int get(int position) {
        Node coso=head;
        int respuesta=-40;
        for(int indice=0;coso.next!=head;indice++){
            if(indice==position){
                respuesta=coso.data;
            }
            coso=coso.next;
        }
        return respuesta;
    }

    @Override
    public void add(int value) {
        Node nuevo=new Node();
        nuevo.data=value;
        if(head==null){
            head=nuevo;
            nuevo.next=head;
        }
        else {
            Node coso = head;
            while (coso.next != head) {
                coso = coso.next;
            }
            nuevo.next=head;
            coso.next = nuevo;
        }
    }

    @Override
    public void remove(int position) {
        Node coso=head;
        if(position==0){
            for(int indice=0;coso.next!=head;indice++){
                coso=coso.next;
            }
            head=coso.next.next;
        }
        else {
            for (int indice = 0; coso.next != head; indice++) {
                if (position-1== indice) {
                    coso.next = coso.next.next;
                }

                coso = coso.next;}
        }
    }
    public int size(){
        Node coso=head;
        int tamaño;
        for(tamaño=0;coso.next!=head;tamaño++){
            coso=coso.next;
        }
        return tamaño;
    }
    //como la recorro, si el siguiente es la cabeza llegue al ultimo
    public static void main(String [] args){
        CircularLinkedList listita= new CircularLinkedList();
        listita.add(10);
        listita.add(20);
        listita.add(30);
        listita.add(40);
        listita.add(50);
        listita.remove(0);
        Node coso = listita.head;
        while(coso.next!= listita.head){
            System.out.println(coso.data);
            coso=coso.next;
        }
        System.out.println(listita.size());
    }
}
