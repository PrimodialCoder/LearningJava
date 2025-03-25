this BirdB is not having flyable interface instead it is having 2 different classes which are HighFlying and LowFlying
and it is having 2 different methods flyHigh and flyLow
now in each child class we will be creating an object of highfly or lo fly class and call the respective method to fly
it reduces redundency like if we are having 60 birds and 50 birds are flying high and 10 are flying low then we can create 2 classes and call the respective method instead going to each class and chaning fly functionality
but still there is an issue with this structure two concreet classes are dependent on each other this is tight coupling which is not good
what if a sparrow one day say from now I will fly high instead of low then we need to go to sparrow class and change the object creation and method call
which is not suitable for large applications
instead we can do the same thing by using a parent interface and its clild classes which is explained in BirdC its structure will be based on depend not depending class to class but depeneding on interface so that we can create an object of interface and call the method of interface which are implemented in to inplemented classes highFly and lowFly

\\
now here in birdC I have created an interface FlyingBehaviour which got implemented in to HighFlying and LowFlying classes and in every bird class I have created an object of highfly or lowfly classes but the reference got saved in the interface variable