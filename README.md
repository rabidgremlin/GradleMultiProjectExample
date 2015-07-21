# Gradle Multi-project Example
Simple multiproject gradle example.

This branch has two web apps and uses getty to run them

Clone project, switch to ```twowebapps``` branch, create/edit gradle.properties (see below) then run

```
  gradlew farmRun
```  

And browse to:
* http://localhost:8080/thewebapp/
* http://localhost:8080/otherwebapp/

Gretty supports hot deploy automatically so changes can be made to resources (.jsps etc) and Java code. Watch console for deployment/error messages

## gradle.poperties
You will need to create/edit a ```gradle.properties``` file at the roor of the project and set the ```testProp``` system variable. eg

```
systemProp.testProp=My Test Prop
```

## issues
* ```eclipse``` task creates appropriate Eclipse projects which compile BUT deployed dynamic web app does not work as compiled code from utillib project is not correctly copied to WEB-INF folder
* Hot deploy does not work for dependent projects eg changes to ```utillib``` don't hot deploy. Requires restart (eg stop and restart ```gradlew farmRun```)
