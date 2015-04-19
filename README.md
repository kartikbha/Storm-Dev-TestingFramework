# Storm-Dev-TestingFramework

This very simple storm Dev and Testing framework which can really boost the development process without need to write full topology code.
I am using below libraries in this project. This Dev framework can mimic storm running behaviour and can also mimic tuple style data types inputs..

 - jeromq-0.3.4.jar
 - jackson-annotations-2.1.2.jar
 - com.fasterxml.jackson.core.jar
 - com.fasterxml.jackson.databind.jar
 - 
 
Once development work is over in these template, you can move into real topology for integration testing.

How to use this project ?
Open Tuple Class and define your own tuples and getter and setters.
Open ControlBolt and complete your business logic there.
Run Class ControlBolt once you have written code there and run it. Once started No need to stop it !!
Supply Test inputs through ControlBoltJunitTest.java class
