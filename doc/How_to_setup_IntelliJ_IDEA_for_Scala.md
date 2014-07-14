# How to setup IntelliJ IDEA for Scala

## Setup

1. Create Scala SBT project
2. Create directory structure
3. Add libraries to build.sbt (scalatest, scala-xml), see current
4. Open File -> Product structure..
5. Define JDK for the project
6. Libraries: add scalatest, scala-xml (after downloaded as jar)
7. Remove scala-library-src.jar, it is not needed and also missing
8. Configure directory types at the Modules section
9. Facets -> Scala -> Choose 2.11, select Compiler options for better debug

## Start coding

1. Create package under test\scala
2. Create test class
3. Setup run: add Scalatest, choose Test kind: All in project
4. Add a test like assert(true), Run
5. On success the IDE is prepared for development :)

*Note:* IntelliJ IDEA 14 EAP, Scala 2.11, Scalatest 2.11, Scala-XML 2.11-...-RC3