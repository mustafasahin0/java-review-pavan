**Methods in Collection(I)**

1)add(Object o)
2) addAll(Collection c)
3) remove(Object o)
4) removeAll(Collection c)
5) retainAll(Collection c)
6) clear()
7) isEmpty()
8) size()
9) contains(Object c)
10) containsAll(Collection c)
11) toArray(Collection c)

All above methods available in List(I), Set(I), Queue(I)

**List**



1) add(Object o)
2) add(index, Object o)
3) addAll(Collection c)
4) addAll(index, Collection c)
5) remove(Object c)
6) remove(index)
7) get(index) --> Object
8) set(index, Object o) --> rephrase the existing object with the new one

_a)ArrayList
b)LinkedList


-Collection(I)
    -List(I)
        -ArrayList
    -Set(I)
    -Queue(I)


List: Duplicates are allowed and insertion order is preserved.
ArrayList: Same as above.

`ArrayList al = new ArrayList();
`
- 10 is default location allocated.
- Growable in nature

`ArrayList<String> al = new ArrayList<>()

**Linked List**


List(I) ---> LinkedList(C) <---- Deque (I) <------ Queue(I

If we have retriving ve can prefer ArrayList
If we have insertion and deleten we can go for LinkedList

Arralist store elements in consecutive order

LinkedList consists of nodes

