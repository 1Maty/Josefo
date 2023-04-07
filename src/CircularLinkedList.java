class CircularLinkedList<T> implements Lista<T> {
    public Node head;
    @Override
    public T get(int position) {
        Node coso=head;
        T respuesta = null;
        for(int indice=0;coso.next!=head;indice++){
            if(indice==position){
                respuesta= (T) coso.data;
            }
            coso=coso.next;
        }
        return respuesta;
    }

    @Override
    public void add(T value) {
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
            while(coso.next!=head){
                coso=coso.next;
            }
            coso.next=head.next;
        head=head.next;
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
        for(tamaño=1;coso.next!=head;tamaño++){
            coso=coso.next;
        }
        return tamaño;
    }
    public int posicion(T value){
        Node coso=head;
        int lugar = -1;
        int tamaño=0;
        for(int indice=0;coso.next!=head;indice++){
            if(coso.data==value){
                lugar=indice;
            }
            coso=coso.next;
            tamaño++;
        }
        if(lugar==-1){
            lugar=tamaño;
        }
        return lugar;
    }
    public void mostrar(){
        Node coso = head;
        while(coso.next!= head){
            System.out.println(coso.data);
            coso=coso.next;
        }
        System.out.println(coso.data);
    }

    public static void main(String [] args){
        CircularLinkedList listita= new CircularLinkedList();
        listita.add(10);
        listita.add(20);
        listita.add(30);
        listita.add(40);
        listita.add(50);
        listita.remove((0));
        listita.mostrar();
    }
}
