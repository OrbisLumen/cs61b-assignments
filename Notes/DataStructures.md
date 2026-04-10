# Data Structure

## Linked Data Structures

1. IntNode (Basic Structure)

    ```java
    public class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int f, IntNode r) {
            item = f;
            next = r;
        }
    }
    ```
2. Generics List

    - Using `Generics` to build list

3. SLList (Singly Linked List) [(Here is the code)](./Blocks/SLList.md)
   
    ```
    (sentinel)
    +--------+     +--------+     +--------+     +--------+
    |   0    | --> |  item  | --> |  item  | --> |  item  | --> null
    +--------+     +--------+     +--------+     +--------+
    ```
    - Promotions :
      - `size`
      - `sentinel`
  
4. DLList (Doubly Linked List) (Circular Sentinel)
    
    ```
        +--------+      +--------+      +--------+      +--------+
        |sentinel| <--> |  item  | <--> |  item  | <--> |  item  |
        +--------+      +--------+      +--------+      +--------+
            ^                                               ^
            |_______________________________________________|
    ```

    - Promotions :
       - `last` (quicker access)
