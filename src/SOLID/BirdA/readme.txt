in this birdA package we have made a flyable interface and it is implemented by all child classes of birdA class which want to implement flyable behavior. defines it functionality in there own way.
this will help maintaining OCP, SRP and LSP are maintained but still there is a problem
with DIP :
1. every class which wants to implement flyable behavior has to implement fly method which is not good it creates redundency and also if we want to change the fly method we have to change it in all the classes which is not good.
2. if we want to add a new behavior like swimable then we have to add a new interface and implement it in all the classes which is not good.


now go to BirdB package and see how we can solve the problem of redundency but still it is partially usefull. read readme.txt in BirdB package.
*/