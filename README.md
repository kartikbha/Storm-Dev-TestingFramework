# Storm-Dev-TestingFramework

This is  a very simple storm Development and Testing framework which can really reduce the development time without need to write full topology code and worring about other bolt's processing part to get completed first. Addoitionally, you can build full fledged bolt specific unit test cases.

This dev framework can mimic storm topology running behaviour (Local Cluster Mode Style) and can also mimic tuple style data types. I am using below mentioned libraries in this project-

 - jeromq-0.3.4.jar
 - jackson-annotations-2.1.2.jar
 - com.fasterxml.jackson.core.jar
 - com.fasterxml.jackson.databind.jar
 - 
 
Once development work is completed in these template, you can move into real topology for integration testing.

How to use this project ?

Steps-

- Open Tuple Class and define your own tuples  there along with getter and setters.
- Open ControlBolt and complete your business logic in execute Method.
- Run ControlBolt class once you have written business logic there. Once started No need to stop it (similar to  Storm Local cluster mode).
- Supply Test inputs through ControlBoltJunitTest.java class.
