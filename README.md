# Gradle Multi-project Example
Simple multiproject gradle example

Clone project, then run

```
  gradlew jettyRunWar
```  
  
And browse to http://localhost:8080/thewebapp/

## issues
* ```eclipse``` task creates appropriate Eclipse projects which compile BUT deployed dynamic web app does not work as compiled code from utillib project is not correctly copied to WEB-INF folder




