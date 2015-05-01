# Storm-Dev-Testing-Framework
Main purpose of this framework to complete the business logic as fast as possible with all test cases coverage.

This is a very simple storm Development and testing framework which can really reduce the development time without need to write full topology code and worrying about other bolt's processing part to get completed first. Additionally, you can build full-fledged bolt specific unit test cases.
 
This development framework can mimic storm topology running behavior (Local Cluster Mode Style) and can also mimic tuple style data types. I am using below mentioned libraries in this project-

 - jeromq-0.3.4.jar
 - jackson-annotations-2.1.2.jar
 - com.fasterxml.jackson.core.jar
 - com.fasterxml.jackson.databind.jar
 -
Once development work is completed in these template execute() method, you can move into real topology for integration testing or simply call those tested helper class from real bolts.

How to use this project ?
Steps-
- Open Tuple Class and define your own tuples there along with getter and setters.
- Open ExampleBolt and complete your business logic in execute Method.
- Run ExampleBolt class once you have written business logic there. Once started no need to stop it (similar to Storm Local cluster mode).
- Supply Test inputs through ExampleBoltTest.java class.
