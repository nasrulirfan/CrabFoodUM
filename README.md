# CrabFoodUM
CrabFood is
a Java application that manages and keeps track of daily delivery order for crabs to ensure
the efficiency of delivery services, just think about GrabFood.

## Requirements

- To read the input file and get the information of location of restaurant / order of
customers / time of preparation and delivery
- To set up the map of the branches of restaurants.
- To process the order of customers and distribute them to different branch of
restaurants.
- To calculate the preparation and delivery time for each order.

## Solution

To solve the tasks on the list above, we developed a Java program using several
different command and data structure.\
We used the Buffered Reader Class to get the information from the input file, split the location
input to get the location parameters (x , y) in 2D, and then we set up the map by using
an array of char.\
As for the dishes, we used an ArrayList to represent the restaurant, and in each
element of this ArrayList, is another ArrayList which represent the dishes and the
preparation time.
Moving on to customers, we still used ArrayList to solve the problem. But there is a
the slight difference between this ArrayList and the others, because every time we finished
with one customer, we delete the information about him, this means we don’t need to
go over on him again, and that makes our program more efficient.\
We also made a program to find out the least busy restaurant for a certain order of
dish, which means the customers can get their dishes faster by using Queue and ArrayList.
Finally, we calculate the time by adding the preparation time and delivery time
(calculated from the distance from the restaurant to (0 , 0) ).

## FlowChart 
![FlowChart](https://github.com/TehHatrix/CrabFoodUM/blob/master/Flowchart.jpg?raw=true)
## Output
![Output](https://github.com/TehHatrix/CrabFoodUM/blob/master/Output.jpg?raw=true)
