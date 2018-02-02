
===== README.txt ========
Assignment: PLTW 2.2.4
Date: 2/1/18
Team Members: Hannah Edge, CJ Yu
Description:
This assignment was a lesson in polymorphism (please summarize what you learned based on topics covered.
Team member roles in assignment: (Who did what)
Key Lessons learned:
Summarize what you think important teaching points from the lesson were.  


Part I: The Animals Speak
Add the following two lines after your instantiation.
1   this.output.append("\nDuck say ");
2   this.output.append("\nFish goes ");
What does the escape sequence “\n” do?


Making sure that all of your output happens at the end of the onCreate method, replace fish.say() in your code with animals.get(1).say().
Is your output still the same? Why or why not? If it is not, fix it so that it is.


Replace animals.add(fish); with animals.add(duck);.
How is your output affected? Do you know why?


Add the following statement to find out what's going on:
1  this.output.append("\nThe object at index 1: " + animals.get(1));
What type of object is stored at index 1?


 Add a for each loop that accomplishes the same output as in the previous step. (If you made a for each loop in the previous step, add a regular for loop.) Verify that the outputs of the two loops are the same. Which do you like better and why? 
 
 Add one method to this interface called play that returns a String.
You do not need to include an access modifier when creating a method signature in an interface. Why?
 
Add the following statement to AnimalActivity within your for each loop:
1  this.output.append("\n" + a.play());
Is this a problem? If so, remove it and explain why.
 
 Add the following code within one of your for loops to get your Seal to play.
1              if (a instanceof Seal) {
2                  this.output.append("\n" + ((Seal)a).play());
3              }
What do you think the code above is doing?
 
 Does your Fox class have any errors? It should! Why should it have an error? 
 
Modify your for loop to produce the output below using as few characters in your String literals as possible.
 
Why would it be easier to modify the for each loop to do this?



Part II: CollegeApp Uses Polymorphism to Display FamilyMembers
Add the following log statement to the getView method of FamilyMemberAdapter after the assignment to f shown.
1  FamilyMember f = getItem(position);
2  Log.d(TAG, "The type of FamilyMember at position " + position + " is " + f.getClass().getName());
What type of object is f in each of the log messages when you run the program, and what does this mean?

 
Conclusion
Explain in your own words what you think polymorphic behavior is.




What is the biggest advantage for creating a polymorphic list, and what is the biggest disadvantage?



Compare and contrast: abstract classes vs. interfaces.

 
