**Why does LinkedStack not require an explicit constructor?**

LinkedStack does not need an explicit constructor because java has a default constructor where nothing is initialized. This is works because everything that can be done in a LinkedStack including creating the first node can be done with the methods in the class. 

**What is the time and (extra) space complexity of each of the LinkedStack methods, as well as ReverseLines.main?**

For all the methods except asList() in the LinkedStack class the time complexity is O(1), the space complexity is also O(1) meaning that for the push() method all you need to do is create another node which is a constant addition of space. For the other methods in the class, no additional space needs to be added for them to run. The asList() has a time and space complexity of O(n) because the loop needs to be run as many times as there are elements and additionally, that amount of space needs to be created to store the elements. In the ReverseLines the time complexity is O(n) because the loop only has to go for the n number of lines the user enters. The space complexity is also O(n) because for every string the user enters only that much space has to be used to create the stack. 

**How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?**

We could have implemented the LinkedStack with an ArrayList, so that with each of the methods we push, pop, and peek the last item, yet still maintaining an ArrayList while making the stack and then when we have to call the asList() method the already created ArrayList is called and the complexity is O(1). 

**Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design.** 

If the push and pop methods return just the top item it would make the methods pretty fast O(1). If they return the whole stack it would slow them down considerably to O(n). Additionally a Stack is meant to be used to deal with things in a LIFO method and the contents of the rest of the stack are not important until the ones before then are done. I can not think of any pros of returning the whole stack as each method still has to be dealt with individually. For these reasons returning only the top item of the stack is the better option.  

