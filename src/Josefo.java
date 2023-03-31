public class Josefo {
    /**
     *
     *@param	m	indica	la	cantidad	de	lugares	antes	de	sacar	una	persona,	este
    valor	puede	ser	negativo	y	indica	la	dirección	con	la	cual	se	recorre	la
    ronda.
     *@param	colIntegrantes	los	integrantes	participantes	del juego,	es	una
    lista	de	enteros.
     *@throws	IllegalArgumentsException	cuando	la	cantidad	m	es	mayor	que
    el	total	de	integrantes
     *	@return	la	lista	de	jugadores	que	fueron	eliminados	en	el	orden	de
    eliminación
     */
    public	CircularLinkedList juego(int	m,	CircularLinkedList	colIntegrantes)	{
        Node coso= colIntegrantes.head;
        while (colIntegrantes.size()!=1){
            for(int posicion=1;coso.next!=colIntegrantes.head;posicion++){
                
            }
        }
    };
}
