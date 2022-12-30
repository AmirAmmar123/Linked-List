# Data-structure-Linked-List
A classic Linked List

the courser is additional pointer, dynamical moved by 
the insertion or the deletion of an object inside the list 
void insert (T newElement )
Precondition:  newElement is not null.
Postcondition: Inserts newElement into the list. If the list is not empty, then inserts newElement after the cursor. Otherwise, inserts newElement as the ﬁrst (and only) element in the list. In either case, moves the cursor to newElement.

T remove ()
Precondition: NONE
Postcondition: Removes the element marked by the cursor from the list. If the resulting list is not empty, then moves the cursor to the element that followed the deleted element. If the deleted element was at the end of the list, then moves the cursor to the beginning of the list. Returns the deleted element, or null if the list was empty.

T remove (T element)
Precondition: NONE
Postcondition: Removes element from the list. Moves the cursor to the element that followed the deleted element. If the deleted element was at the end of the list, then moves the cursor to the beginning of the list. Returns the deleted element, or null if it did not exist in the list.
If this element appears several times, removes the first occurrence of it.

void clear ( )
Precondition: None.
Postcondition: Removes all the elements in a list.

void replace ( T newElement )
Precondition: List is not empty and newElement is not null. 
Postcondition: Replaces the element marked by the cursor with newElement. The cursor remains at newElement

boolean isEmpty ( )
Precondition: None.
Postcondition: Returns true if the list is empty. Otherwise, returns false.

boolean goToBeginning ( )
Precondition: None.
Postcondition: If the list is not empty, then moves the cursor to the beginning of the list, and return true. Otherwise, returns false.

boolean goToEnd ( )
Precondition: None.
Postcondition: If the list is not empty, then moves the cursor to the end of the list. Otherwise, returns false.

T getNext ( )
Precondition: NONE
Postcondition: If the cursor is not at the end of a list, then moves the cursor to the next element and returns it. Otherwise, returns null.

T getPrev ( )
Precondition: NONE.
Postcondition: If the cursor is not at the beginning of a list, then moves the cursor to the preceding element and returns it. Otherwise, returns null.

boolean hasNext ( )
Precondition: NONE
Postcondition: If the cursor is not at the end of the list then returns true. Otherwise, returns false.
If the list is empty, returns false.

boolean hasPrev ( )
Precondition: NONE.
Postcondition: If the cursor is not at the beginning of the list then returns true. Otherwise, returns false.
If the list is empty, returns false.

T getCursor ( )
Precondition: NONE.
Postcondition: Returns the element marked by the cursor or null if the list is empty.
