## 1. Advantages
- Easy to manage and develop applications 
- Classes and objects are independent of each other
- Each object has different responsibilities

##	Disadvantages
- Model can be complex
- Inefficient access of data in view  

## 2. Advantages
- All the views share a display method so you only need to make changes to one instead of two

## 	Disadvantages
- Tests can be more difficult to perform as you require the dependencies to be directly embedded in the code

## 3. Advantages
- Observers can be added or removed at anytime
- Data can be sent effectively without making any changes between the subject and observer

## 	Disadvantages
- Can lead to inadvertent complexity and performance issues if not implemented correctly 
- There is no option for composition since the observer interface can be instantiated  
